package com.example.routes

import com.example.Constants.BASE_URL
import com.example.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/pic1.jpg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/pic2.jpg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/pic3.jpg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/pic4.jpg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/pic5.jpg"),
)
fun Route.randomRabbit() {
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}