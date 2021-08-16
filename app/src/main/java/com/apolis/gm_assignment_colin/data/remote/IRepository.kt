package com.apolis.gm_assignment_colin.data.remote

import com.apolis.gm_assignment_colin.data.remote.response.SearchResponse
import retrofit2.Response
import java.net.SocketException

interface IRepository {
    @Throws(SocketException::class)
    suspend fun search(searchTerm: String): Response<SearchResponse>
}