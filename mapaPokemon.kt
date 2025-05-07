
// Fórmula de vida: VIDA = 60 + NIVEL * 2

val bulbasaur = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "PSÍQUICO", "GELO", "VOADOR"),
    "NIVEL" to 20,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Tackle", 35.0, "NORMAL"),
        2 to listOf("Razor Leaf", 45.0, "GRAMA"),
        3 to listOf("Vine Whip", 60.0, "GRAMA"),
        4 to listOf("Leech Seed", 25.0, "GRAMA")
    )
)

val ivysaur = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "PSÍQUICO", "GELO", "VOADOR"),
    "NIVEL" to 40,
    "VIDA" to 140,
    "ATAQUES" to mapOf(
        1 to listOf("Tackle", 40.0, "NORMAL"),
        2 to listOf("Razor Leaf", 60.0, "GRAMA"),
        3 to listOf("Vine Whip", 65.0, "GRAMA"),
        4 to listOf("Leech Seed", 30.0, "GRAMA"),
        5 to listOf("Bullet Seed", 50.0, "GRAMA"),
        6 to listOf("Giga Drain", 55.0, "GRAMA")
    )
)

val venusaur = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTA", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "PSÍQUICO", "VOADOR"),
    "NIVEL" to 85,
    "VIDA" to 230,
    "ATAQUES" to mapOf(
        1 to listOf("Tackle", 60.0, "NORMAL"),
        2 to listOf("Razor Leaf", 75.0, "GRAMA"),
        3 to listOf("Vine Whip", 85.0, "GRAMA"),
        4 to listOf("Leech Seed", 40.0, "GRAMA"),
        5 to listOf("Bullet Seed", 70.0, "GRAMA"),
        6 to listOf("Giga Drain", 80.0, "GRAMA"),
        7 to listOf("Solar Beam", 100.0, "GRAMA")
    )
)

val charmander = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 20,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Scratch", 30.0, "NORMAL"),
        2 to listOf("Ember", 40.0, "FOGO"),
        3 to listOf("Flamethrower", 50.0, "FOGO"),
        4 to listOf("Fire Ball", 40.0, "FOGO")
    )
)

val charmeleon = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 40,
    "VIDA" to 140,
    "ATAQUES" to mapOf(
        1 to listOf("Scratch", 40.0, "NORMAL"),
        2 to listOf("Ember", 50.0, "FOGO"),
        3 to listOf("Flamethrower", 65.0, "FOGO"),
        4 to listOf("Fire Ball", 50.0, "FOGO"),
        5 to listOf("Fire Fang", 55.0, "FOGO"),
        6 to listOf("Flame Burst", 60.0, "FOGO")
    )
)

val charizard = mapOf(
    "TIPOS" to listOf("FOGO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "FADA", "METAL", "LUTA"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "PEDRA"),
    "NIVEL" to 85,
    "VIDA" to 230,
    "ATAQUES" to mapOf(
        1 to listOf("Ember", 55.0, "FOGO"),
        2 to listOf("Flamethrower", 75.0, "FOGO"),
        3 to listOf("Fire Ball", 70.0, "FOGO"),
        4 to listOf("Fire Punch", 65.0, "FOGO"),
        5 to listOf("Fire Blast", 85.0, "FOGO"),
        6 to listOf("Air Slash", 60.0, "VOADOR"),
        7 to listOf("Wing Attack", 55.0, "VOADOR"),
        8 to listOf("Magma Storm", 90.0, "FOGO")
    )
)

val squirtle = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 20,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Headbutt", 20.0, "NORMAL"),
        2 to listOf("Bubbles", 25.0, "AGUA"),
        3 to listOf("Water Gun", 30.0, "AGUA"),
        4 to listOf("Water Ball", 35.0, "AGUA")
    )
)

val wartortle = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 40,
    "VIDA" to 140,
    "ATAQUES" to mapOf(
        1 to listOf("Headbutt", 30.0, "NORMAL"),
        2 to listOf("Bubbles", 35.0, "AGUA"),
        3 to listOf("Water Gun", 40.0, "AGUA"),
        4 to listOf("Water Ball", 45.0, "AGUA"),
        5 to listOf("Brine", 50.0, "AGUA"),
        6 to listOf("Skull Bash", 55.0, "NORMAL")
    )
)

val blastoise = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "AÇO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 85,
    "VIDA" to 230,
    "ATAQUES" to mapOf(
        1 to listOf("Headbutt", 40.0, "NORMAL"),
        2 to listOf("Bubbles", 45.0, "AGUA"),
        3 to listOf("Water Gun", 50.0, "AGUA"),
        4 to listOf("Water Ball", 55.0, "AGUA"),
        5 to listOf("Water Pulse", 60.0, "AGUA"),
        6 to listOf("Muddy Water", 70.0, "AGUA"),
        7 to listOf("Hydro Cannon", 100.0, "AGUA"),
        8 to listOf("Hydro Pump", 90.0, "AGUA")
    )
)

val caterpie = mapOf(
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Bug Bite", 15.0, "INSETO")
    )
)

val metapod = mapOf(
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Headbutt", 15.0, "NORMAL"),
        2 to listOf("Bug Bite", 20.0, "INSETO")
    )
)

val butterfree = mapOf(
    "TIPOS" to listOf("INSETO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "INSETO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "GELO", "VOADOR", "PEDRA"),
    "NIVEL" to 30,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Silver Wind", 25.0, "INSETO"),
        2 to listOf("Air Slash", 30.0, "VOADOR"),
        3 to listOf("Confusion", 25.0, "PSÍQUICO"),
        4 to listOf("Psybeam", 20.0, "PSÍQUICO"),
        5 to listOf("Air Cutter", 35.0, "VOADOR"),
        6 to listOf("Poison Powder", 10.0, "POISON")
    )
)

