package com.apolis.gm_assignment_colin.data.remote.response

import com.apolis.gm_assignment_colin.data.Artist
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    @SerializedName("resultCount")
    val resultCount: Int,

    @SerializedName("results")
    val results: ArrayList<Artist>
)
