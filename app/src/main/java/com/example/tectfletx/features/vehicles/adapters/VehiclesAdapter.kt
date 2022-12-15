package com.example.tectfletx.features.vehicles.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.entities.DataDomain
import com.example.domain.entities.DriverDomain
import com.example.tectfletx.R
import com.example.tectfletx.databinding.ItemVehicleBinding
import com.example.tectfletx.features.changeUrl

class VehiclesAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val diffCallback = object : DiffUtil.ItemCallback<DataDomain>() {

        override fun areItemsTheSame(
            oldItem: DataDomain,
            newItem: DataDomain
        ): Boolean {
            return true
        }

        override fun areContentsTheSame(
            oldItem: DataDomain,
            newItem: DataDomain
        ): Boolean {
            return false
        }

    }
    private val differ = AsyncListDiffer(this, diffCallback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return VehiclesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_vehicle,
                parent,
                false
            ),
            interaction
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is VehiclesViewHolder -> {
                holder.bind(differ.currentList[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    fun submitList(list: List<DataDomain>) {
        differ.submitList(list)
    }

    class VehiclesViewHolder
    constructor(
        itemView: View,
        private val interaction: Interaction?
    ) : RecyclerView.ViewHolder(itemView) {

        private val binding = ItemVehicleBinding.bind(itemView)

        fun bind(item: DataDomain) = with(itemView) {

            itemView.setOnClickListener {
                interaction?.onItemSelected(layoutPosition, item)
            }
            binding.tvPlateVehicle.text = item.placa
            binding.tvNameDriver.text = getNameDriver(item.driverDomain)
            binding.tvAvailable.text = if (item.status == 1) "Disponible" else "No disponible"
            Glide.with(this).load(item.front_vehicle.url.changeUrl()).into(binding.imageView)
            validateTrailer(this,item)

        }

        private fun validateTrailer(itemView:View,item: DataDomain) {
            item.trailerDomain?.let {
                binding.tvPlateTrailer.text = it.placa
                return
            }
            binding.tvPlateTrailer.visibility = View.GONE
            binding.textView4.text = itemView.context.getString(R.string.not_trailer)


        }

        private fun getNameDriver(driverDomain: DriverDomain?): CharSequence {
            var nameDriver = "Sin conductor"
            driverDomain?.let {
                nameDriver = it.full_name
            }
            return nameDriver
        }
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: DataDomain)
    }
}
