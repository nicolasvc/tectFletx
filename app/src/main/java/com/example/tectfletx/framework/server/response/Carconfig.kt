package com.example.tectfletx.framework.server.response

data class Carconfig(
    val apply_cartype: Boolean, // true
    val capacity: Int, // 37500
    val code: String, // 3s3
    val countries_id: Int, // 57
    val created_at: String, // 2019-02-27T10:36:34.358-05:00
    val description: String, // Tractomula de 3 ejes
    val equivalent: List<Int>,
    val fletxptos_kms: List<Any>,
    val id: Int, // 6
    val image: Image,
    val minimum_weight: Int, // 9690
    val order: Int, // 12
    val status: Int, // 1
    val updated_at: String, // 2019-05-15T17:50:06.485-05:00
    val volume_gl: Int, // 0
    val volume_mt: Int // 70
)