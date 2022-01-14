package es.usj.mastertsa.onunez.visitrd

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*


import kotlin.collections.ArrayList

@Suppress("UNREACHABLE_CODE")
class MyPlacesAdapter (private val placesList: ArrayList<Places>) :
    Adapter<MyPlacesAdapter.ViewHolder>() {


//varaiabl
private  lateinit var  mListener: View.OnClickListener
//crando la interfaz
interface  onItemClickListener : View.OnClickListener {
    fun onItemClick(position: Int)
}
    fun setOnItemClickListener(listener:onItemClickListener)
    {
        mListener = listener

    }






        //Arreglo de imaneges
        private val images: IntArray
            get() = intArrayOf(



                R.drawable.a,
                R.drawable.b,
                R.drawable.c ,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f ,
                R.drawable.g,
                R.drawable.h,
                R.drawable.j,
                R.drawable.l,
                R.drawable.k,
                R.drawable.m,
                R.drawable.n,
                R.drawable.o,
                R.drawable.p,
                R.drawable.q,
                R.drawable.r,
                R.drawable.s,
                R.drawable.t,
                R.drawable.v,
                R.drawable.w,
                R.drawable.x,
                R.drawable.y,
                R.drawable.ab,
                R.drawable.ac,
                R.drawable.ad,
                R.drawable.ae,
                R.drawable.af,
                R.drawable.ag,
                R.drawable.ah,
                R.drawable.aj

            )




    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_viewdegn, parent, false)
        return ViewHolder(v, mListener as onItemClickListener )
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.bindItems(placesList[position])
        try {
            holder.itemImage?.setImageResource(images[position])
        }   catch (e: Exception) {


    }

}


    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return placesList.size
        //return  dreamsFilterList.size
    }

    //the class is hodling the list view
    @SuppressLint("ParcelCreator")
    class ViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView), Parcelable {

        var itemImage: ImageView? = itemView.findViewById(R.id.image1)




        init{
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition )
            }


        }

        fun bindItems(places: Places) {
            val textViewPlace = itemView.findViewById(R.id.TVplace) as TextView
            val textViewDesc  = itemView.findViewById(R.id.TVdes) as TextView
            val textViewPlaces  = itemView.findViewById(R.id.TVplaces) as TextView

            textViewPlace.text = places.Myplace
            textViewDesc.text =places.Desc
            textViewPlaces.text =places.Places


        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {

        }

        override fun describeContents(): Int {
            return 0
        }


    }

}