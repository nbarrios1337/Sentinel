package com.nbarrios1337.sentinel

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SensorDetailsActivity : AppCompatActivity() {

    private val TAG = "SENSOR_DETAILS_LOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_details)
        Log.i(TAG, "in onCreate of SensorDetailsActivity")

        val keyPrefix = R.string.app_id.toString().plus("SENSOR_DETAILS_")

        val idTextView = findViewById<TextView>(R.id.sensor_details_id)
        idTextView.text = idTextView.text.toString().plus(" ").plus(intent.getIntExtra(keyPrefix.plus("ID"), 999))
        Log.d(TAG, "ID: ".plus(idTextView.text.toString()))

        val maxRangeTextView = findViewById<TextView>(R.id.sensor_details_max_range)
        maxRangeTextView.text = maxRangeTextView.text.toString().plus(" ")
            .plus(intent.getFloatExtra(keyPrefix.plus("MAX_RANGE"), (999).toFloat()))
        Log.d(TAG, "MAX_RANGE: ".plus(maxRangeTextView.text.toString()))

        val minDelayTextView = findViewById<TextView>(R.id.sensor_details_min_delay)
        minDelayTextView.text =
            minDelayTextView.text.toString().plus(" ").plus(intent.getIntExtra(keyPrefix.plus("MIN_DELAY"), 999))
        Log.d(TAG, "MIN_DELAY: ".plus(minDelayTextView.text.toString()))

        val nameTextView = findViewById<TextView>(R.id.sensor_details_name)
        nameTextView.text = nameTextView.text.toString().plus(" ").plus(intent.getStringExtra(keyPrefix.plus("NAME")))
        Log.d(TAG, "NAME: ".plus(nameTextView.text.toString()))

        val powerTextView = findViewById<TextView>(R.id.sensor_details_power)
        powerTextView.text =
            powerTextView.text.toString().plus(" ").plus(intent.getFloatExtra(keyPrefix.plus("POWER"), (999).toFloat()))
        Log.d(TAG, "POWER: ".plus(powerTextView.text.toString()))

        val reportingModeTextView = findViewById<TextView>(R.id.sensor_details_reporting_mode)
        reportingModeTextView.text = reportingModeTextView.text.toString().plus(" ")
            .plus(intent.getIntExtra(keyPrefix.plus("REPORTING_MODE"), 999))
        Log.d(TAG, "REPORTING_MODE: ".plus(reportingModeTextView.text.toString()))

        val resolutionTextView = findViewById<TextView>(R.id.sensor_details_resolution)
        resolutionTextView.text = resolutionTextView.text.toString().plus(" ")
            .plus(intent.getFloatExtra(keyPrefix.plus("RESOLUTION"), (999).toFloat()))
        Log.d(TAG, "RESOLUTION: ".plus(resolutionTextView.text.toString()))

        val stringTypeTextView = findViewById<TextView>(R.id.sensor_details_stringtype)
        stringTypeTextView.text =
            stringTypeTextView.text.toString().plus(" ").plus(intent.getStringExtra(keyPrefix.plus("STRINGTYPE")))
        Log.d(TAG, "STRINGTYPE: ".plus(stringTypeTextView.text.toString()))

        val typeTextView = findViewById<TextView>(R.id.sensor_details_type)
        typeTextView.text = typeTextView.text.toString().plus(" ").plus(intent.getIntExtra(keyPrefix.plus("TYPE"), 999))
        Log.d(TAG, "TYPE: ".plus(typeTextView.text.toString()))

        val vendorTextView = findViewById<TextView>(R.id.sensor_details_vendor)
        vendorTextView.text =
            vendorTextView.text.toString().plus(" ").plus(intent.getStringExtra(keyPrefix.plus("VENDOR")))
        Log.d(TAG, "VENDOR: ".plus(vendorTextView.text.toString()))

        val versionTextView = findViewById<TextView>(R.id.sensor_details_version)
        versionTextView.text =
            versionTextView.text.toString().plus(" ").plus(intent.getIntExtra(keyPrefix.plus("VERSION"), 999))
        Log.d(TAG, "VERSION: ".plus(versionTextView.text.toString()))
    }
}