val weedle = mapOf(
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Horn Attack", 15.0, "NORMAL"),
        2 to listOf("String Shot", 10.0, "INSETO"),
        3 to listOf("Poison Sting", 15.0, "VENENO")
    )
)

val kakuna = mapOf(
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 15,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("String Shot", 15.0, "INSETO"),
        2 to listOf("Headbutt", 15.0, "NORMAL"),
        3 to listOf("Bug Bite", 20.0, "INSETO")
    )
)

val beedrill = mapOf(
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 35,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("String Shot", 20.0, "INSETO"),
        2 to listOf("Poison Jab", 30.0, "VENENO"),
        3 to listOf("Poison Sting", 25.0, "VENENO"),
        4 to listOf("Fury Cutter", 30.0, "INSETO"),
        5 to listOf("Pin Missile", 35.0, "INSETO"),
        6 to listOf("Toxic Spikes", 10.0, "VENENO")
    )
)

val pidgey = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 1,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Sand Attack", 10.0, "TERRA"),
        2 to listOf("Quick Attack", 15.0, "NORMAL"),
        3 to listOf("Wing Attack", 20.0, "VOADOR"),
        4 to listOf("Drill Peck", 25.0, "VOADOR")
    )
)

val pidgeotto = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 20,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 20.0, "NORMAL"),
        2 to listOf("Sand Attack", 15.0, "TERRA"),
        3 to listOf("Gust", 25.0, "VOADOR"),
        4 to listOf("Drill Peck", 30.0, "NORMAL"),
        5 to listOf("Wing Attack", 35.0, "VOADOR")
    )
)

val pidgeot = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 65,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 25.0, "NORMAL"),
        2 to listOf("Drill Peck", 35.0, "VOADOR"),
        3 to listOf("Feather Dance", 15.0, "VOADOR"),
        4 to listOf("Whirlwind", 10.0, "NORMAL"),
        5 to listOf("Wing Attack", 40.0, "VOADOR"),
        6 to listOf("Tornado", 50.0, "VOADOR"),
        7 to listOf("Hurricane", 60.0, "VOADOR"),
        8 to listOf("Air Slash", 55.0, "VOADOR")
    )
)

val rattata = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 1,
    "VIDA" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 15.0, "NORMAL"),
        2 to listOf("Bite", 20.0, "SOMBRIO"),
        3 to listOf("Scratch", 10.0, "NORMAL"),
        4 to listOf("Super Fang", 25.0, "NORMAL")
    )
)

val raticate = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 30,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 20.0, "NORMAL"),
        2 to listOf("Bite", 25.0, "SOMBRIO"),
        3 to listOf("Scratch", 15.0, "NORMAL"),
        4 to listOf("Pursuit", 20.0, "SOMBRIO"),
        5 to listOf("Super Fang", 30.0, "NORMAL")
    )
)

val spearow = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Peck", 15.0, "VOADOR"),
        2 to listOf("Sand Attack", 10.0, "TERRA"),
        3 to listOf("Wing Attack", 20.0, "VOADOR"),
        4 to listOf("Drill Peck", 25.0, "VOADOR")
    )
)

val fearow = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 50,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Peck", 20.0, "VOADOR"),
        2 to listOf("Sand Attack", 15.0, "TERRA"),
        3 to listOf("Drill Peck", 30.0, "VOADOR"),
        4 to listOf("Gust", 20.0, "VOADOR"),
        5 to listOf("Air Cutter", 25.0, "VOADOR"),
        6 to listOf("Wing Attack", 35.0, "VOADOR"),
        7 to listOf("Aerial Ace", 40.0, "VOADOR")
    )
)

val ekans = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 10,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Bite", 35.0, "SOMBRIO"),
        2 to listOf("Poison Fang", 40.0, "VENENO"),
        3 to listOf("Gunk Shot", 60.0, "VENENO"),
        4 to listOf("Acid", 25.0, "VENENO")
    )
)

val arbok = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 40,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Bite", 50.0, "SOMBRIO"),
        2 to listOf("Poison Fang", 55.0, "VENENO"),
        3 to listOf("Gunk Shot", 70.0, "VENENO"),
        4 to listOf("Wrap", 20.0, "NORMAL"),
        5 to listOf("Pin Missile", 45.0, "INSETO"),
        6 to listOf("Acid", 30.0, "VENENO"),
        7 to listOf("Iron Tail", 60.0, "AÇO"),
        8 to listOf("Poison Jab", 65.0, "VENENO")
    )
)

val pikachu = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "NIVEL" to 20,
    "VIDA" to 70,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 40.0, "NORMAL"),
        2 to listOf("Thunder Shock", 45.0, "ELETRICO"),
        3 to listOf("Thunderbolt", 70.0, "ELETRICO"),
        4 to listOf("Shock Wave", 55.0, "ELETRICO"),
        5 to listOf("Thunder Punch", 60.0, "ELETRICO"),
        6 to listOf("Thunder", 90.0, "ELETRICO")
    )
)

val raichu = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "NIVEL" to 65,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Swift", 40.0, "NORMAL"),
        2 to listOf("Thunder Shock", 55.0, "ELETRICO"),
        3 to listOf("Thunderbolt", 90.0, "ELETRICO"),
        4 to listOf("Volt Tackle", 120.0, "ELETRICO"),
        5 to listOf("Thunder Wrath", 100.0, "ELETRICO"),
        6 to listOf("Discharge", 80.0, "ELETRICO"),
        7 to listOf("Electric Storm", 110.0, "ELETRICO"),
        8 to listOf("Shockwave", 65.0, "ELETRICO")
    )
)

val sandshrew = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 20,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Sand Attack", 25.0, "TERRA"),
        2 to listOf("Mud Shot", 50.0, "TERRA"),
        3 to listOf("Scratch", 30.0, "NORMAL"),
        4 to listOf("Rollout", 60.0, "PEDRA"),
        5 to listOf("Bulldoze", 70.0, "TERRA")
    )
)

val sandslash = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 70,
    "VIDA" to 90,
    "ATAQUES" to mapOf(
        1 to listOf("Scratch", 45.0, "NORMAL"),
        2 to listOf("Slashing Blow", 70.0, "TERRA"),
        3 to listOf("Dig", 90.0, "TERRA"),
        4 to listOf("Rollout", 80.0, "PEDRA"),
        5 to listOf("Earth Power", 100.0, "TERRA")
    )
)

val nidoranfe = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 40, "NORMAL",),
        2 to listOf("Bite", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Horn Attack", 40, "NORMAL"),
        4 to listOf("Poison Sting", 35, "VENENO")
    )
)

val nidorina = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 30,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 60, "NORMAL"),
        2 to listOf("Horn Attack", 45, "NORMAL"),
        3 to listOf("Poison Jab", 50, "VENENO"),
        4 to listOf("Earth Power", 60, "TERRA"),
        5 to listOf("Dig", 50, "TERRA")
    )
)

val nidoqueen = mapOf(
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "VENENO", "INSETO", "PEDRA", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "NIVEL" to 70,
    "VIDA" to 200,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 60, "NORMAL"),
        2 to listOf("Horn Attack", 50, "NORMAL"),
        3 to listOf("Sand Tomb", 35, "TERRA"),
        4 to listOf("Horn Burst", 55, "TERRA"),
        5 to listOf("Ground Collapse", 60, "TERRA"),
        6 to listOf("Earthquake", 100, "TERRA"),
        7 to listOf("Fissure", 0, "TERRA", "ESPECIAL") // Fissure pode ser um ataque que causa derrota instantânea
    )
)

val nidoranma = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 65, "NORMAL"),
        2 to listOf("Bite", 60, "SOMBRIO"),
        3 to listOf("Horn Attack", 40, "NORMAL"),
        4 to listOf("Poison Sting", 35, "VENENO"),
        5 to listOf("Poison Fang", 50, "VENENO")
    )
)

val nidorino = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 30,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 60, "NORMAL",),
        2 to listOf("Horn Attack", 45, "NORMAL"),
        3 to listOf("Poison Jab", 55, "VENENO"),
        4 to listOf("Poison Fang", 60, "VENENO",),
        5 to listOf("Dig", 70, "TERRA", "TERRA"),
        6 to listOf("Cross Poison", 70, "VENENO")
    )
)

val nidoking = mapOf(
    "TIPOS" to listOf("VENENO", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "LUTADOR", "VENENO", "INSETO", "PEDRA", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "PSÍQUICO"),
    "NIVEL" to 70,
    "VIDA" to 200,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 60, "NORMAL"),
        2 to listOf("Horn Burst", 55, "TERRA"),
        3 to listOf("Poison Fang", 60, "VENENO"),
        4 to listOf("Poison Jab", 75, "VENENO"),
        5 to listOf("Poison Tail", 65, "VENENO"),
        6 to listOf("Toxic", 0, "VENENO", "ESPECIAL"), // Toxic causa status, não dano direto
        7 to listOf("Venoshock", 70, "VENENO"),
        8 to listOf("Sludge Bomb", 90, "VENENO")
    )
)
val clefairy = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 15,
    "VIDA" to 90,
    "ATAQUES" to mapOf(
        1 to listOf("Double Slap", 25, "NORMAL"),
        2 to listOf("Body Slam", 85, "NORMAL"),
        3 to listOf("Sing", 0, "NORMAL", "ESPECIAL"), // Causa sono, sem dano
        4 to listOf("Multi-Slap", 20, "NORMAL"),
        5 to listOf("Great Love", 95, "FADA"),
        6 to listOf("Healarea", 0, "NORMAL", "ESPECIAL"), // Cura
        7 to listOf("Metronome", 0, "NORMAL", "ESPECIAL") // Movimentos aleatórios
    )
)

val clefable = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 35,
    "VIDA" to 130,
    "ATAQUES" to mapOf(
        1 to listOf("Double Slap", 30, "NORMAL"),
        2 to listOf("Body Slam", 95, "NORMAL"),
        3 to listOf("Sing", 0, "NORMAL", "ESPECIAL"), // Causa sono, sem dano
        4 to listOf("Multi-Slap", 25, "NORMAL"),
        5 to listOf("Great Love", 105, "FADA"),
        6 to listOf("Healarea", 0, "NORMAL", "ESPECIAL"), // Cura
        7 to listOf("Metronome", 0, "NORMAL", "ESPECIAL") // Movimentos aleatórios
    )
)
val vulpix = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 20,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 40, "NORMAL"),
        2 to listOf("Iron Tail", 40, "METÁLICO"),
        3 to listOf("Ember", 60, "FOGO"),
        4 to listOf("Flamethrower", 95, "FOGO"),
    )
)
val ninetales = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 45,
    "VIDA" to 150,
    "ATAQUES" to mapOf(
        1 to listOf("Quick Attack", 40, "NORMAL"),
        2 to listOf("Iron Tail", 80, "METÁLICO"),
        3 to listOf("Ember", 60, "FOGO"),
        4 to listOf("Flame Wheel", 95, "FOGO"),
        5 to listOf("Fire Ball", 65, "FOGO"),
        6 to listOf("Hellfire Storm", 85, "METÁLICO"),
        7 to listOf("Inferno", 90, "FOGO"),
        8 to listOf("Burning Jealousy", 95, "FOGO")
    )
)

