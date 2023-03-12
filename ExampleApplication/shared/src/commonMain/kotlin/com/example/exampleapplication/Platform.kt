package com.example.exampleapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform