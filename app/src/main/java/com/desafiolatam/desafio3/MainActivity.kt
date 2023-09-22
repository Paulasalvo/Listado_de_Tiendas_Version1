package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.desafiolatam.desafio3.data.getSucursales
import com.desafiolatam.desafio3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var isButtonClicked:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sucursales = getSucursales()
        binding.nameFirstStore.text = sucursales[0].nombre
        binding.nameSecondStore.text = sucursales[1].nombre
        binding.nameThirdStore.text = sucursales[2].nombre
        binding.nameFourthStore.text = sucursales[3].nombre
        binding.nameFifthStore.text = sucursales[4].nombre

        binding.hoursFirstStore.text = sucursales[0].horario
        binding.hoursSecondStore.text = sucursales[1].horario
        binding.hoursThirdStore.text = sucursales[2].horario
        binding.hoursFourthStore.text = sucursales[3].horario
        binding.hoursFifthStore.text = sucursales[4].horario

        Glide.with(this).load(sucursales[0].fotoUrl).centerCrop().into(binding.firstStoreImageView)
        Glide.with(this).load(sucursales[1].fotoUrl).centerCrop().into(binding.SecondStoreImageView)
        Glide.with(this).load(sucursales[2].fotoUrl).centerCrop().into(binding.thirdStoreImageView)
        Glide.with(this).load(sucursales[3].fotoUrl).centerCrop().into(binding.fourthStoreImageView)
        Glide.with(this).load(sucursales[4].fotoUrl).centerCrop().into(binding.fifthStoreImageView)
        // Puedes ocupar este ejemplo para navegar entre activities
        binding.cardView1.setOnClickListener {
            if (!isButtonClicked) {
                isButtonClicked = true
                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("sucursal", sucursales[0])
                intent.putExtra("bundle", bundle)
                startActivity(intent)
            }
        }

        binding.cardView2.setOnClickListener {
            if (!isButtonClicked) {
                isButtonClicked = true
                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("sucursal", sucursales[1])
                intent.putExtra("bundle", bundle)
                startActivity(intent)
            }
        }
        binding.cardView3.setOnClickListener {
            if (!isButtonClicked) {
                isButtonClicked = true
                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("sucursal", sucursales[2])
                intent.putExtra("bundle", bundle)
                startActivity(intent)
            }
        }
        binding.cardView4.setOnClickListener {
            if (!isButtonClicked) {
                isButtonClicked = true
                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("sucursal", sucursales[3])
                intent.putExtra("bundle", bundle)
                startActivity(intent)
            }
        }
        binding.cardView5.setOnClickListener {
            if (!isButtonClicked) {
                isButtonClicked = true
                val intent = Intent(this, DetailActivity::class.java)
                val bundle = Bundle()
                bundle.putSerializable("sucursal", sucursales[4])
                intent.putExtra("bundle", bundle)
                startActivity(intent)
            }
        }

    }

    override fun onResume() {
        super.onResume()
        isButtonClicked = false
    }
}