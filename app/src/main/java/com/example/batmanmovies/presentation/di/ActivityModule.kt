package com.example.batmanmovies.presentation.di

import com.example.batmanmovies.data.dataSource.MovieRepositoryImpl
import com.example.batmanmovies.data.dataSource.movie.LocalMovieDataSource
import com.example.batmanmovies.data.dataSource.movie.RemoteMovieDataSource
import com.example.batmanmovies.domain.repository.MovieCache
import com.example.batmanmovies.domain.repository.MovieRepository
import com.example.batmanmovies.domain.repository.RemoteMovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class ActivityModule {

    @Named("MovieRepoImpl")
    @ActivityScoped
    @Binds
    abstract fun bindMovieRepoImpl(movieRepoImpl: MovieRepositoryImpl): MovieRepository


}

