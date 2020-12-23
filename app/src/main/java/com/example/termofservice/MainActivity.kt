package com.example.termofservice

import android.os.Bundle
import android.util.Log.d
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.termofservice.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        sw_main.setOnCheckedChangeListener { buttonView, isChecked ->
            d("Dream", "I Love You! $isChecked")
            if (isChecked) {
                btn_main.visibility = View.VISIBLE

                supportFragmentManager.beginTransaction()
                    .replace(R.id.fm_layout, FirstFragment())
                    .commit()

            } else {
                btn_main.visibility = View.GONE
            }
        }
    }
}