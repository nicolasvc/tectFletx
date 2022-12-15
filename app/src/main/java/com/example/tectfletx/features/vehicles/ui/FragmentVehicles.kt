package com.example.tectfletx.features.vehicles.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.domain.entities.DataDomain
import com.example.tectfletx.R
import com.example.tectfletx.databinding.FragmentVehiclesBinding
import com.example.tectfletx.features.launchAndCollect
import com.example.tectfletx.features.parcelable.toInfoVehicleParcelable
import com.example.tectfletx.features.vehicles.adapters.VehiclesAdapter
import com.example.tectfletx.features.vehicles.viewmodel.VehiclesViewModel
import com.faltenreich.skeletonlayout.Skeleton
import com.faltenreich.skeletonlayout.applySkeleton
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentVehicles : Fragment(R.layout.fragment_vehicles), VehiclesAdapter.Interaction {

    private val vehiclesViewModel: VehiclesViewModel by viewModels()
    private var fragmentBinding: FragmentVehiclesBinding? = null
    private val vehiclesAdapter: VehiclesAdapter = VehiclesAdapter(this)
    private lateinit var skeleton: Skeleton


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentVehiclesBinding.bind(view)
        fragmentBinding = binding
        initializeRecyclers()
        subscribeObservers()
        getData()
        skeleton = fragmentBinding!!.recyclerVehicles.applySkeleton(R.layout.item_vehicle, 10)


    }

    private fun getData() {
        vehiclesViewModel.getVehicles()
    }

    private fun initializeRecyclers() {
        fragmentBinding!!.recyclerVehicles.apply {
            adapter = vehiclesAdapter
        }
    }

    private fun handleSkeleton(loading: Boolean) {
        if (loading) {
            skeleton.showSkeleton()
        } else {
            skeleton.showOriginal()
        }
    }


    private fun subscribeObservers() {
        viewLifecycleOwner.launchAndCollect(vehiclesViewModel.state) { state ->
            updateUI(state)
        }

    }

    private fun updateUI(state: VehiclesViewModel.UIState) {
        state.responseVehicles?.let {
            vehiclesAdapter.submitList(it.data)
        }
        state.error?.let {
            showError(it.toString())
        }
        handleSkeleton(state.loading)
    }

    private fun showError(msg: String) {
        Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
    }


    override fun onItemSelected(position: Int, item: DataDomain) {
        val regex = Regex("\\d+")
        val resultList = regex.findAll(item.lonlat).map { it.value }.toList()
        val longitude = String.format("-%s.%s",resultList[0],resultList[1]).toDouble()
        val latitude = String.format("%s.%s",resultList[2],resultList[3]).toDouble()

        findNavController().navigate(FragmentVehiclesDirections.actionFragmentVehiclesToFragmentMap(item.toInfoVehicleParcelable(latitude,longitude)))
    }
}