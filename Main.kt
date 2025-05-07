fun main() {
    println("Digite o nome do Treinador 1: ")
    val nomePlayer1 = readln()
    println("Digite o nome do Treinador 2: ")
    val nomePlayer2 = readln()

    println("A batalha será entre:")
    println("Treinador 1: $nomePlayer1")
    println("Treinador 2: $nomePlayer2")

    println("Pressione a tecla ENTER para prosseguir com a batalha ")
    readln()

    val pokemonsNivel1a19 = mutableListOf<String>()
    val pokemonsNivel20a49 = mutableListOf<String>()
    val pokemonsNivel50a100 = mutableListOf<String>()

    mapaPokemons.forEach { chave, valor ->
        val nivel = valor["NIVEL"]?.toString()?.toIntOrNull()
        when {
            nivel in 1..19 -> pokemonsNivel1a19.add(chave)
            nivel in 20..49 -> pokemonsNivel20a49.add(chave)
            nivel in 50..100 -> pokemonsNivel50a100.add(chave)
        }
    }

    println("Escolha o nível para a batalha:")
    println("1 - Nível 1 (1 ao 19)")
    println("2 - Nível 2 (20 ao 49)")
    println("3 - Nível 3 (50 ao 100)")

    val nivelEscolhido = readln().toIntOrNull()

    val pokemonsDisponiveis = when (nivelEscolhido) {
        1 -> pokemonsNivel1a19
        2 -> pokemonsNivel20a49
        3 -> pokemonsNivel50a100
        else -> {
            println("Opção inválida! Encerrando o programa.")
            return
        }
    }

    if (pokemonsDisponiveis.isEmpty()) {
        println("Nenhum Pokémon disponível nessa liga.")
        return
    }

    val timePlayer1 = mutableListOf<String>()
    val timePlayer2 = mutableListOf<String>()

    for (i in 1..3) {
        println("\n===== Rodada $i =====")

        mostrarPokemonsDisponiveis(pokemonsDisponiveis)
        escolherPokemon(timePlayer1, nomePlayer1, pokemonsDisponiveis)

        mostrarPokemonsDisponiveis(pokemonsDisponiveis)
        escolherPokemon(timePlayer2, nomePlayer2, pokemonsDisponiveis)
    }

    println("\n🔔 Times prontos para a batalha!")
    println("$nomePlayer1: ${timePlayer1.joinToString(", ")}")
    println("$nomePlayer2: ${timePlayer2.joinToString(", ")}")

    timePlayer1.shuffle()
    timePlayer2.shuffle()

    var i = 0
    var derrotadosPlayer1 = 0
    var derrotadosPlayer2 = 0

    while (i < 3 && derrotadosPlayer1 < 3 && derrotadosPlayer2 < 3) {
        val nomePoke1 = timePlayer1[0]
        val nomePoke2 = timePlayer2[0]

        val poke1 = mapaPokemons[nomePoke1]!!
        val poke2 = mapaPokemons[nomePoke2]!!

        println("\nDuelo ${i + 1}: $nomePoke1 vs $nomePoke2")
        val resultado = duelar(poke1, poke2, nomePoke1, nomePoke2, nomePlayer1, nomePlayer2)
        println("Resultado: $resultado")

        if (resultado.contains(nomePoke1)) {
            derrotadosPlayer2++
            timePlayer2.removeAt(0)
        } else if (resultado.contains(nomePoke2)) {
            derrotadosPlayer1++
            timePlayer1.removeAt(0)
        }

        if (derrotadosPlayer1 < 3 && derrotadosPlayer2 < 3) {
            trocaPokemon(nomePlayer1, timePlayer1, mapaPokemons)
            trocaPokemon(nomePlayer2, timePlayer2, mapaPokemons)
        }

        i++
    }

    if (derrotadosPlayer1 >= 3 && derrotadosPlayer2 >= 3) {
        println("O jogo terminou em empate!")
    } else if (derrotadosPlayer2 >= 3) {
        println("$nomePlayer1 venceu a partida!")
    } else if (derrotadosPlayer1 >= 3) {
        println("$nomePlayer2 venceu a partida!")
    }
}

fun mostrarPokemonsDisponiveis(pokemons: List<String>) {
    println("\nPokémons disponíveis:")
    pokemons.forEachIndexed { index, pokemon ->
        print("${index + 1} - $pokemon\t")
        if ((index + 1) % 6 == 0) println()
    }
    println()
}

fun escolherPokemon(
    timePlayer: MutableList<String>,
    nomePlayer: String,
    pokemonsDisponiveis: MutableList<String>
) {
    println("$nomePlayer, escolha seu Pokémon (digite o número):")
    val escolha = readLine()?.toIntOrNull()

    if (escolha != null && escolha in 1..pokemonsDisponiveis.size) {
        val pokemonEscolhido = pokemonsDisponiveis[escolha - 1]
        timePlayer.add(pokemonEscolhido)
        pokemonsDisponiveis.removeAt(escolha - 1)
        println("$nomePlayer escolheu: $pokemonEscolhido\n")
    } else {
        println("Escolha inválida. Tente novamente.")
        escolherPokemon(timePlayer, nomePlayer, pokemonsDisponiveis)
    }
}

