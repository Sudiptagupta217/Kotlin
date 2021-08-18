package com.example.retrofildemo.network

import com.squareup.moshi.Json
import java.util.regex.MatchResult


data class Character(
    @Json(name = "name")
    val name: String,
    @Json(name = "image")
    val image: String
)

data class CharacterResponse(
    @Json(name = "results")
    val result: List<Character>
)