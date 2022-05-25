package com.idn.ninanadia.kisahnabiapp.view.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.idn.ninanadia.kisahnabiapp.model.ResponseMain
import com.idn.ninanadia.kisahnabiapp.repo.RepositoryMain

class ViewModelMain : ViewModel() {

    val repository = RepositoryMain()

    var responGetData = MutableLiveData<List<ResponseMain>>()
    var isError = MutableLiveData<Throwable>()
    val isLoading = MutableLiveData<Boolean>()

    fun getDataView() {
        isLoading.value = true

        repository.getData({
            isLoading.value = false
            responGetData.value = it
        }, {
            isLoading.value = false
            isError.value = it
        })
    }
}