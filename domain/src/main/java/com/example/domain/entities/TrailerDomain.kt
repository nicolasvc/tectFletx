package com.example.domain.entities

data class TrailerDomain(
    val back_card: BackCardDomain,
    val carcolor_id: Int, // 5596
    val cartypeDomain: CartypeDomain,
    val cartype_id: Int, // 1
    val empty_weight: String, // 7500
    val front_card: FrontCardDomain,
    val holder_id: Int, // 2282
    val id: Int, // 8334
    val maximum_weight: Int, // 52000
    val model: Int, // 2011
    val num_axes: String, // 3
    val owner_id: Int, // 19673
    val picture: PictureDomain,
    val placa: String, // R64894
    val trailermark: TrailermarkDomain,
    val trailermark_id: Int, // 663
    val vehicle_id: Int // 15685
)