val jigglypuff = mapOf(
    "TIPOS" to listOf("NORMAL", "FADA"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("METÁLICO", "VENENO"),
    "NIVEL" to 15,
    "VIDA" to 90,
    "ATAQUES" to mapOf(
        1 to listOf("Dazzling Gleam", 60, "FADA"),
        2 to listOf("Play Rough", 85, "FADA"),
        3 to listOf("Sing", 0, "NORMAL", "ESPECIAL"),
        4 to listOf("Disarming Voice", 70, "FADA"),
        5 to listOf("Soft-Boiled", 0, "NORMAL", "ESPECIAL")
    )
)

val wigglytuff = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 40,
    "VIDA" to 140,
    "ATAQUES" to mapOf(
        1 to listOf("Dazzling Gleam", 40, "FADA"),
        2 to listOf("Play Rough", 95, "FADA"),
        3 to listOf("Sing", 120, "NORMAL", "ESPECIAL"),
        4 to listOf("Disarming Voice", 150, "FADA"),
        5 to listOf("Heart Pound", 150, "FADA"),
        6 to listOf("Soft-Boiled", 40, "FADA"),
        7 to listOf("Heal Pulse", 95, "PSÍQUICO")
    )
)
val zubat = mapOf(
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "INSETO", "GRAMA", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Super Sonic", 0, "NORMAL", "ESPECIAL"),  // Confunde
        2 to listOf("Bite", 40, "SOMBRIO", "FÍSICO"),
        3 to listOf("Poison Fang", 50, "VENENO", "FÍSICO"),
        4 to listOf("Leech Life", 60, "INSETO", "FÍSICO")
    )
)

val golbat = mapOf(
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 30,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Super Sonic", 0, "NORMAL", "ESPECIAL"),           // Confusão
        2 to listOf("Bite", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Poison Fang", 50, "VENENO", "FÍSICO"),            // Chance de envenenar
        4 to listOf("Leech Life", 60, "INSETO", "FÍSICO"),             // Recupera HP
        5 to listOf("Wing Attack", 70, "VOADOR", "FÍSICO"),
        6 to listOf("Air Cutter", 80, "VOADOR", "ESPECIAL")            // Crítico alto
    )
)
val oddish = mapOf(
    "TIPOS" to listOf("VENENO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Absorb", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Acid", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Leech Seed", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Stun Spore", 120, "GRAMA", "ESPECIAL"),
        5 to listOf("Poison Powder", 120, "GRAMA", "ESPECIAL")
    )
)
val gloom = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "NIVEL" to 25,
    "VIDA" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Absorb", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Leech Seed", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Acid", 55, "VENENO"),
        4 to listOf("Poison Bomb", 120, "VENENO"),
        5 to listOf("Poison Gas", 120, "VENENO"),
        6 to listOf("Stun Spore", 120, "GRAMA", "ESPECIAL"),
        7 to listOf("Poison Powder", 120, "GRAMA", "ESPECIAL")
    )
)

val vileplume = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "NIVEL" to 50,
    "VIDA" to 160,
    "ATAQUES" to mapOf(
        1 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)
val paras = mapOf(
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "VENENO"),
    "NIVEL" to 10,
    "VIDA" to 70,
    "ATAQUES" to mapOf(
        1 to listOf("Scratch", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Poison Sting", 20, "VENENO", "FÍSICO"),
        3 to listOf("Stun Spore", 0, "GRAMA", "ESPECIAL"),       // Paralisa
        4 to listOf("Leech Life", 30, "INSETO", "FÍSICO")
    )
)
val parasect = mapOf(
    "TIPOS" to listOf("INSETO", "GRAMA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "VENENO", "PEDRA"),
    "NIVEL" to 35,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Slash", 60, "NORMAL", "FÍSICO"),
        2 to listOf("Poison Bomb", 80, "VENENO", "ESPECIAL"),
        3 to listOf("Fury Cutter", 40, "INSETO", "FÍSICO"),
        4 to listOf("X-Scissor", 80, "INSETO", "FÍSICO"),
        5 to listOf("Mega Drain", 50, "GRAMA", "ESPECIAL"),
        6 to listOf("Leech Life", 60, "INSETO", "FÍSICO"),
        7 to listOf("Spore", 0, "GRAMA", "ESPECIAL")            // Coloca pra dormir
    )
)
val venonat = mapOf(
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 15,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Tackle", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Confusion", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Poison Sting", 25, "VENENO", "FÍSICO"),
        4 to listOf("Leech Life", 40, "INSETO", "FÍSICO"),
        5 to listOf("Supersonic", 0, "NORMAL", "ESPECIAL")  // Confunde
    )
)
val venomoth = mapOf(
    "TIPOS" to listOf("INSETO", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PSÍQUICO", "PEDRA"),
    "NIVEL" to 50,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Tackle", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Confusion", 60, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Poison Fang", 55, "VENENO", "FÍSICO"),
        4 to listOf("Bug Buzz", 95, "INSETO", "ESPECIAL"),
        5 to listOf("Stun Spore", 120, "GRAMA", "ESPECIAL")  // Paralisia
    )
)
val diglett = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 10,
    "VIDA" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Scratch", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mud-Slap", 30, "TERRA", "ESPECIAL"),
        3 to listOf("Dig", 60, "TERRA", "FÍSICO"),
        4 to listOf("Rock Slide", 60, "PEDRA", "FÍSICO")
    )
)
val dugtrio = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 35,
    "VIDA" to 90,
    "ATAQUES" to mapOf(
        1 to listOf("Dig", 60, "TERRA", "FÍSICO"),
        2 to listOf("Rock Slide", 70, "PEDRA", "FÍSICO"),
        3 to listOf("Earthquake", 100, "TERRA", "FÍSICO"),
        4 to listOf("Slash", 50, "NORMAL", "FÍSICO"),
        5 to listOf("Mud Bomb", 60, "TERRA", "ESPECIAL")
    )
)
val meowth = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 15,
    "VIDA" to 70,
    "ATAQUES" to mapOf(
        1 to listOf("Arranhão", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Ataque Rápido", 50, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "SOMBRIO", "FÍSICO"),
        4 to listOf("Fake Out", 40, "NORMAL", "FÍSICO") // Golpe que atordoa
    )
)
val persian = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 35,
    "VIDA" to 110,
    "ATAQUES" to mapOf(
        1 to listOf("Slash", 70, "NORMAL", "FÍSICO"),
        2 to listOf("Bite", 60, "SOMBRIO", "FÍSICO"),
        3 to listOf("Quick Attack", 50, "NORMAL", "FÍSICO"),
        4 to listOf("Hyper Fang", 80, "NORMAL", "FÍSICO"),
        5 to listOf("Fury Swipes", 60, "NORMAL", "FÍSICO")
    )
)

val psyduck = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 15,
    "VIDA" to 75,
    "ATAQUES" to mapOf(
        1 to listOf("Water Gun", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusion", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Tackle", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Headbutt", 50, "NORMAL", "FÍSICO")
    )
)
val golduck = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 45,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Water Gun", 60, "ÁGUA", "ESPECIAL"),
        2 to listOf("Psychic", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Slash", 50, "NORMAL", "FÍSICO"),
        4 to listOf("Calm Mind", 0, "PSÍQUICO", "STATUS") // Special buff
    )
)
val mankey = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 15,
    "VIDA" to 70,
    "ATAQUES" to mapOf(
        1 to listOf("Low Kick", 50, "LUTADOR", "FÍSICO"),
        2 to listOf("Scratch", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Fury Swipes", 45, "NORMAL", "FÍSICO"),
    )
)
val primeape = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 50,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Close Combat", 100, "LUTADOR", "FÍSICO"),
        2 to listOf("Karate Chop", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Fury Swipes", 45, "NORMAL", "FÍSICO"),
        4 to listOf("Taunt", 0, "SOMBRIO", "STATUS")
    )
)
val growlithe = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 25,
    "VIDA" to 110,
    "ATAQUES" to mapOf(
        1 to listOf("Ember", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Bite", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Quick Attack", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Flamethrower", 95, "FOGO", "ESPECIAL"),
        5 to listOf("Roar", 0, "NORMAL", "ESPECIAL"),
        6 to listOf("Helping Hand", 0, "NORMAL", "ESPECIAL")
    )
)

val arcanine = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 85,
    "VIDA" to 220,
    "ATAQUES" to mapOf(
        1 to listOf("Ember", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Bite", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Quick Attack", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Flamethrower", 95, "FOGO", "ESPECIAL"),
        5 to listOf("Roar", 0, "NORMAL", "ESPECIAL"),
        6 to listOf("Helping Hand", 0, "NORMAL", "ESPECIAL"),
        7 to listOf("Take Down", 90, "NORMAL", "FÍSICO"),
        8 to listOf("Extreme Speed", 80, "NORMAL", "FÍSICO")
    )
)

val poliwag = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 10,
    "VIDA" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Water Gun", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Tackle", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Bite", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Water Jet", 120, "ÁGUA", "ESPECIAL")
    )
)

val poliwhirl = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 30,
    "VIDA" to 120,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val poliwrath = mapOf(
    "NOME" to "Poliwrath",
    "TIPOS" to listOf("ÁGUA", "LUTADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 65,
    "VIDA" to 180,
    "ATAQUES" to mapOf(
        1 to listOf("Mud-Slap", 40, "TERRA", "FÍSICO"),
        2 to listOf("Doubleslap", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Bubble Beam", 60, "ÁGUA", "ESPECIAL"),
        4 to listOf("Water Gun", 40, "ÁGUA", "ESPECIAL"),
        5 to listOf("Liquidation", 85, "ÁGUA", "FÍSICO"),
        6 to listOf("Brick Break", 75, "LUTADOR", "FÍSICO"),
        7 to listOf("Dynamic Punch", 100, "LUTADOR", "FÍSICO"),
        8 to listOf("Surf", 90, "ÁGUA", "ESPECIAL"),
        9 to listOf("Hydro Pump", 110, "ÁGUA", "ESPECIAL")
    )
)
val abra = mapOf(
    "NOME" to "Abra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 20,
    "VIDA" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Recover", 0, "PSÍQUICO", "SUPORTE"),
        2 to listOf("Psy Pulse", 45, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Confusion", 30, "PSÍQUICO", "ESPECIAL")
    )
)

val kadabra = mapOf(
    "NOME" to "Kadabra",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 40,
    "VIDA" to 140,
    "ATAQUES" to mapOf(
        1 to listOf("Psybeam", 55, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psywave", 65, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Psy Pulse", 60, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Confusion", 30, "PSÍQUICO", "ESPECIAL"),
        5 to listOf("Psychic", 75, "PSÍQUICO", "ESPECIAL"),
        6 to listOf("Hypnosis", 0, "PSÍQUICO", "SUPORTE"),
        7 to listOf("Recover", 0, "PSÍQUICO", "SUPORTE")
    )
)
val alakazam = mapOf(
    "NOME" to "Alakazam",
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 85,
    "VIDA" to 230,
    "ATAQUES" to mapOf(
        1 to listOf("Psybeam", 65, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psy Ball", 80, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Psychic", 95, "PSÍQUICO", "ESPECIAL"), // ataque principal
        4 to listOf("Kinesis", 40, "PSÍQUICO", "SUPORTE"),  // pode causar evasão no inimigo
        5 to listOf("Mind Blast", 110, "PSÍQUICO", "ESPECIAL"), // ataque mais devastador
        6 to listOf("Recover", 0, "PSÍQUICO", "SUPORTE")    // cura
    )
)

val machop = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val machoke = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 45,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val machamp = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 85,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val bellsprout = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "NIVEL" to 1,
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)
val weepinbell = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "NIVEL" to 25,
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)
val victreebel = mapOf(
    "TIPOS" to listOf("GRAMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "FADA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VOADOR", "PSÍQUICO"),
    "NIVEL" to 45,
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO")
    )
)
val tentacool = mapOf(
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "VENENO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val tentacruel = mapOf(
    "TIPOS" to listOf("ÁGUA", "VENENO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "VENENO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "TERRA", "PSÍQUICO"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val geodude = mapOf(
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "NIVEL" to 1,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val graveler = mapOf(
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "NIVEL" to 40,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val golem = mapOf(
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val ponyta = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)
val rapidash = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 45,
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL")
    )
)

val slowpoke = mapOf(
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)

val slowbro = mapOf(
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val magnemite = mapOf(
    "TIPOS" to listOf("ELÉTRICO", "METÁLICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO", "GRAMA", "PSÍQUICO", "INSETO", "PEDRA", "GELO", "DRAGÃO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "LUTADOR", "FOGO"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)
val magneton = mapOf(
    "TIPOS" to listOf("ELÉTRICO", "METÁLICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO", "GRAMA", "PSÍQUICO", "INSETO", "PEDRA", "GELO", "DRAGÃO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "LUTADOR", "FOGO"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)
val farfetchd = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
    )
)
val doduo = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
    )
)
val dodrio = mapOf(
    "TIPOS" to listOf("NORMAL", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FANTASMA", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Bicada", 35, "VOADOR", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val seel = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val dewgong = mapOf(
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val grimer = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO")
    )
)
val muk = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO")
    )
)
val shellder = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
    )
)

val cloyster = mapOf(
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL")
    )
)
val gastly = mapOf(
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)
val haunter = mapOf(
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 40,
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)
val gengar = mapOf(
    "TIPOS" to listOf("FANTASMA", "VENENO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 85,
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        4 to listOf("Sombra Noturna", 60, "FANTASMA", "FÍSICO")
    )
)
val onix = mapOf(
    "TIPOS" to listOf("PEDRA", "TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val drowzee = mapOf(
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 30,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val hypno = mapOf(
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val krabby = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val kingler = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val voltorb = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)
val electrode = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "NIVEL" to 30,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)
val exeggcute = mapOf(
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "PSÍQUICO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)
val exeggutor = mapOf(
    "TIPOS" to listOf("GRAMA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "LUTADOR", "PSÍQUICO", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)
val cubone = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val marowak = mapOf(
    "TIPOS" to listOf("TERRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VENENO", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Cavar", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val hitmonlee = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val hitmonchan = mapOf(
    "TIPOS" to listOf("LUTADOR"),
    "RESISTÊNCIAS" to listOf("INSETO", "PEDRA", "SOMBRIO"),
    "DESVANTAGENS" to listOf("VOADOR", "PSÍQUICO", "FADA"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Chute Baixo", 50, "LUTADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val lickitung = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Língua", 30, "FANTASMA", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Corte", 50, "NORMAL", "FÍSICO")
    )
)
val koffing = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 15,
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val weezing = mapOf(
    "TIPOS" to listOf("VENENO"),
    "RESISTÊNCIAS" to listOf("GRAMA", "LUTADOR", "VENENO", "INSETO", "FADA"),
    "DESVANTAGENS" to listOf("TERRA", "PSÍQUICO"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Ácido", 40, "VENENO", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Presa Venenosa", 50, "VENENO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val rhyhorn = mapOf(
    "TERRA" to listOf("ELETRICO", "ACO", "VENENO", "PEDRA", "FOGO"),
    "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Chifrada", 65, "NORMAL", "FÍSICO")
    )
)

val rhydon = mapOf(
    "TIPOS" to listOf("TERRA", "PEDRA"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "FOGO", "VENENO", "VOADOR", "NORMAL", "PEDRA"),
    "DESVANTAGENS" to listOf("ÁGUA", "GRAMA", "GELO", "LUTADOR", "TERRA", "METÁLICO"),
    "NIVEL" to 85,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Rolo Compressor", 60, "TERRA", "FÍSICO"),
        3 to listOf("Terremoto", 100, "TERRA", "FÍSICO"),
        4 to listOf("Chifrada", 65, "NORMAL", "FÍSICO")
    )
)
val chansey = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val tangela = mapOf(
    "TIPOS" to listOf("GRAMA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "ELÉTRICO", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "GELO", "VENENO", "VOADOR", "INSETO"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Chicote de Vinha", 35, "GRAMA", "FÍSICO"),
        2 to listOf("Absorver", 20, "GRAMA", "ESPECIAL"),
        3 to listOf("Folha Navalha", 55, "GRAMA", "FÍSICO"),
        4 to listOf("Raio Solar", 120, "GRAMA", "ESPECIAL")
    )
)
val kangaskhan = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 85,
    "ATAQUES" to mapOf(
        1 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val horsea = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val seadra = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val goldeen = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 10,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val seaking = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 35,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val staryu = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val starmie = mapOf(
    "TIPOS" to listOf("ÁGUA", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "LUTADOR", "PSÍQUICO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 40,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val mrMime = mapOf(
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val scyther = mapOf(
    "TIPOS" to listOf("INSETO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "GELO", "VOADOR", "PEDRA"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Agulha Dupla", 25, "INSETO", "FÍSICO")
    )
)
val jynx = mapOf(
    "TIPOS" to listOf("GELO", "PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("GELO", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("FOGO", "INSETO", "PEDRA", "FANTASMA", "SOMBRIO", "METÁLICO"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val electabuzz = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Soco", 40, "NORMAL", "FÍSICO")
    )
)

val magmar = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val pinsir = mapOf(
    "TIPOS" to listOf("INSETO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "GRAMA", "TERRA"),
    "DESVANTAGENS" to listOf("FOGO", "VOADOR", "PEDRA"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Corte", 50, "NORMAL", "FÍSICO"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Agulha Dupla", 25, "INSETO", "FÍSICO"),
        4 to listOf("Mordida", 60, "NORMAL", "FÍSICO")
    )
)
val tauros = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 50,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val magikarp = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 1,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
    )
)
val gyarados = mapOf(
    "TIPOS" to listOf("ÁGUA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "LUTADOR", "INSETO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GELO", "PEDRA"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL"),
        4 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO")
    )
)

val lapras = mapOf(
    "TIPOS" to listOf("ÁGUA", "GELO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "GELO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "PEDRA"),
    "NIVEL" to 80,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val ditto = mapOf(
    "NOME" to "Ditto",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 1,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val eevee = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        4 to listOf("Ataque Rápido", 40, "NORMAL", "FÍSICO")
    )
)
val vaporeon = mapOf(
    "TIPOS" to listOf("ÁGUA"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "GELO", "METÁLICO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val jolteon = mapOf(
    "TIPOS" to listOf("ELÉTRICO"),
    "RESISTÊNCIAS" to listOf("ELÉTRICO", "VOADOR", "METÁLICO"),
    "DESVANTAGENS" to listOf("TERRA"),
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)

val flareon = mapOf(
    "TIPOS" to listOf("FOGO"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "GELO", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "TERRA", "PEDRA"),
    "NIVEL" to 60,
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val porygon = mapOf(
    "NOME" to "Porygon",
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 45,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val omanyte = mapOf(
    "PEDRA" to listOf("FOGO", "VOADOR", "INSETO", "GELO"),
    "AGUA" to listOf("FOGO", "TERRA", "PEDRA"),
    "NIVEL" to 20,
    "ATAQUE" to 40,
    "DEFESA" to 100,
)
val omastar = mapOf(
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val kabuto = mapOf(
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val kabutops = mapOf(
    "TIPOS" to listOf("PEDRA", "ÁGUA"),
    "RESISTÊNCIAS" to listOf("FOGO", "GELO", "VOADOR", "NORMAL", "VENENO"),
    "DESVANTAGENS" to listOf("ELÉTRICO", "GRAMA", "LUTADOR", "TERRA"),
    "NIVEL" to 65,
    "ATAQUES" to mapOf(
        1 to listOf("Revólver d'Água", 40, "ÁGUA", "ESPECIAL"),
        2 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val aerodactyl = mapOf(
    "TIPOS" to listOf("PEDRA", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "VOADOR", "INSETO", "VENENO", "NORMAL"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "GELO", "PEDRA", "METÁLICO"),
    "NIVEL" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val snorlax = mapOf(
    "TIPOS" to listOf("NORMAL"),
    "RESISTÊNCIAS" to listOf("FANTASMA"),
    "DESVANTAGENS" to listOf("LUTADOR"),
    "NIVEL" to 85,
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Soco", 40, "NORMAL", "FÍSICO"),
        3 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val articuno = mapOf(
    "TIPOS" to listOf("GELO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("FOGO", "ELÉTRICO", "PEDRA", "METÁLICO"),
    "NIVEL" to 300,
    "ATAQUES" to mapOf(
        1 to listOf("Raio de Gelo", 95, "GELO", "ESPECIAL"),
        2 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Nevoeiro", 40, "GELO", "ESPECIAL")
    )
)
val zapdos = mapOf(
    "TIPOS" to listOf("ELÉTRICO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "VOADOR", "INSETO", "GRAMA", "METÁLICO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA"),
    "NIVEL" to 300,
    "ATAQUES" to mapOf(
        1 to listOf("Choque do Trovão", 40, "ELÉTRICO", "ESPECIAL"),
        2 to listOf("Trovão", 120, "ELÉTRICO", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL")
    )
)
val moltres = mapOf(
    "TIPOS" to listOf("FOGO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("FOGO", "GRAMA", "LUTADOR", "INSETO", "METÁLICO", "FADA"),
    "DESVANTAGENS" to listOf("ÁGUA", "ELÉTRICO", "PEDRA"),
    "NIVEL" to 300,
    "ATAQUES" to mapOf(
        1 to listOf("Brasas", 40, "FOGO", "ESPECIAL"),
        2 to listOf("Lança-Chamas", 95, "FOGO", "ESPECIAL"),
        3 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        4 to listOf("Investida", 35, "NORMAL", "FÍSICO")
    )
)
val dratini = mapOf(
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "ELÉTRICO", "GRAMA"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),

    "NIVEL" to 20,
    "ATAQUES" to mapOf(
        1 to listOf("Aqua Tail", 8.0, "AGUA"),
        2 to listOf("Thunder Wave", 8.0, "ELETRICO"),
        3 to listOf("Slam", 8.0, "NORMAL"),
        4 to listOf("Twister", 8.0, "DRAGAO"),
        5 to listOf("Hyper Beam", 8.0, "NORMAL"),
        6 to listOf("Dragon Breath", 8.0, "DRAGAO"),
    )
)
val dragonair = mapOf(
    "TIPOS" to listOf("DRAGÃO"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "ELÉTRICO", "GRAMA"),
    "DESVANTAGENS" to listOf("GELO", "DRAGÃO", "FADA"),
    "ATAQUES" to mapOf(
        1 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Raio", 95, "ELÉTRICO", "ESPECIAL"),
        4 to listOf("Jato d'Água", 120, "ÁGUA", "ESPECIAL")
    )
)
val dragonite = mapOf(
    "TIPOS" to listOf("DRAGÃO", "VOADOR"),
    "RESISTÊNCIAS" to listOf("ÁGUA", "FOGO", "LUTADOR", "GRAMA", "INSETO"),
    "DESVANTAGENS" to listOf("GELO", "PEDRA", "DRAGÃO", "FADA"),
    "NIVEL" to 100,
    "ATAQUES" to mapOf(
        1 to listOf("Ataque de Asa", 60, "VOADOR", "FÍSICO"),
        2 to listOf("Mordida", 60, "NORMAL", "FÍSICO"),
        3 to listOf("Investida", 35, "NORMAL", "FÍSICO"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val mew = mapOf(
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 200,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)
val mewtwo = mapOf(
    "TIPOS" to listOf("PSÍQUICO"),
    "RESISTÊNCIAS" to listOf("LUTADOR", "PSÍQUICO"),
    "DESVANTAGENS" to listOf("INSETO", "FANTASMA", "SOMBRIO"),
    "NIVEL" to 200,
    "ATAQUES" to mapOf(
        1 to listOf("Confusão", 50, "PSÍQUICO", "ESPECIAL"),
        2 to listOf("Psíquico", 90, "PSÍQUICO", "ESPECIAL"),
        3 to listOf("Raio Psíquico", 65, "PSÍQUICO", "ESPECIAL"),
        4 to listOf("Hiper Raio", 150, "NORMAL", "ESPECIAL")
    )
)

// mapaPokemon
val mapaPokemons = mapOf(
    "bulbasaur" to bulbasaur,
    "ivysaur" to ivysaur,
    "venusaur" to venusaur,
    "charmander" to charmander,
    "charmeleon" to charmeleon,
    "charizard" to charizard,
    "squirtle" to squirtle,
    "wartortle" to wartortle,
    "blastoise" to blastoise,
    "caterpie" to caterpie,
    "metapod" to metapod,
    "butterfree" to butterfree,
    "weedle" to weedle,
    "kakuna" to kakuna,
    "beedrill" to beedrill,
    "pidgey" to pidgey,
    "pidgeotto" to pidgeotto,
    "pidgeot" to pidgeot,
    "rattata" to rattata,
    "raticate" to raticate,
    "spearow" to spearow,
    "fearow" to fearow,
    "ekans" to ekans,
    "arbok" to arbok,
    "pikachu" to pikachu,
    "raichu" to raichu,
    "sandshrew" to sandshrew,
    "sandslash" to sandslash,
    "nidoran♀" to nidoranfe,
    "nidorina" to nidorina,
    "nidoqueen" to nidoqueen,
    "nidoran♂" to nidoranma,
    "nidorino" to nidorino,
    "nidoking" to nidoking,
    "clefairy" to clefairy,
    "clefable" to clefable,
    "vulpix" to vulpix,
    "ninetales" to ninetales,
    "jigglypuff" to jigglypuff,
    "wigglytuff" to wigglytuff,
    "zubat" to zubat,
    "golbat" to golbat,
    "oddish" to oddish,
    "gloom" to gloom,
    "vileplume" to vileplume,
    "paras" to paras,
    "parasect" to parasect,
    "venonat" to venonat,
    "venomoth" to venomoth,
    "diglett" to diglett,
    "dugtrio" to dugtrio,
    "meowth" to meowth,
    "persian" to persian,
    "psyduck" to psyduck,
    "golduck" to golduck,
    "mankey" to mankey,
    "primeape" to primeape,
    "Growlithe" to growlithe,
    "arcanine" to arcanine,
    "poliwag" to poliwag,
    "poliwhirl" to poliwhirl,
    "poliwrath" to poliwrath,
    "abra" to abra,
    "kadabra" to kadabra,
    "alakazan" to alakazam,
    "machop" to machop,
    "machoke" to machoke,
    "machamp" to machamp,
    "bellsprout" to bellsprout,
    "weepinbell" to weepinbell,
    "victreebel" to victreebel,
    "tentacool" to tentacool,
    "tentacruel" to tentacruel,
    "geodude" to geodude,
    "graveler" to graveler,
    "golem" to golem,
    "ponyta" to ponyta,
    "rapidash" to rapidash,
    "slowpoke" to slowpoke,
    "slowbro" to slowbro,
    "magnemite" to magnemite,
    "magneton" to magneton,
    "farfetch'd" to farfetchd,
    "doduo" to doduo,
    "dodrio" to dodrio,
    "seel" to seel,
    "dewgong" to dewgong,
    "grimer" to grimer,
    "muk" to muk,
    "shellder" to shellder,
    "cloyster" to cloyster,
    "gastly" to gastly,
    "haunter" to haunter,
    "gengar" to gengar,
    "onix" to onix,
    "drowzee" to drowzee,
    "hypno" to hypno,
    "krabby" to krabby,
    "kingler" to kingler,
    "voltorb" to voltorb,
    "electrode" to electrode,
    "exeggcute" to exeggcute,
    "exeggutor" to exeggutor,
    "cubone" to cubone,
    "marowak" to marowak,
    "hitmonlee" to hitmonlee,
    "hitmonchan" to hitmonchan,
    "lickitung" to lickitung,
    "koffing" to koffing,
    "weezing" to weezing,
    "rhyhorn" to rhyhorn,
    "rhydon" to rhydon,
    "chansey" to chansey,
    "tangela" to tangela,
    "kangaskhan" to kangaskhan,
    "horsea" to horsea,
    "seadra" to seadra,
    "goldeen" to goldeen,
    "seaking" to seaking,
    "staryu" to staryu,
    "starmie" to starmie,
    "mr.mime" to mrMime,
    "scyther" to scyther,
    "jynx" to jynx,
    "electabuzz" to electabuzz,
    "magmar" to magmar,
    "pinsir" to pinsir,
    "tauros" to tauros,
    "magikarp" to magikarp,
    "gyarados" to gyarados,
    "lapras" to lapras,
    "ditto" to ditto,
    "eevee" to eevee,
    "vaporeon" to vaporeon,
    "jolteon" to jolteon,
    "flareon" to flareon,
    "porygon" to porygon,
    "omanyte" to omanyte,
    "omastar" to omastar,
    "kabuto" to kabuto,
    "kabutops" to kabutops,
    "aerodactyl" to aerodactyl,
    "snorlax" to snorlax,
    "articuno" to articuno,
    "zapdos" to zapdos,
    "moltres" to moltres,
    "dratini" to dratini,
    "dragonair" to dragonair,
    "dragonite" to dragonite,
    "mewtwo" to mewtwo,
    "mew" to mew
)