package com.example.llamarapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitCurso {
   private val retrofit = Retrofit.Builder()
       .baseUrl("http://10.185.208.161:8000/api/")
       .addConverterFactory(GsonConverterFactory.create())
       .build()

    val consumirApi = retrofit.create(ConsumirApi::class.java)
}