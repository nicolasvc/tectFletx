package com.example.tectfletx.framework.server.response

data class Profile(
    val config: Config,
    val expired_documents: List<String>,
    val soat: Soat,
    val tecnomecanica: Tecnomecanica
)