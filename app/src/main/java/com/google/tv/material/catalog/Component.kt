
package com.google.tv.material.catalog

val foundations = listOf(
    Component.Color,
    Component.Typography,
    Component.Motion,
    Component.Interaction,
)

val components = listOf(
    Component.Button,
    Component.Card,
    Component.Chip,
    Component.ListItem,

    )





enum class Component(val title: String, val imageArg: String, val routeValue: String) {
    Color(
        title = "Gastronomía",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2022/10/PHOTO-2022-10-11-15-43-52-980x845.jpg",
        routeValue = NavGraph.Color.routeName
    ),
    Typography(
        title = "Biotecnología",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2022/10/309916826_184486057440844_1103211790445868933_n-980x735.jpg",
        routeValue = NavGraph.Typography.routeName
    ),
    Motion(
        title = "Desarrollo de Software",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2022/09/277987761_2774282722717892_2056920227555008069_n.jpg",
        routeValue = NavGraph.Motion.routeName
    ),
    Interaction(
        title = "Redes Digitales",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2024/02/WhatsApp-Image-2024-02-23-at-08.33.37-480x640.jpeg",
        routeValue = NavGraph.Interaction.routeName
    ),
    Button(
        title = "Modelo 60% Práctica",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2024/02/WhatsApp-Image-2024-02-23-at-09.07.10.jpeg",
        routeValue = NavGraph.Buttons.routeName
    ),
    Card(
        title = "Aula-Taller y Laboratorios",
        imageArg = "https://i.ytimg.com/vi/xNP81Fkh5hE/maxresdefault.jpg",
        routeValue = NavGraph.Cards.routeName
    ),
    Chip(
        title = "Aprendizaje por Competencias",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2024/02/WhatsApp-Image-2024-02-23-at-09.00.58.jpeg",
        routeValue = NavGraph.Chips.routeName
    ),
    ListItem(
        title = "Vinculación y Estadías",
        imageArg = "https://utom.edu.mx/wp-content/uploads/2024/02/IMG_3012-scaled.jpg",
        routeValue = NavGraph.Lists.routeName
    ),



}
