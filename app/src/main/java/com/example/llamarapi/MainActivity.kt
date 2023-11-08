package com.example.llamarapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.llamarapi.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retroftiTraer =  RetrofitCurso.consumirApi.getTraer()

        retroftiTraer.enqueue(object : retrofit2.Callback<Curso>{
            override fun onResponse(call: Call<Curso>, response: Response<Curso>) {
                binding.tvMostrar.text = response.body().toString()
            }

            override fun onFailure(call: Call<Curso>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error al consultar el api rest", Toast.LENGTH_SHORT).show()
            }

        })
    }
}