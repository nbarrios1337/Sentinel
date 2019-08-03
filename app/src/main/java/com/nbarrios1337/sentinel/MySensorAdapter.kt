package com.nbarrios1337.sentinel

import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MySensorAdapter(private val context: Context, private val myDataset: Array<Sensor>) :
    RecyclerView.Adapter<MySensorAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        // create a new view
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.sensor_list_item, parent, false) as TextView
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(textView)
    }

    private fun showDetails(sensor: Sensor) {
        context.startActivity(Intent(context, SensorDetailsActivity::class.java).apply {
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_ID"), sensor.id)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_MAX_RANGE"), sensor.maximumRange)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_MIN_DELAY"), sensor.minDelay)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_NAME"), sensor.name)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_POWER"), sensor.power)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_REPORTING_MODE"), sensor.reportingMode)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_RESOLUTION"), sensor.resolution)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_STRINGTYPE"), sensor.stringType)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_TYPE"), sensor.type)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_VENDOR"), sensor.vendor)
            putExtra(R.string.app_id.toString().plus("SENSOR_DETAILS_VERSION"), sensor.version)
        })
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.text = myDataset[position].name
        holder.textView.setOnClickListener { showDetails(myDataset[position]) }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}