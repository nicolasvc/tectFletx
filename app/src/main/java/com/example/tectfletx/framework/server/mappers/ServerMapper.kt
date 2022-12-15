package com.example.tectfletx.framework.server.mappers

import com.example.domain.entities.*
import com.example.tectfletx.framework.server.response.*
import com.example.tectfletx.framework.server.response.FrontCard
import com.example.tectfletx.framework.server.response.Trailer
import com.example.tectfletx.framework.server.response.VehicleWorkshop


fun ResponseVehicleServer.toResponseVehicleDomain() =
    ResponseVehicleDomain(data.map { it.toDataDomain() }, message, success)


fun DataServer.toDataDomain() = DataDomain(
    back_ownership_card.toBackOwnershipCardDomain(),
    carcolor.toCarcolorDomain(),
    carconfig.toCarconfigDomain(),
    carline.toCarlineDomain(),
    carmark.toCarkMarkDomain(),
    cartype.toCartypeDomain(),
    created_at,
    driver?.toDriverDomain(),
    empty_weight,
    front_ownership_card.toFrontOwnershipCardDomain(),
    front_vehicle.toFrontVehicleDomain(),
    fuel.toFuelDomain(),
    has_gps_fletx,
    holder.toHolderDomain(),
    id,
    insurance_poliy.toInsurancePolicy(),
    is_own_treatment,
    is_owner,
    load_capacity,
    lonlat,
    maximum_weight,
    model,
    owner.toOwnerDomain(),
    password,
    photo_tecnomecanica.toPhotoTecnomecanicaDomain(),
    picture_panoramic_vehicle.toPicturePanoramicVehicleDomain(),
    placa,
    profile.toProfileDomain(),
    rear_vehicle.toRearVehicleDomain(),
    repowering,
    satellite_provider?.toSatelliteProviderDomain(),
    satellite_provider_id,
    soat_photo.toSoatPhotoDomain(),
    status,
    thirdstate.toThirdStateDomain(),
    thirdstate_id,
    trailer?.toTrailerDomain(),
    updated_at,
    url,
    username,
    vehicle_workshop.toVehicleWorkShopDomain()
)

fun BackOwnershipCard.toBackOwnershipCardDomain() = BackOwnershipCardDomain(
    url
)

fun Carcolor.toCarcolorDomain() = CarcolorDomain(
    created_at,
    id,
    name,
    partner_id,
    status,
    updated_at,
    value
)

fun Carconfig.toCarconfigDomain() = CarconfigDomain(
    apply_cartype,
    capacity,
    code,
    countries_id,
    created_at,
    description,
    equivalent,
    fletxptos_kms,
    id,
    image.toImageDomain(),
    minimum_weight,
    order,
    status,
    updated_at,
    volume_gl,
    volume_mt
)

fun Image.toImageDomain() = ImageDomain(url)

fun Carline.toCarlineDomain() = CarlineDomain(
    carmarks_id,
    created_at,
    id,
    name,
    partner_id,
    status,
    updated_at,
    value
)

fun Carmark.toCarkMarkDomain() = CarmarkDomain(
    code_mint,
    created_at,
    id,
    name,
    partner_id,
    status,
    updated_at
)

fun Cartype.toCartypeDomain() = CartypeDomain(
    code_mint,
    created_at,
    equivalent,
    id,
    kind,
    name,
    partner_id,
    status,
    updated_at
)

fun Driver.toDriverDomain() = DriverDomain(
    full_name,
    id,
    thirdstates_id
)

fun FrontOwnershipCard.toFrontOwnershipCardDomain() = FrontOwnershipCardDomain(
    url
)

fun FrontVehicle.toFrontVehicleDomain() = FrontVehicleDomain(url)

fun Fuel.toFuelDomain() = FuelDomain(
    created_at,
    id,
    name,
    status,
    updated_at,
    value
)

fun Holder.toHolderDomain() = HolderDomain(
    full_name,
    id,
    thirdstates_id
)

fun InsurancePoliy.toInsurancePolicy() = InsurancePoliyDomain(url)

fun Owner.toOwnerDomain() = OwnerDomain(
    full_name,
    id,
    thirdstates_id
)

fun PhotoTecnomecanica.toPhotoTecnomecanicaDomain() = PhotoTecnomecanicaDomain(url)

fun PicturePanoramicVehicle.toPicturePanoramicVehicleDomain() = PicturePanoramicVehicleDomain(url)

fun Profile.toProfileDomain() = ProfileDomain(
    config.toConfigDomain(),
    expired_documents,
    soat.toSoatDomain(),
    tecnomecanica.toTecnoMecanicaDomain()
)

fun Config.toConfigDomain() = ConfigDomain(
    chassis_number,
    engine_number
)

fun Soat.toSoatDomain() = SoatDomain(
    date_expired,
    ensure_id,
    number
)

fun Tecnomecanica.toTecnoMecanicaDomain() = TecnomecanicaDomain(
    date_expired,
    number
)

fun RearVehicle.toRearVehicleDomain() = RearVehicleDomain(url)

fun SatelliteProvider.toSatelliteProviderDomain() = SatelliteProviderDomain(
    created_at,
    id,
    name,
    status,
    updated_at,
    website
)

fun SoatPhoto.toSoatPhotoDomain() = SoatPhotoDomain(url)

fun Thirdstate.toThirdStateDomain() = ThirdstateDomain(
    created_at,
    id,
    name,
    status,
    updated_at
)

fun Trailer.toTrailerDomain() = TrailerDomain(
    back_card.toBackCardDomain(),
    carcolor_id,
    cartype.toCartypeDomain(),
    cartype_id,
    empty_weight,
    front_card.toFrontCardDomain(),
    holder_id,
    id,
    maximum_weight,
    model,
    num_axes,
    owner_id,
    picture.toPictureDomain(),
    placa,
    trailermark.toTrailerMarkDomain(),
    trailermark_id,
    vehicle_id
)

fun BackCard.toBackCardDomain() = BackCardDomain(url)

fun FrontCard.toFrontCardDomain() = FrontCardDomain(url)

fun Picture.toPictureDomain() = PictureDomain(url)

fun Trailermark.toTrailerMarkDomain() = TrailermarkDomain(
    code_mint,
    created_at,
    id,
    name,
    partner_id,
    status,
    updated_at
)

fun VehicleWorkshop.toVehicleWorkShopDomain() = VehicleWorkshopDomain(
    created_at,
    engine,
    gearbox,
    id,
    tires,
    transmission,
    updated_at,
    vehicle_id
)