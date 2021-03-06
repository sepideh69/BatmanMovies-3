package com.example.batmanmovies.data.dataSource.movie

import android.util.Log
import com.example.batmanmovies.data.remote.ApiService
import com.example.batmanmovies.domain.repository.RemoteMovieRepository
import com.example.batmanmovies.presentation.entity.MovieEntity
import com.example.batmanmovies.presentation.mapper.toEntity
import com.example.batmanmovies.utill.Constant.API_KEY

import com.example.batmanmovies.utill.Constant.KEY_STRING
import com.example.batmanmovies.utill.Constant.TAG
import javax.inject.Inject

class RemoteMovieDataSource @Inject constructor(private val apiService: ApiService) :
    RemoteMovieRepository {

    override suspend fun getMovies(): List<MovieEntity> {
        Log.d(TAG, "getMovies: remote")
        return apiService.getMovies(
            API_KEY,
            KEY_STRING
        ).movieList.toEntity()

    }

}