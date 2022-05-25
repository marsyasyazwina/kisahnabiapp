package com.idn.ninanadia.kisahnabiapp.repo

import com.idn.ninanadia.kisahnabiapp.model.ResponseMain
import com.idn.ninanadia.kisahnabiapp.network.ConfigNetwork
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class RepositoryMain {

    fun getData(responhandler: (List<ResponseMain>) -> Unit, errorHandler: (Throwable) -> Unit){
        ConfigNetwork.service().getData().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responhandler(it)
            }, {
                errorHandler(it)
            })
    }
}