package com.example.tectfletx.features.maps.ui


import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.tectfletx.R
import com.example.tectfletx.databinding.ItemInfoWindowMapBinding
import com.example.tectfletx.features.parcelable.InfoVehicleParcelable
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*


class FragmentMap : Fragment() {

    private lateinit var infoVehicleParcelable: InfoVehicleParcelable
    private val safeArgs: FragmentMapArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_map, container, false)
        getParametersFragment()
        val supportMapFragment =
            childFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment?

        supportMapFragment!!.getMapAsync { googleMap ->
            googleMap.setInfoWindowAdapter(object: InfoWindowAdapter{
                override fun getInfoContents(p0: Marker): View? {
                    val v  = layoutInflater.inflate(R.layout.item_info_window_map,null)
                    val binding  = ItemInfoWindowMapBinding.bind(v)
                    binding.tvPlate.text = infoVehicleParcelable.plate
                    binding.tvColor.text = infoVehicleParcelable.color
                    binding.tvModel.text = infoVehicleParcelable.model
                    binding.tvBranch.text = infoVehicleParcelable.branch
                    binding.tvType.text = infoVehicleParcelable.type
                    return v
                }

                override fun getInfoWindow(p0: Marker): View? {
                    return null
                }

            })

            val latLng = LatLng( infoVehicleParcelable.latitude,infoVehicleParcelable.longitude)
            val vehicle = googleMap.addMarker(
                MarkerOptions()
                    .position(latLng)
                    .icon(bitmapDescriptorFromVector(requireActivity(),R.drawable.truck))
            )
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18f))
            vehicle?.showInfoWindow()
        }
        return view
    }


    private fun getParametersFragment() {
        infoVehicleParcelable = safeArgs.infoVehicle
    }


    private fun bitmapDescriptorFromVector(context: Context, vectorResId: Int): BitmapDescriptor? {
        return ContextCompat.getDrawable(context, vectorResId)?.run {
            setBounds(0, 0, intrinsicWidth, intrinsicHeight)
            val bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888)
            draw(Canvas(bitmap))
            BitmapDescriptorFactory.fromBitmap(bitmap)
        }
    }
}