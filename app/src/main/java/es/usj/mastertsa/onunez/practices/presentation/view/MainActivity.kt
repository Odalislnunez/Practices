package es.usj.mastertsa.onunez.practices.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.usj.mastertsa.onunez.practices.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragmentHost, HomeFragment()).commit()
    }
}