package es.usj.mastertsa.onunez.visitrd

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONArray
import java.io.InputStream
import java.lang.Exception
import java.util.ArrayList
/*
class MyPlacesActivity : AppCompatActivity() {
    private val places = ArrayList<Places>()

    @SuppressLint("WrongConstant", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_places)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView2)


//        carView.setOnClickListener {
//            Toast.makeText(this,"pulsaste",Toast.LENGTH_LONG).show()
//
//        }
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(
            this, LinearLayout.VERTICAL, false
        )
        //var arreglo = arrayListOf<String>()


        val json: String?

        try {
            val inputStream: InputStream = assets.open("places.json")
            inputStream.buffered(5)
            json = inputStream.bufferedReader().use { it.readText() }
            val jsonarray = JSONArray(json)
            for (i in 0 until jsonarray.length()) {
                val jsonObject = jsonarray.getJSONObject(i)
                places.add(
                    Places(
                        jsonObject.optString("place") + "\n",
                                 jsonObject.optString("desc") + "\n",
                        jsonObject.optString("places")
                    )
                )

            }

            //creating our adapter
            val adapter = MyPlacesAdapter(places)
            //now adding the adapter to recyclerview
            recyclerView.adapter = adapter



        } catch (e: Exception) {

        }





    }
}
*/

