package com.heytech.biller

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform