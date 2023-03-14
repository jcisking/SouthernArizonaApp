package com.example.southernarizonaapp.data.local

import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation
import com.example.southernarizonaapp.data.Category

object LocalRecommendationDataProvider {
    val restaurantRecommendations: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.alejandros_restaurant,
            name = "Alejandro “Serious Mexican, Mariscos, & Fusion Food”",
            location = "7850 N Silverbell Rd Suite 156, Tucson, AZ 85743",
            category = Category.RESTAURANTS,
            description = "You will find that many of our dishes are named after family members as" +
                    " a reminder and celebration of life. I am grateful for the opportunity to share" +
                    " our story and our food which itself contains years of history through family" +
                    " recipes. \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Our Mexican and Seafood plates are authentic while uniquely representing our " +
                    "passion and the love we have for our family. I also incorporated Fusion dishes " +
                    "on the menu which are influenced by the flavors of different cultures that" +
                    " compliment our traditional recipes. "

        ),
        Recommendation(
            image = R.drawable.el_charro,
            name = "El Charro",
            location = "311 N Court Ave, Tucson, AZ 85701",
            category = Category.RESTAURANTS,
            description = "Our Legendary Tia Monica Flin, is well-known as “The Inventor of The " +
                    "Chimichanga.” While frying her now famous El Charro ground beef tacos, she " +
                    "accidentally dropped a burro into the frying pan and when the oil splashed up " +
                    "she was about to lash out a common Spanish cuss word starting with “Ch” but " +
                    "because she was amongst her young nieces and nephews, changed it to " +
                    "“Chimichanga”, the equivalent of “thingamajig.” Thankfully for all of us," +
                    " Monica was a controlled and creative cuss."
        ),
        Recommendation(
            image = R.drawable.theparishrestaurant,
            name = "The Parish",
            location = "6453 N Oracle Rd, Tucson, AZ 85704",
            category = Category.RESTAURANTS,
            description = "The Parish is a favorite Tucson restaurant for those seeking a unique " +
                    "and flavorful dining experience. Dine with true Southern hospitality under " +
                    "glass chandeliers and in rustic table settings that ooze Southern charm. " +
                    "Take your tastebuds on a culinary journey with bold southern dishes like " +
                    "Guedry's Gumbo with crawfish hushpuppies. Indulge in original dishes like " +
                    "the Drunken Angel Pasta and the Mesquite Smoked Salmon salad. All dishes at " +
                    "The Parish pair well with the extensive selection of craft beers and unique " +
                    "cocktails created with housemade infused spirits. Happy hour at The Parish " +
                    "includes great noshes and drink specials. Looking for a true Southern " +
                    "hospitality dining experience in Tucson that's fun? Seek and ye shall find at" +
                    " The Parish. Tucson's only Southern Fusion Gastropub."
        ),
        Recommendation(
            image = R.drawable.tf_renees_organic_oven_interior_2847,
            name = "Renee's Tucson" ,
            location = "7065 E Tanque Verde Rd, Tucson, AZ 85715",
            category = Category.RESTAURANTS,
            description = "Compact eatery serving a diverse menu of organic dishes, including" +
                    " gluten-free pizza & vegan items. Renee’s taste for purity in every ingredient" +
                    " and her appreciation for a great dining experience have earned this intimate " +
                    "spot support from locals as well as travelers. Featuring a solid wine list, " +
                    "craft beer, & select spirits served neat or on the rocks for your enjoyment. "
        ),
        Recommendation(
            image = R.drawable.tf_aqui_con_el_nene_sonoran_hot_dogs_5464,
            name = "Aqui Con El Nene",
            location = "4415 N Flowing Wells Rd, Tucson, AZ 85705",
            category = Category.RESTAURANTS,
            description = "This west-side food truck won Best Tacos in Tucson during the recent " +
                    "Mero Mero Taquero competition, and if you've ever had the green chile-strewn " +
                    "Taco Yaqui you can see why. Another menu highlight is the baked potato " +
                    "Papancha stuffed with melty cheese, mushrooms and carne asada. These Mexican " +
                    "baked potatoes are a big deal down in Ciudad Obregon, Sonora, where owner " +
                    "Salvador Gastelum is from. "
        ),
        Recommendation(
            image = R.drawable.tf_tito_and_pep_pollo_asado_8650,
            name = "Tito and Pep",
            location = "4122 E Speedway Blvd, Tucson, AZ 85712",
            category = Category.RESTAURANTS,
            description = "Tito & Pep is a bright venue in Midtown Tucson providing delicious food " +
                    "and beverage and exceptional service in a convivial, upbeat atmosphere. \n" +
                    "\n" +
                    "We hope to establish ourselves as a true hub, woven into the fabric of one of" +
                    " Tucson's most vibrant areas. The focus of the dining experience at Tito & Pep " +
                    "is mesquite-fired cuisine, complemented by one-of-a kind cocktails and a " +
                    "full-service beverage menu featuring locally brewed beer and a unique selection" +
                    " of wine. \n" +
                    "\n" +
                    "With over 20 years of experience gained across the U.S. and abroad, Chef and " +
                    "Owner John Martinez draws influence from the multicultural history of the " +
                    "Southwest region, and from his travels, to create a cuisine that is distinctive " +
                    "and flavorful."
        ),
        Recommendation(
            image = R.drawable.mi_nidito,
            name = "Mi Nidito",
            location = "1813 S 4th Ave, Tucson, AZ 85713",
            category = Category.RESTAURANTS,
            description = "Mi Nidito has been serving Tucson since 1952. It was then that a couple " +
                    "who moved from Sonora made a decision that is still impacting the lives of " +
                    "their family three generations later. The decision was between opening a " +
                    "Mexican food restaurant or a tortilla factory. The restaurant won and that " +
                    "is how Mi Nidito was created.\n" +
                    "\n" +
                    "Mi Nidito was opened by Ernesto and Alicia Lopez on the corner of 4th Avenue " +
                    "and 29th Street in historic South Tucson. The restaurant is now owned by" +
                    " Ernest Lopez Jr. and wife Yolanda. Sons Jimmy and Ernie III help run the " +
                    "family business. The name Mi Nidito, which means \"My Little Nest\", was given" +
                    " to the restaurant because of its original small size.\n" +
                    "\n" +
                    "Over the years that coziness has remained, as Mi Nidito has gone through a " +
                    "number of renovations. Busy weekends and a growing clientele prompted the most " +
                    "recent expansion, completed in 1992, giving the restaurant 35 additional seats."
        )

    )

    val recommendedTouristAttractions: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.oldtucson,
            name = "Old Tucson",
            location = "201 Kinney Rd, Tucson, AZ 85735",
            description = "Journey into a western town in The Arizona Territory during the 1800s.\n" +
                    "\n" +
                    "Experience live-action cowboy gun fights, death-defying stunts, and join the " +
                    "search for the missing gold! Enjoy numerous attractions, rides, and shows for" +
                    " one great price!"
        ),
        Recommendation(
            image = R.drawable.sabino_canyon_recreation_area,
            name = "Sabino Canyon",
            location = "5700 N Sabino Canyon Rd, Tucson, AZ 85750",
            description = "Come to Sabino to see water in the desert. Between steep rock cliffs " +
                    "and unique desert vegetation you will find riparian corridors. You may even " +
                    "get lucky and view a Gila Monster, Bobcat, or other animals that are adapt to" +
                    " our 100 + degree summers and mild winters. The Sonoran desert has two rainy " +
                    "seasons: gentle winter rains and a dramatic summer monsoon. Due to winter's" +
                    " snow melt and summer's electrifying lightning storms, Sabino Creek flows " +
                    "almost year around."
        ),
        Recommendation(
            image = R.drawable.trail_dust_town,
            name = "Trail Dust Town",
            location = "6541 E Tanque Verde Rd, Tucson, AZ 85715",
            description = "Trail Dust Town has seen Tucson grow up around it since it was built " +
                    "in 1961. A trip down main street still feels like a journey through the " +
                    "streets of a pioneer town. Come escape to a bygone era during your visit to " +
                    "Trail Dust Town."
        ),
        Recommendation(
            image = R.drawable.sentinel_peak_a_mountain_pcpl,
            name = "Sentinel Peak Park (“A” Mountain)",
            location = "1001 Sentinel Peak Rd S, Tucson, AZ 85745",
            description = "Below this 2,900-foot peak, the Santa Cruz valley was farmed by the" +
                    " Hohokam Indians as early as 800 AD.  When the Spaniards arrived in the 17th " +
                    "century, the Hohokam had vanished and settlements of Piman people dotted the " +
                    "valley.  One settlement called \"Schuk-Shon,\" meaning \"at the foot of the " +
                    "black mountain,\" was pronounced \"Tuk-Son\" by the Spaniards.  The hill was" +
                    " a lookout for these early Indian and Spanish settlers, who lived in fear of " +
                    "hostile raiders.  The white washed stone \"A\" was constructed by University " +
                    "of Arizona students in 1915."
        ),
        Recommendation(
            image = R.drawable.tombstone,
            name = "Tombstone, Arizona",
            location = "SouthEastern Arizona",
            description = "A visit to Tombstone, AZ is like stepping back into history.  " +
                    "Tombstone, AZ otherwise known as the “Town too Tough to Die” is the home " +
                    "of the infamous Gunfight at the OK Corral, Boothill Graveyard and the World " +
                    "Largest Rose Bush.  Tombstone, AZ boasts a mild year round climate, many" +
                    " wonderful shops, gunfight shows, re-enactments and museums.  Our guest can " +
                    "learn Tombstone’s history while taking a scenic ride on a stagecoach or on" +
                    " one of the area’s Trolley’s."
        ),
        Recommendation(
            image = R.drawable.mtlemmon,
            name = "Mount Lemmon",
            location = "NorthEast Tucson",
            description = "Visitors to this biodiverse Sky Island are delighted by the hiking, " +
                    "skiing and rock climbing — just an hour from Tucson, Arizona.\n" +
                    "\n" +
                    "Mount Lemmon offers an escape from the city for metropolitan Tucsonans. An" +
                    " average of 30 degrees cooler and just an hour away, this special place is a " +
                    "haven in the summer and an outdoor playground in the winter."
        )
    )

    val recommendedParks: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.reidpark,
            name = "Reid Park",
            location = "900 S. Randolph Way • Tucson AZ 85716",
            description = "This large park has something for everyone. Horseshoe pitching complex," +
                    " ponds with ducks to feed, playgrounds for kids of all ages, picnic pavilions, " +
                    "walking/running/cycling paths, public washrooms, zoo, etc. If you want to be " +
                    "outdoors in Tucson, check out Reid Park. Mostly free to use. "
        ),
        Recommendation(
            image = R.drawable.brandifenton,
            name = "Brandi Fenton Park",
            location = "3482 E River Rd, Tucson, AZ 85718",
            description = "Brandi Fenton Memorial Park is a 56-acre park in North-Central Tucson. " +
                    "The park includes three soccer fields, two covered basketball courts, five " +
                    "ramadas, an equestrian arena, horse shoe pits, two playgrounds, a splash park, " +
                    "an off-leash dog park, walking paths, and a memorial garden.\n" +
                    "\n" +
                    "Brandi Fenton Memorial Park also serves as a major recreation/open space node" +
                    " along the Rillito River corridor - which means it's a prime spot for walking, " +
                    "jogging, and biking!"
        ),
        Recommendation(
            image = R.drawable.aguacalientepark,
            name = "Agua Caliente Regional Park",
            location = "12325 E Roger Rd, Tucson, AZ 85749",
            description = "Agua Caliente, literally meaning hot water, is a unique 101-acre park " +
                    "that features a perennial warm spring and pond that is home to an " +
                    "exceptionally rich mix of plants and animals. Agua Caliente Park has a long " +
                    "and interesting history with evidence of human habitation dating back about" +
                    " 5,500 years. In 1873, a ranch and health resort was developed to promote the " +
                    "curative properties of the warm springs. In 1984 local businessman Roy P. " +
                    "Drachman donated over \$200,000 toward the purchase of Agua Caliente Ranch and" +
                    " Pima County named the park in honor of this contribution. Roy P. Drachman " +
                    "Agua Caliente Park opened to the public on January 19, 1985."
        ),
        Recommendation(
            image = R.drawable.himmel_park_tucson,
            name = "Himmel Park",
            location = "1000 N Tucson Blvd, Tucson, AZ 85716",
            description = "Located on the east side of Tucson Boulevard, half a block south of " +
                    "Speedway Boulevard, Himmel Park contains a cozy library, whimsical " +
                    "playgrounds, numerous tennis courts, and a swimming pool. A wide, tree-lined" +
                    " walking path bisects the park. The verdant grass and mature trees beckon " +
                    "neighborhood dog-walkers and picnickers. The trees are alive with birds, " +
                    "such as the vermilion flycatcher, gila woodpecker, hummingbirds, northern" +
                    " cardinal, and the lesser goldfinch. There is a small knoll on the north side " +
                    "of the park that is used as a natural amphitheater for local productions. In " +
                    "addition, the park is used by various recreational sport leagues since it has" +
                    " four soccer fields, numerous baseball/softball fields, and a 1/2 basketball court. "
        )
    )

    val recommendedShopping: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.tucsonmall,
            name = "Tucson Mall",
            location = "4500 North Oracle Road, Tucson, Arizona",
            description = "The Tucson Mall is known to be the biggest and most popular mall in " +
                    "the city. It opened in year of 1982 with total 38 years. Brookfiled " +
                    "Properties are  management and owners of the property. There are two floor " +
                    "levels and have about 200 stores in the mall, including restaurants near by. " +
                    "The major stores include Macy's, Dillard's, JCPenny, Forever 21 and Sears," +
                    " which are also called the anchors to the shopping mall. There is also a " +
                    "children's play place which is always full of families and children having a " +
                    "good time. There is always improvements happening, and openings of new stores " +
                    "and restaurants that comply with customers preferences."
        ),
        Recommendation(
            image = R.drawable.parkplace_homepage_seo_767x510,
            name = "Park Place Mall",
            location = "5870 E Broadway Blvd, Tucson, AZ 85711",
            description = "Park Place Mall offers a great environment for a family. This shopping " +
                    "center has great stores to shop at and even has great sales as well. The food " +
                    "court offers great restaurants as well. In my opinion the food court is way " +
                    "less crowded than the one at Tucson Mall. The theater has awesome service and " +
                    "offers a clean environment as well."
        ),
        Recommendation(
            image = R.drawable.la_encantada_mall,
            name = "La Encantada Shopping Center",
            location = "2905 E Skyline Dr, Tucson, AZ 85718",
            description = "La Encantada is an upscale two-level, outdoor specialty center that" +
                    " celebrates the splendor of old-world Spanish traditions alongside modern " +
                    "sophistication. The first and only luxury shopping center in Southern Arizona," +
                    " La Encantada delivers world-class brands to Tucson, including West Elm, " +
                    "Crate & Barrel, Tommy Bahama, Free People, Williams Sonoma, lululemon, " +
                    "Sundance, Anthropologie, Apple Store, and Tiffany & Co."
        ),
        Recommendation(
            image = R.drawable.tucsonpremiumoutlets,
            name = "Tucson Premium Outlets",
            location = "6401 Marana Center Blvd, Tucson, AZ 85742",
            description = "Even though Tucson gets Hot, no not hot, Extremely Hot, the outlets know" +
                    " how to keep customers cool! Both an inside and outside, the outlets find ways " +
                    "to keep the customers cool. The variety of outlet stores is wonderful! Yes, " +
                    "there are outlets in many places. The Tucson Premium Outlets are right up " +
                    "there in the best! It's worth visiting whilst in the Tucson Area."
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