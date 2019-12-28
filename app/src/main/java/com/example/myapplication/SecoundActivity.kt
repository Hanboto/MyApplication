package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_secound.*

class SecoundActivity : AppCompatActivity() {
    var name: String? =null
    private val ADD_TASK_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        name = intent.getStringExtra("name")
        edit_text_2.setText(name)
        Log.d("ololol", name)

    }

    fun onClick(view: View) {
        val name = edit_text_2.text.toString()
        if (name.isEmpty()){
            Toast.makeText(this, "Пожалуйста, заполните поле", Toast.LENGTH_LONG).show()

        } else {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", name)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
