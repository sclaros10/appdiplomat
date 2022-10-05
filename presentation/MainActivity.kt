package diplomado.unicafam.appdiplomat.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import android.view.KeyEvent
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import diplomado.unicafam.appdiplomat.R
import diplomado.unicafam.appdiplomat.domain.entity.PostEntity
import diplomado.unicafam.appdiplomat.presentation.adapters.PostAdapter
import diplomado.unicafam.appdiplomat.presentation.viewModel.PostViewModel

class MainActivity : AppCompatActivity() {

    private var listAdapter: PostAdapter? = null
    private lateinit var viewModel: PostViewModel
    private lateinit var rvListPost: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = PostViewModel()
        rvListPost = findViewById(R.id.rv_post_list)
        listAdapter = PostAdapter(viewModel.getListPostFromViewModel() as ArrayList<PostEntity>,this)

        val layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        rvListPost.layoutManager = layoutManager
        rvListPost.adapter = listAdapter


    }

    }






