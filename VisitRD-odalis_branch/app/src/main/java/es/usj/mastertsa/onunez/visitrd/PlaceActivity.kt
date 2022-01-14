package es.usj.mastertsa.onunez.visitrd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_place.*
import android.widget.ImageView
import android.widget.LinearLayout
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView

class PlaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place)
         val tVPlace= findViewById<TextView>(R.id.TVplace)
        val tVLocat= findViewById<TextView>(R.id.TVdes)
        val bundle = intent.extras
        val PlaceDetail = bundle?.getString("PlaceDetail")
        val DescDetail = bundle?.getString("DescDetail")
        val PlaceSDetail = bundle?.getString("PlaceSDetail")
       // tVPlace.text =
        tvNameP.text=PlaceDetail
        tvLocationP.text=DescDetail
          tvDescription.text= PlaceSDetail


//        if (dato != null) {
//            for (i in dato) {
//
//                tvNameP.text=$dato.getText()
//                tvDescription.text=$dato[i]
//            }


                //val ll = findViewById<View>(R.id.llImages) as LinearLayout

    //        for (i in place.images) {
    //            val containerIv = CardView(this)
    //            val iv = ImageView(this)
    //            iv.setImageResource(i)
    //            iv.layoutParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams(550,550))
    //            containerIv.layoutParams = LinearLayout.LayoutParams( LinearLayout.LayoutParams(600,600))
    //            containerIv.addView(iv)
    //            ll.addView(containerIv)
    //        }
    //
    //        tvNameP.text = place.name
    //        tvLocationP.text = place.location
    //        tvDescription.text = place.description
    //        lvComments.adapter = adapterComment
            }
        }
