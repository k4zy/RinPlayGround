package com.k4zy.rin.playground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform