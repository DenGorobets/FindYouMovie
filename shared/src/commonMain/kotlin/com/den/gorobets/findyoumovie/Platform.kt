package com.den.gorobets.findyoumovie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform