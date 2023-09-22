package com.desafiolatam.desafio3.data

import java.io.Serializable

data class Sucursal(
    val nombre: String,
    val direccion: String,
    val horario: String,
    val fotoUrl: String,
    val historia: String
) : Serializable

fun getSucursales():List<Sucursal>{
    return listOf(
        Sucursal(
            nombre="Cicero Store",
            direccion = "Colosseum, Piazza del Colosseo, 1, 00184 Roma RM, Italy",
            horario =" Lunes a viernes desde las 9:00 a las 18:30, sábados y domingos abierto desde las 10:30 a las 15:30",
            fotoUrl = "https://images.pexels.com/photos/2566085/pexels-photo-2566085.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2",
            historia = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque" +
                    "laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi" +
                    "architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit" +
                    "aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt."
        ),
        Sucursal(
            nombre="Li Europan lingues",
            direccion = " Panthéon, Pl. du Panthéon, 75005 Paris, France",
            horario ="Lunes a viernes desde las 9:00 a las 18:30, fines de semana cerrado",
            fotoUrl = "https://images.pexels.com/photos/5611543/pexels-photo-5611543.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            historia = "Li Europan lingues es membres del sam familie. Lor separat existentie es un myth." +
                    "Por scientie, musica, sport etc, litot Europa usa li sam vocabular. Li lingues differe solmen in" +
                    "li grammatica, li pronunciation e li plu commun vocabules." +
                    "Omnicos directe al desirabilite de un nov lingua franca: On refusa continuar payar custosi" +
                    "traductores. At solmen va esser necessi far uniform grammatica, pronunciation e plu" +
                    "sommun paroles. Ma quande lingues coalesce, li grammatica del resultant lingue es plu" +
                    "simplic e regulari quam ti del coalescent lingues. Li nov lingua franca va esser plu simplic e" +
                    "regulari quam li existent Europan lingues."
        ),
        Sucursal(
            nombre="Relojeria Kafka",
            direccion = "Prague Astronomical Clock, Staroměstské nám. 1, 110 00 Josefov, Czechia",
            horario =" Lunes a viernes desde las 9:00 a las 18:30, fines de semana cerrado",
            fotoUrl = "https://images.pexels.com/photos/2260827/pexels-photo-2260827.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            historia = "One morning, when Gregor Samsa woke from troubled dreams, he found himself" +
                    "transformed in his bed into a horrible vermin." +
                    "He lay on his armour-like back, and if he lifted his head a little he could see his brown belly," +
                    "slightly domed and divided by arches into stiff sections. The bedding was hardly able to" +
                    "cover it and seemed ready to slide off any moment. His many legs, pitifully thin compared" +
                    "with the size of the rest of him, waved about helplessly as he looked."
        ),
        Sucursal(
            nombre=" Love Craft Arts",
            direccion = "Lovecraft Arts & Sciences, 65 Weybosset St, Providence, RI 02903, United States",
            horario ="Lunes a viernes desde las 9:00 a las 18:30",
            fotoUrl = "https://images.pexels.com/photos/2482128/pexels-photo-2482128.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            historia = "Still another time have I come to a place where it is very difficult to proceed. I ought" +
                    "to be hardened by this stage; but there are some experiences and intimations which scar too" +
                    "deeply to permit of healing, and leave only such an added sensitiveness that memory" +
                    "reinspires all the original horror." +
                    "We saw, as I have said, certain obstructions on the polished floor ahead; and I may add that" +
                    "our nostrils were assailed almost simultaneously by a very curious intensification of the" +
                    "strange prevailing fetor, now quite plainly mixed with the nameless stench of those others" +
                    "which had gone before. The light of the second torch left no doubt of what the obstructions" +
                    "were, and we dared approach them only because we could see, even from a distance, that" +
                    "they were quite as past all harming power as had been the six similar specimens unearthed" +
                    "from the monstrous star-mounded graves at poor Lake's camp."
        ),
        Sucursal(
            nombre="The Ancient Mariner",
            direccion = "Public Art: The Ancient Mariner, 11 The Esplanade, Watchet TA23 0AH, United Kingdom",
            horario = "Lunes a viernes desde las 9:00 a las 18:30",
            fotoUrl = "https://images.pexels.com/photos/2261199/pexels-photo-2261199.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            historia = "Day after day, day after day, We stuck, nor breath nor motion; As idle as a painted" +
                    "ship Upon a painted ocean. Water, water, every where, And all the boards did shrink; Water," +
                    "water, every where, Nor any drop to drink. The very deep did rot: O Christ! That ever this" +
                    "should be! Yea, slimy things did crawl with legs Upon the slimy sea. About, about, in reel and" +
                    "rout The death-fires danced at night; The water, like a witch's oils, Burnt green, and blue and" +
                    "white. And some in dreams assurèd were Of the Spirit that plagued us so; Nine fathom deep" +
                    "he had followed us From the land of mist and snow." +
                    "And every tongue, through utter drought, Was withered at the root; We could not speak, no" +
                    "more than if We had been choked with soot." +
                    "Ah! well a-day! what evil looks Had I from old and young! Instead of the cross, the Albatross" +
                    "About my neck was hung."
        )
    )
}
