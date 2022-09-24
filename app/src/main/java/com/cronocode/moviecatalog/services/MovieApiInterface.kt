package com.cronocode.moviecatalog.services

import com.cronocode.moviecatalog.models.MovieResponse

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/now_playing?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed&language=en-US&page=1")
    fun getMovieList(): Call<MovieResponse>

}
