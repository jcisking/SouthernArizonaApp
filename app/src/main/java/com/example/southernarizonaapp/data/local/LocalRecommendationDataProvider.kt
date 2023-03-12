package com.example.southernarizonaapp.data.local

import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation

object LocalRecommendationDataProvider {
    val restaurantRecommendations: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.alejandros_restaurant,
            name = "Alejandro “Serious Mexican, Mariscos, & Fusion Food”",
            location = "7850 N Silverbell Rd Suite 156, Tucson, AZ 85743",
            description = "You will find that many of our dishes are named after family members as a reminder and celebration of life. I am grateful for the opportunity to share our story and our food which itself contains years of history through family recipes. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Our Mexican and Seafood plates are authentic while uniquely representing our passion and the love we have for our family. I also incorporated Fusion dishes on the menu which are influenced by the flavors of different cultures that compliment our traditional recipes. "
        ),
        Recommendation(
            image = R.drawable.el_charro,
            name = "El Charro",
            location = "311 N Court Ave, Tucson, AZ 85701",
            description = "Our Legendary Tia Monica Flin, is well-known as “The Inventor of The Chimichanga.” While frying her now famous El Charro ground beef tacos, she accidentally dropped a burro into the frying pan and when the oil splashed up she was about to lash out a common Spanish cuss word starting with “Ch” but because she was amongst her young nieces and nephews, changed it to “Chimichanga”, the equivalent of “thingamajig.” Thankfully for all of us, Monica was a controlled and creative cuss."
        ),
        Recommendation(
            image = R.drawable.theparishrestaurant,
            name = "The Parish",
            location = "6453 N Oracle Rd, Tucson, AZ 85704",
            description = "The Parish is a favorite Tucson restaurant for those seeking a unique and flavorful dining experience. Dine with true Southern hospitality under glass chandeliers and in rustic table settings that ooze Southern charm. Take your tastebuds on a culinary journey with bold southern dishes like Guedry's Gumbo with crawfish hushpuppies. Indulge in original dishes like the Drunken Angel Pasta and the Mesquite Smoked Salmon salad. All dishes at The Parish pair well with the extensive selection of craft beers and unique cocktails created with housemade infused spirits. Happy hour at The Parish includes great noshes and drink specials. Looking for a true Southern hospitality dining experience in Tucson that's fun? Seek and ye shall find at The Parish. Tucson's only Southern Fusion Gastropub."
        ),
        Recommendation(
            image = R.drawable.tf_renees_organic_oven_interior_2847,
            name = "Renee's Tucson" ,
            location = "7065 E Tanque Verde Rd, Tucson, AZ 85715",
            description = "Compact eatery serving a diverse menu of organic dishes, including gluten-free pizza & vegan items. Renee’s taste for purity in every ingredient and her appreciation for a great dining experience have earned this intimate spot support from locals as well as travelers. Featuring a solid wine list, craft beer, & select spirits served neat or on the rocks for your enjoyment. "
        ),
        Recommendation(
            image = R.drawable.tf_aqui_con_el_nene_sonoran_hot_dogs_5464,
            name = "Aqui Con El Nene",
            location = "4415 N Flowing Wells Rd, Tucson, AZ 85705",
            description = "This west-side food truck won Best Tacos in Tucson during the recent Mero Mero Taquero competition, and if you've ever had the green chile-strewn Taco Yaqui you can see why. Another menu highlight is the baked potato Papancha stuffed with melty cheese, mushrooms and carne asada. These Mexican baked potatoes are a big deal down in Ciudad Obregon, Sonora, where owner Salvador Gastelum is from. "
        ),
        Recommendation(
            image = R.drawable.tf_tito_and_pep_pollo_asado_8650,
            name = "Tito and Pep",
            location = "4122 E Speedway Blvd, Tucson, AZ 85712",
            description = "Tito & Pep is a bright venue in Midtown Tucson providing delicious food and beverage and exceptional service in a convivial, upbeat atmosphere. \n" +
                    "\n" +
                    "We hope to establish ourselves as a true hub, woven into the fabric of one of Tucson's most vibrant areas. The focus of the dining experience at Tito & Pep is mesquite-fired cuisine, complemented by one-of-a kind cocktails and a full-service beverage menu featuring locally brewed beer and a unique selection of wine. \n" +
                    "\n" +
                    "With over 20 years of experience gained across the U.S. and abroad, Chef and Owner John Martinez draws influence from the multicultural history of the Southwest region, and from his travels, to create a cuisine that is distinctive and flavorful."
        ),
        Recommendation(
            image = R.drawable.mi_nidito,
            name = "Mi Nidito",
            location = "1813 S 4th Ave, Tucson, AZ 85713",
            description = "Mi Nidito has been serving Tucson since 1952. It was then that a couple who moved from Sonora made a decision that is still impacting the lives of their family three generations later. The decision was between opening a Mexican food restaurant or a tortilla factory. The restaurant won and that is how Mi Nidito was created.\n" +
                    "\n" +
                    "Mi Nidito was opened by Ernesto and Alicia Lopez on the corner of 4th Avenue and 29th Street in historic South Tucson. The restaurant is now owned by Ernest Lopez Jr. and wife Yolanda. Sons Jimmy and Ernie III help run the family business. The name Mi Nidito, which means \"My Little Nest\", was given to the restaurant because of its original small size.\n" +
                    "\n" +
                    "Over the years that coziness has remained, as Mi Nidito has gone through a number of renovations. Busy weekends and a growing clientele prompted the most recent expansion, completed in 1992, giving the restaurant 35 additional seats."
        )

    )

    val recommendedTouristAttractions: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.oldtucson,
            name = "Old Tucson",
            location = "201 Kinney Rd, Tucson, AZ 85735",
            description = ""
        ),
        Recommendation(
            image = R.drawable.sabino_canyon_recreation_area,
            name = "Sabino Canyon",
            location = "5700 N Sabino Canyon Rd, Tucson, AZ 85750",
            description = ""
        ),
        Recommendation(
            image = R.drawable.trail_dust_town,
            name = "Trail Dust Town",
            location = "6541 E Tanque Verde Rd, Tucson, AZ 85715",
            description = ""
        ),
        Recommendation(
            image = R.drawable.sentinel_peak_a_mountain_pcpl,
            name = "Sentinel Peak Park (“A” Mountain)",
            location = "1001 Sentinel Peak Rd S, Tucson, AZ 85745",
            description = ""
        ),
        Recommendation(
            image = R.drawable.tombstone,
            name = "Tombstone, Arizona",
            location = "SouthEastern Arizona",
            description = ""
        ),
        Recommendation(
            image = R.drawable.mtlemmon,
            name = "Mount Lemmon",
            location = "NorthEast Tucson",
            description = ""
        )
    )

    val recommendedParks: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.reidpark,
            name = "Reid Park",
            location = "900 S. Randolph Way • Tucson AZ 85716",
            description = ""
        ),
        Recommendation(
            image = R.drawable.brandifenton,
            name = "Brandi Fenton Park",
            location = "3482 E River Rd, Tucson, AZ 85718",
            description = ""
        ),
        Recommendation(
            image = R.drawable.aguacalientepark,
            name = "Agua Caliente Regional Park",
            location = "12325 E Roger Rd, Tucson, AZ 85749",
            description = ""
        ),
        Recommendation(
            image = R.drawable.rillitoriver,
            name = "Rillito River Park",
            location = "",
            description = ""
        )
    )

    val recommendedShopping: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.tucsonmall,
            name = "Tucson Mall",
            location = "4500 North Oracle Road, Tucson, Arizona",
            description = ""
        ),
        Recommendation(
            image = R.drawable.parkplace_homepage_seo_767x510,
            name = "Park Place Mall",
            location = "5870 E Broadway Blvd, Tucson, AZ 85711",
            description = ""
        ),
        Recommendation(
            image = R.drawable.la_encantada_mall,
            name = "La Encantada Shopping Center",
            location = "2905 E Skyline Dr, Tucson, AZ 85718",
            description = ""
        ),
        Recommendation(
            image = R.drawable.tucsonpremiumoutlets,
            name = "Tucson Premium Outlets",
            location = "6401 Marana Center Blvd, Tucson, AZ 85742",
            description = ""
        )
    )

    val recommendedResorts: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.el_conquistador,
            name = "El Conquistador",
            location = "10000 N Oracle Rd, Tucson, AZ 85704",
            description = ""
        ),
        Recommendation(
            image = R.drawable.canyonranch,
            name = "Canyon Ranch",
            location = "8600 E Rockcliff Rd, Tucson, AZ 85750",
            description = ""
        ),
        Recommendation(
            image = R.drawable.loewsventana,
            name = "Loews Ventana Canyon Resort",
            location = "7000 N Resort Dr, Tucson, AZ 85750",
            description = ""
        ),
        Recommendation(
            image = R.drawable.miraval,
            name = "Miraval Arizona Resort & Spa",
            location = "5000 East, E Vía Estancia Miraval, Tucson, AZ 85739",
            description = ""
        ),
        Recommendation(
            image = R.drawable.jwmarriotstarpass,
            name = "JW Marriott Tucson Starr Pass Resort & Spa",
            location = "3800 W Starr Pass Blvd, Tucson, AZ 85745",
            description = ""
        ),
        Recommendation(
            image = R.drawable.casinodelsol,
            name = "Casino Del Sol",
            location = "5655 W Valencia Rd, Tucson, AZ 85757",
            description = ""
        )
    )
}