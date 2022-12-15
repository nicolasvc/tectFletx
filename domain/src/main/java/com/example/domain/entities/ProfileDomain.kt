package com.example.domain.entities

data class ProfileDomain(
    val configDomain: ConfigDomain,
    val expired_documents: List<String>,
    val soat: SoatDomain,
    val tecnomecanicaDomain: TecnomecanicaDomain
)