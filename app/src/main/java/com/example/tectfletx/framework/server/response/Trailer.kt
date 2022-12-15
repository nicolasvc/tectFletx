package com.example.tectfletx.framework.server.response

data class Trailer(
    val back_card: BackCard,
    val carcolor_id: Int, // 5596
    val cartype: Cartype,
    val cartype_id: Int, // 1
    val empty_weight: String, // 7500
    val front_card: FrontCard,
    val holder_id: Int, // 2282
    val id: Int, // 8334
    val maximum_weight: Int, // 52000
    val model: Int, // 2011
    val num_axes: String, // 3
    val owner_id: Int, // 19673
    val picture: Picture,
    val placa: String, // R64894
    val trailermark: Trailermark,
    val trailermark_id: Int, // 663
    val vehicle_id: Int // 15685
)