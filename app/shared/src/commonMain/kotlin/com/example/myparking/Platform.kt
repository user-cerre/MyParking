package com.example.myparking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform