package app.riju.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_course.view.*

class MainActivity : AppCompatActivity() {

    private val cources = listOf<Course>(
        Course("Android", "Arnav", 20, "Rs. " + 20000),
        Course("Java", "Amit", 25, "Rs. " + 24000),
        Course("Kotlin", "Deya", 30, "Rs. " + 25000),
        Course("PHP", "Rahul", 15, "Rs. " + 10000),
        Course(".Net", "Rakesh", 20, "Rs. " + 10000),
        Course("Pythan", "Anirban", 22, "Rs. " + 30000),
        Course("Dart", "Muskan", 24, "Rs. " + 15000),
        Course("Machine Learning", "Reja", 25, "Rs. " + 50000),
        Course("C", "Suresh", 25, "Rs. " + 5000),
        Course("C++", "Arnav", 30, "Rs. " + 5000),
        Course("MERN", "Riyanka", 45, "Rs. " + 30000),
        Course("Mongo Db", "Subham", 10, "Rs. " + 4500),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listCourcesNm.adapter = object : BaseAdapter() {
            override fun getCount() = cources.size

            override fun getItem(p0: Int): Course = cources[p0]

            override fun getItemId(p0: Int): Long = getItem(p0).hashCode().toLong()

            override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

                val itemView = layoutInflater.inflate(R.layout.list_item_course, p2, false)
                val course = getItem(p0)
                itemView.tvCourseName.text = course.courseName
                itemView.tvTeacterName.text=course.teacher
                itemView.tvCourseDetails.text="Lectures: "+course.lectures+" | Fees "+course.fees

                return itemView
            }

        }


        listCourcesNm.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Clicked on: ${cources[i]}", Toast.LENGTH_SHORT).show()
        }
    }
}