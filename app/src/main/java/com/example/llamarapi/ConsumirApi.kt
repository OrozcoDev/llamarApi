package com.example.llamarapi

import retrofit2.Call
import retrofit2.http.GET

interface ConsumirApi {
    @GET("cursos")
    fun getTraer():Call<Curso>
}