package com.alquiler.jhon.alquilerderopa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SistemaDeAlquiler : AppCompatActivity() {
    lateinit var productos:List<Producto>
    lateinit var provedores:List<Provedor>
    lateinit var clientes:List<Cliente>
    //hola

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_de_alquiler)
    }
}

