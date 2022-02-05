package com.smr.cinebox

data class Section(val name: String, val movieList: List<Movie>, var expanded: Boolean = true) {
}