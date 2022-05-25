package com.idn.ninanadia.kisahnabiapp.network

import com.idn.ninanadia.kisahnabiapp.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ServiceApi {

    @GET("api/kisahnabi")
    fun getData(): Flowable<List<ResponseMain>>

}