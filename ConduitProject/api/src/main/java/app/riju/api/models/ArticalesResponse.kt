package app.riju.api.models


import com.squareup.moshi.Json

data class ArticalesResponse(
    @Json(name = "articles")
    val articles: List<Article>,
    @Json(name = "articlesCount")
    val articlesCount: Int
)