package com.apolis.gm_assignment_colin.ui.searchartist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apolis.gm_assignment_colin.data.remote.ApiClient
import com.apolis.gm_assignment_colin.data.remote.ApiService
import com.apolis.gm_assignment_colin.data.remote.IRepository
import com.apolis.gm_assignment_colin.data.remote.Repository
import java.io.InvalidClassException

class SearchArtistViewModelFactory(val repository: IRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SearchArtistViewModel::class.java)) {
            return SearchArtistViewModel(repository) as T
        }
        throw InvalidClassException("Invalid class: ${modelClass.simpleName}")
    }
}