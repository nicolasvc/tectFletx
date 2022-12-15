package com.example.tectfletx.framework.server.response

data class DataServer(
    val back_ownership_card: BackOwnershipCard,
    val carcolor: Carcolor,
    val carconfig: Carconfig,
    val carline: Carline,
    val carmark: Carmark,
    val cartype: Cartype,
    val created_at: String, // 2020-12-14T12:20:42.817-05:00
    val driver: Driver?,
    val empty_weight: Int, // 7500
    val front_ownership_card: FrontOwnershipCard,
    val front_vehicle: FrontVehicle,
    val fuel: Fuel,
    val has_gps_fletx: Boolean, // false
    val holder: Holder,
    val id: Int, // 15685
    val insurance_poliy: InsurancePoliy,
    val is_own_treatment: Boolean, // false
    val is_owner: Boolean, // false
    val load_capacity: Int, // 89000
    val lonlat: String, // POINT (-75.5936998 6.1795663)
    val maximum_weight: Int, // 52000
    val model: Int, // 2013
    val owner: Owner,
    val password: String,
    val photo_tecnomecanica: PhotoTecnomecanica,
    val picture_panoramic_vehicle: PicturePanoramicVehicle,
    val placa: String, // SNT358
    val profile: Profile,
    val rear_vehicle: RearVehicle,
    val repowering: Int, // 0
    val satellite_provider: SatelliteProvider?,
    val satellite_provider_id: Int?, // 6
    val soat_photo: SoatPhoto,
    val status: Int, // 1
    val thirdstate: Thirdstate,
    val thirdstate_id: Int, // 9
    val trailer: Trailer?,
    val updated_at: String, // 2021-03-13T11:13:19.519-05:00
    val url: String, // http://st.fletx.co:3000/vehicles/15685.json
    val username: String,
    val vehicle_workshop: VehicleWorkshop
)