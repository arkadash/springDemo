package com.annotations

class Quala(
    private val eat: Boolean = false,

    @AllowedNames(["Abadi", "Amir", "Tamar", "Lilach", "Dinora"])
    val name: String,
)