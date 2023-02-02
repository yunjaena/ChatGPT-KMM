package dev.yunzai.chatgpt_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform