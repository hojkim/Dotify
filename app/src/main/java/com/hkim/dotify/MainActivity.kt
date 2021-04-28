package com.hkim.dotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private var playCount = Random.nextInt(0, 100000)
    private lateinit var tvNumPlays:TextView
    private val tvUsername by lazy {findViewById<TextView>(R.id.tvUsername)}
    private val btnChangeUser by lazy {findViewById<Button>(R.id.btnChangeUser)}
    private val etUserName by lazy {findViewById<EditText>(R.id.etUsername)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumPlays = findViewById(R.id.tvNumPlays)

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
            tvUsername.visibility = View.GONE
            etUserName.visibility = View.VISIBLE
            btnChangeUser.text = "Apply"
        } else {
            btnChangeUser.text = "Change User"
            tvUsername.text = etUserName.text
            etUserName.visibility = View.GONE
            tvUsername.visibility = View.VISIBLE
        }
    }


}
