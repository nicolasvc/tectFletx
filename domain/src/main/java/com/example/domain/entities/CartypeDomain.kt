package com.example.domain.entities

data class CartypeDomain(
    val code_mint: Int, // 1
    val created_at: String, // 2019-02-18T11:02:33.676-05:00
    val equivalent: List<Int>,
    val id: Int, // 1
    val kind: String?, // estacas
    val name: String, // Estacas
    val partner_id: Int, // 1
    val status: Int, // 1
    val updated_at: String // 2019-02-18T11:02:33.676-05:00
)