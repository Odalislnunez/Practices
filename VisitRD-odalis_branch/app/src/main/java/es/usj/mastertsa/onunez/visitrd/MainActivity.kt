package es.usj.mastertsa.onunez.visitrd

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View

import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_place.*
import org.json.JSONArray
import java.io.InputStream
import java.lang.Exception
import java.util.ArrayList
import android.content.DialogInterface
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    private val places = ArrayList<Places>()
    private val Imageplaces = ArrayList<MyImagesAdapter>()
    private val PlaceDetail = "PlaceDetail"
    private val PlaceSDetail = "PlaceSDetail"
    private val DescDetail = "DescDetail"
    private val LocaDetail = "LocaDetail"
    @SuppressLint("WrongConstant", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_places)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView2)


//        carView.setOnClickListener {
//
//
//        }
        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(
            this, LinearLayout.VERTICAL, false
        )

       // recyclerView.setOnClickListener { Toast.makeText(this,"pulsaste",Toast.LENGTH_LONG).show() }
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
            adapter.setOnItemClickListener(object: MyPlacesAdapter.onItemClickListener{
                override fun onItemClick(position: Int) {

                   // Imageplaces.size


                    var  current = places[position]
//                    current.Myplace
//                    current.Desc
//                    current.Places
                    val intento1 =Intent(this@MainActivity, PlaceActivity::class.java)
                    intento1.putExtra("PlaceDetail", current.Myplace)
                    intento1.putExtra("DescDetail",current.Desc)
                    intento1.putExtra("PlaceSDetail",current.Places)
                    startActivity(intento1)




//                    val builder1 = AlertDialog.Builder(this@MainActivity)
//                    builder1.setMessage("Write your message here.$position")
//                    builder1.setCancelable(true)
//
//                    builder1.setPositiveButton(
//                        "Yes"
//                    ) { dialog, id -> dialog.cancel() }
//
//                    builder1.setNegativeButton(
//                        "No"
//                    ) { dialog, id -> dialog.cancel() }
//
//                    val alert11 = builder1.create()
//                    alert11.show()
//                    if (position == 4)
//                    {
//                       // Toast.makeText(this@MainActivity,"HAS MARCDO $position",Toast.LENGTH_SHORT).show()
//
//
//                    }


                }

                override fun onClick(v: View?) {
                    TODO("Not yet implemented")
                }

            })



            //recyclerView.



        } catch (e: Exception) {

        }




        //instancias
        val rBar = findViewById<RatingBar>(R.id.rBar)

        //button bbar submit

        if (rBar != null) {
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(
                    this@MainActivity,
                    "Rating is: $msg", Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

