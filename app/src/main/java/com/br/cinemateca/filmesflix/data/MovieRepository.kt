package com.br.cinemateca.filmesflix.data

class MovieRepository(private val movieDataSource: MovieDataSource) {

    fun getAllMoviesFromDataSource() = movieDataSource.getAllMovies()

}