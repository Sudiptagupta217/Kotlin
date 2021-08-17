package app.riju.myfirstapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        findViewById<EditText>(R.id.val1)
        buttonAdd.setOnClickListener {

            val firstNo: Int
            val secondNo: Int
            try {

                firstNo = val1.text.toString().toInt()
                secondNo = val2.text.toString().toInt()

            } catch (e: NumberFormatException) {
                AlertDialog.Builder(this)
                    .setTitle("Invalid Operation")
                    .setMessage("Please enter both number to calculate")
                    .setPositiveButton("Ok", { dialogInterface, i ->  })
                    .setCancelable(false).show()

                return@setOnClickListener
            }

            val result = (firstNo + secondNo).toString()

            resultTV.text = result

            Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show()

        }
    }
}