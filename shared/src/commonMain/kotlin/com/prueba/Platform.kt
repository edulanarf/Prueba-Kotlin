package com.prueba

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform