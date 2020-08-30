package com.example.zomentum_tushar_chopra

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.zomentum_tushar_chopra.Models.Contacts

class chatAdapterClass(
    activity: MainActivity,
    val itemList: ArrayList<Contacts>

): RecyclerView.Adapter<chatAdapterClass.ChatAdapterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_stories,parent,false)
        return ChatAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ChatAdapterViewHolder, position: Int) {
        val Contacts = itemList[position]
        holder.txtTime.text = Contacts.txttime
        holder.txtDesc.text = Contacts.txtdesc
        holder.txtName.text = Contacts.txtname
        holder.imgDp.setImageResource(Contacts.imgDp)

    }


    class ChatAdapterViewHolder(view: View):RecyclerView.ViewHolder(view){
        val txtName = view.findViewById<TextView>(R.id.txtname)
        val txtDesc = view.findViewById<TextView>(R.id.txtdesc)
        val imgDp = view.findViewById<ImageView>(R.id.img_dp)
        val txtTime = view.findViewById<TextView>(R.id.txttime)
        val llRecycler = view.findViewById<LinearLayout>(R.id.llrecycler)
        val rlText = view.findViewById<RelativeLayout>(R.id.rltext)
    }

}
