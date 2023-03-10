package com.example.southernarizonaapp.data.local

import com.example.southernarizonaapp.R
import com.example.southernarizonaapp.data.Recommendation

object LocalRecommendationDataProvider {
    val restaurantRecommendations: List<Recommendation> = listOf(
        Recommendation(
            image = R.drawable.alejandros_restaurant,
            name = "Alejandro “Serious Mexican, Mariscos, & Fusion Food”",
            location = "7850 N Silverbell Rd Suite 156, Tucson, AZ 85743",
            description = ""
        ),
        Recommendation(
            image = R.drawable.el_charro,
            name = "El Charro",
            location = "311 N Court Ave, Tucson, AZ 85701",
            description = ""
        ),
        Recommendation(
            image = R.drawable.theparishrestaurant,
            name = "The Parish",
            location = "6453 N Oracle Rd, Tucson, AZ 85704",
            description = ""
        ),
        Recommendation(
            image = R.drawable.tf_renees_organic_oven_interior_2847,
            name = "Renee's Tucson" ,
            location = "7065 E Tanque Verde Rd, Tucson, AZ 85715",
            description = ""
        ),
        Recommendation(
            image = R.drawable.tf_aqui_con_el_nene_sonoran_hot_dogs_5464,
            name = "Aqui Con El Nene",
            location = "4415 N Flowing Wells Rd, Tucson, AZ 85705",
            description = ""
        ),
        Recommendation(
            image = R.drawable.tf_tito_and_pep_pollo_asado_8650,
            name = "Tito and Pep",
            location = "4122 E Speedway Blvd, Tucson, AZ 85712",
            description = ""
        ),
        Recommendation(
            image = R.drawable.mi_nidito,
            name = "Mi Nidito",
            location = "1813 S 4th Ave, Tucson, AZ 85713",
            description = ""
        )

    )
}