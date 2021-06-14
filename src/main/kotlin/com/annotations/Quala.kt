package com.annotations

import org.springframework.stereotype.Component

@Component
class Quala(
    private val eat: Boolean = false,

    @AllowedNames(["Abadi", "Amir", "Tamar", "Lilach", "Dinora"])
    val name: String
)