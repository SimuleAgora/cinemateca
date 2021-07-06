package com.br.cinemateca.filmesflix.data

import com.br.natanfc.filmesflix.domain.Movie

interface MovieDataSource {

    fun getAllMovies(): List<Movie>

}