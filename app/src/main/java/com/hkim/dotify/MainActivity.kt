package com.hkim.dotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private var playCount = Random.nextInt(0, 100000)
    private val tvNumPlays = findViewById<TextView>(R.id.tvNumPlays)
    private val tvUsername = findViewById<TextView>(R.id.tvUsername)
    private val btnChangeUser = findViewById<Button>(R.id.btnChangeUser)
//    private val etUserName = findViewById<EditText>(R.id.etUsername)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumPlays.text = "$playCount plays"
    }

    fun playClicked (view: View) {
        playCount++
        tvNumPlays.text = "$playCount plays"
    }

    fun backClicked (view: View) {
        Toast.makeText(this, "Skipping to previous track", Toast.LENGTH_SHORT).show()
    }

    fun nextClicked (view: View) {
        Toast.makeText(this, "Skipping to next track", Toast.LENGTH_SHORT).show()
    }

    fun changeUser (view: View) {
        if (btnChangeUser.text == "Change User") {
            tvUsername.text = ""
            btnChangeUser.text = "Apply"
        } else {
            btnChangeUser.text = "Change User"
        }
    }


}
