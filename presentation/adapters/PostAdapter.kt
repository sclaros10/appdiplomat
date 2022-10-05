package diplomado.unicafam.appdiplomat.presentation.adapters

import android.content.ClipData
import android.content.Context
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import diplomado.unicafam.appdiplomat.R
import diplomado.unicafam.appdiplomat.domain.entity.PostEntity
import kotlin.coroutines.coroutineContext

class PostAdapter(listPost:ArrayList<PostEntity>,context:Context): RecyclerView.Adapter<PostAdapter.MyViewHolder>(){

    private var fullListPost: ArrayList<PostEntity> = listPost
    var contexto = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtUserFullName.text = fullListPost[position].fullName
        holder.userName.text = fullListPost[position].userName
        holder.txtPostText.text = fullListPost[position].post
        holder.txtHashTag.text = fullListPost[position].hashtag
        Glide.with(contexto)
            .load(fullListPost[position].imgProfile)
            .into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return fullListPost.size
    }

    inner class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var txtUserFullName: TextView = view.findViewById(R.id.txt_user_full_name)
        var userName: TextView = view.findViewById(R.id.txt_user_name)
        var txtPostText: TextView = view.findViewById(R.id.txt_post_text)
        var txtHashTag: TextView = view.findViewById(R.id.txt_hashtag)
        var imgProfile: ImageView = view.findViewById(R.id.imgProfile)

     }

    }

