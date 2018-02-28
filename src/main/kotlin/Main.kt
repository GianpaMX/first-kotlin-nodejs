external fun require(module: String): dynamic

fun main(args: Array<String>) {

    val express = require("express")
    val app = express()

    app.get("/", { request, response ->
        response.type("text/plain")
        response.send("Hello GDLJS! Welcome to the KotlinJS")
    })

    app.listen(3000, {
        println("Listening to request on port 3000")
    })
}
