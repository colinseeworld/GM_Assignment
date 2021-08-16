package com.apolis.gm_assignment_colin.data.remote

import com.apolis.gm_assignment_colin.data.remote.response.SearchResponse
import retrofit2.Response

class Repository(val apiService: ApiService): IRepository {
    override suspend fun search(searchTerm: String) = apiService.search(searchTerm)

}