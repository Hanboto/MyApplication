package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun onClick(view: View) {
        val name: String = edit_text.text.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "Пожалуйста, заполните поле", Toast.LENGTH_LONG).show()

        } else {
            val intent = Intent(this, SecoundActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            if (resultCode == Activity.RESULT_OK) {
                val name = data.getStringExtra("name")
                edit_text.setText(name)

            }

        } else {
            Toast.makeText(this, "Данные из Second Activity были изменены", Toast.LENGTH_LONG).show()

        }

    }
}
