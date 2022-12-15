package com.example.domain.entities

data class DataDomain(
    val back_ownership_card: BackOwnershipCardDomain,
    val carcolor: CarcolorDomain,
    val carconfigDomain: CarconfigDomain,
    val carlineDomain: CarlineDomain,
    val carmarkDomain: CarmarkDomain,
    val cartypeDomain: CartypeDomain,
    val created_at: String, // 2020-12-14T12:20:42.817-05:00
    val driverDomain: DriverDomain?,
    val empty_weight: Int, // 7500
    val front_ownership_card: FrontOwnershipCardDomain,
    val front_vehicle: FrontVehicleDomain,
    val fuelDomain: FuelDomain,
    val has_gps_fletx: Boolean, // false
    val holder: HolderDomain,
    val id: Int, // 15685
    val insurance_poliy: InsurancePoliyDomain,
    val is_own_treatment: Boolean, // false
    val is_owner: Boolean, // false
    val load_capacity: Int, // 89000
    val lonlat: String, // POINT (-75.5936998 6.1795663)
    val maximum_weight: Int, // 52000
    val model: Int, // 2013
    val ownerDomain: OwnerDomain,
    val password: String,
    val photo_tecnomecanica: PhotoTecnomecanicaDomain,
    val picture_panoramic_vehicle: PicturePanoramicVehicleDomain,
    val placa: String, // SNT358
    val profileDomain: ProfileDomain,
    val rear_vehicle: RearVehicleDomain,
    val repowering: Int, // 0
    val satellite_provider: SatelliteProviderDomain?,
    val satellite_provider_id: Int?, // 6
    val soat_photo: SoatPhotoDomain,
    val status: Int, // 1
    val thirdstateDomain: ThirdstateDomain,
    val thirdstate_id: Int, // 9
    val trailerDomain: TrailerDomain?,
    val updated_at: String, // 2021-03-13T11:13:19.519-05:00
    val url: String, // http://st.fletx.co:3000/vehicles/15685.json
    val username: String,
    val vehicle_workshop: VehicleWorkshopDomain
)