fun calcularDano(ataque: List<Any>, desvantagensOponente: List<String>, resistenciasOponente: List<String>): Pair<Double, String> {
    val danoBase = ataque[1] as Double
    val tipoAtaque = ataque[2] as String

    val multiplicador = when {
        desvantagensOponente.contains(tipoAtaque) -> 1.5
        resistenciasOponente.contains(tipoAtaque) -> 0.5
        else -> 1.0
    }

    val efetividade = when (multiplicador) {
        1.5 -> "É super efetivo!"
        0.5 -> "Não é muito efetivo..."
        else -> ""
    }

    return Pair(danoBase * multiplicador, efetividade)
}

fun duelar(
    pokemon1: Map<String, Any>,
    pokemon2: Map<String, Any>,
    nomePokemon1: String,
    nomePokemon2: String,
    nomePlayer1: String,
    nomePlayer2: String
): String {
    var vidaPokemon1 = pokemon1["VIDA"] as Int
    var vidaPokemon2 = pokemon2["VIDA"] as Int

    val ataques1 = pokemon1["ATAQUES"] as Map<Int, List<Any>>
    val ataques2 = pokemon2["ATAQUES"] as Map<Int, List<Any>>

    val desvantagens1 = pokemon1["DESVANTAGENS"] as List<String>
    val resistencias1 = pokemon1["RESISTÊNCIAS"] as List<String>

    val desvantagens2 = pokemon2["DESVANTAGENS"] as List<String>
    val resistencias2 = pokemon2["RESISTÊNCIAS"] as List<String>

    while (vidaPokemon1 > 0 && vidaPokemon2 > 0) {
        val ataque1 = escolherAtaque(pokemon1, nomePokemon1)
        val ataque2 = escolherAtaque(pokemon2, nomePokemon2)

        val (dano1, efetividade1) = calcularDano(ataque1, desvantagens2, resistencias2)
        val (dano2, efetividade2) = calcularDano(ataque2, desvantagens1, resistencias1)

        vidaPokemon2 -= dano1.toInt()
        vidaPokemon1 -= dano2.toInt()

        println("\n⚔️ $nomePokemon1 usou ${ataque1[0]} causando ${dano1.toInt()} de dano a $nomePokemon2. Vida restante: ${vidaPokemon2.coerceAtLeast(0)}. $efetividade1")
        println("⚔️ $nomePokemon2 usou ${ataque2[0]} causando ${dano2.toInt()} de dano a $nomePokemon1. Vida restante: ${vidaPokemon1.coerceAtLeast(0)}. $efetividade2")
    }

    return when {
        vidaPokemon1 <= 0 && vidaPokemon2 <= 0 -> "Empate!"
        vidaPokemon1 <= 0 -> "$nomePokemon2 do $nomePlayer2 venceu!"
        else -> "$nomePokemon1 do $nomePlayer1 venceu!"
    }
}

fun escolherAtaque(pokemon: Map<String, Any>, nomePokemon: String): List<Any> {
    val ataques = pokemon["ATAQUES"] as Map<Int, List<Any>>
    println("\n$nomePokemon — Escolha o ataque:")
    ataques.forEach { (index, ataque) ->
        println("$index: ${ataque[0]} (Dano: ${ataque[1]}, Tipo: ${ataque[2]})")
    }

    var escolha: Int
    while (true) {
        print("Digite o número do ataque: ")
        escolha = readln().toIntOrNull() ?: -1
        if (ataques.containsKey(escolha)) break
        println("Opção inválida. Tente novamente.")
    }
    return ataques[escolha]!!
}

fun trocaPokemon(nome: String, time: MutableList<String>, mapaPokemons: Map<String, Map<String, Any>>) {
    println("\n$nome, quer trocar de Pokémon? (s/n)")
    if (readLine()?.lowercase() == "s") {
        println("Seu time atual:")
        time.forEachIndexed { index, pokemon ->
            val vida = mapaPokemons[pokemon]?.get("VIDA") as? Int ?: 0
            val status = if (vida > 0) " (Vida: $vida)" else " (Desmaiado)"
            println("${index + 1} - $pokemon$status")
        }
        println("Escolha o número do Pokémon que entrará em campo:")

        while (true) {
            val escolha = readLine()?.toIntOrNull()
            if (escolha != null && escolha in 1..time.size) {
                val escolhido = time[escolha - 1]
                val vida = mapaPokemons[escolhido]?.get("VIDA") as? Int ?: 0
                if (vida <= 0) {
                    println("⚠️ Seu Pokémon está desmaiado! Escolha outro.")
                } else {
                    time.removeAt(escolha - 1)
                    time.add(0, escolhido)
                    println("$nome trocou para: $escolhido")
                    break
                }
            } else {
                println("Escolha inválida. Tente novamente.")
            }
        }
    }
}
