package com.opencv.bank_sampah.app

import com.opencv.bank_sampah.model.request.inputOutliteRequest
import com.opencv.bank_sampah.model.request.registerRequest
import com.opencv.bank_sampah.model.request.userRequest
import com.opencv.bank_sampah.model.response.inputOutliteResponse
import com.opencv.bank_sampah.model.response.userResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @Headers("Content-Type: application/json")
    @POST("login")
    fun login(
        @Body request: userRequest
    ): Call<userResponse>

    @Headers("Content-Type: application/json")
    @POST("register")
    fun register(
        @Body request: registerRequest
    ): Call<userResponse>

    @Headers("Content-Type: application/json")
    @POST("outlets")
    fun outlets(
        @Body request: inputOutliteRequest
    ): Call<inputOutliteResponse>

//    @Headers("Content-Type: application/json")
//    @GET("kupons")
//    fun kupon():call<>
//
//    @Headers("Content-Type: application/json")
//    @GET("kupons")
//    fun kupon():call<>



}