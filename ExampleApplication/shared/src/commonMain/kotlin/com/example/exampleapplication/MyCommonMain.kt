package com.example.exampleapplication

class MyCommonMain {

    private val platform: Platform = getPlatform()

    fun message(): String {
        return "Camerax on ${platform.name}"
    }
}