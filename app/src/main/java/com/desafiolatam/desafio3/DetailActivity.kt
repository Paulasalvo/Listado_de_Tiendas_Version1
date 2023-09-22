package com.desafiolatam.desafio3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.desafiolatam.desafio3.data.Sucursal
import com.desafiolatam.desafio3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle: Bundle? = intent.extras?.getBundle("bundle")
        bundle?.let {
            val sucursal: Sucursal =  it.getSerializable("sucursal") as Sucursal
            Glide.with(this).load(sucursal.fotoUrl).centerCrop().into(binding.StoreImageView)
            binding.name.text = sucursal.nombre
            binding.direction.text = sucursal.direccion
            binding.history.text= sucursal.historia

            binding.direction.setOnClickListener {
                val address = sucursal.direccion
                openMaps(address)
            }

            binding.shareButton.setOnClickListener {
                val storeName = sucursal.nombre
                shareStoreName(storeName)
            }

        }
    }

    private fun openMaps(address: String) {
        val uri = "geo:0,0?q=$address"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        intent.setPackage("com.google.android.apps.maps") // Abre la aplicación de Google Maps
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // Si Google Maps no está instalado, puedes manejarlo aquí de otra manera
            Toast.makeText(this, "Google Maps no está instalado", Toast.LENGTH_SHORT).show()
        }
    }

    private fun shareStoreName(storeName: String) {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, storeName)

        if (shareIntent.resolveActivity(packageManager) != null) {
            startActivity(shareIntent)
        } else {
            // Si no hay aplicaciones para compartir disponibles
            Toast.makeText(this, "No se encontró una aplicación para compartir.", Toast.LENGTH_SHORT).show()
        }
    }


}