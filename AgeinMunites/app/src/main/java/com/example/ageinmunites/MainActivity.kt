package com.example.ageinmunites

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { view ->
            clickDatePicker(view)
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun clickDatePicker(view: View) {

        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDayofMonth ->
                Toast.makeText(this, "The selected year is : $selectedYear", Toast.LENGTH_SHORT)
                    .show()

                val selectedDate = "$selectedDayofMonth/${selectedMonth + 1}/$selectedYear"

                selectedDatetv.text = selectedDate

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

                val theDate = sdf.parse(selectedDate)

                val formattedDate = myCalender.time

                val newdate = sdf.format(formattedDate.time)

//                selectedDateinMintv.text =newdate

            },
            year,
            month,
            day
        ).show()

    }

}
