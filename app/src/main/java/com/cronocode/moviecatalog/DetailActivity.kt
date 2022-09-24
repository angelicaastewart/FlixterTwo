package com.cronocode.moviecatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cronocode.moviecatalog.models.Movie
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_details.view.*

import kotlinx.android.synthetic.main.movie_item.view.*

class DetailActivity : AppCompatActivity() {

    private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val movie = intent.getParcelableExtra<Movie>(MainActivity.INTENT_PARCELABLE)

        val dtitle = findViewById<TextView>(R.id.dtitle)
        val dcontent = findViewById<TextView>(R.id.dcontent)
        val dpopularity = findViewById<TextView>(R.id.dpopularity)
        val dposter = findViewById<ImageView>(R.id.poster_image)
        val dvote = findViewById<TextView>(R.id.dvote)
        val lang = findViewById<TextView>(R.id.lang)

        dtitle.dtitle.text = movie?.title
        dcontent.dcontent.text = movie?.overview
        dpopularity.dpopularity.text = movie?.popularity
        dvote.dvote.text = movie?.release
        lang.lang.text = movie?.lang
        Glide.with(dposter).load(IMAGE_BASE + movie?.poster).into(dposter.poster_image)
    }
}