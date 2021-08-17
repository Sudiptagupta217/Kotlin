package app.riju.api.models


import com.squareup.moshi.Json

data class ArticleResponse(
    @Json(name = "article")
    val article: Article
)