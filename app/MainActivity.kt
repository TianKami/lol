package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class Main2Activity : AppCompatActivity() {
    var truLogin : String = "Pornhub.com"
    var truPass : String = "80085"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun rr(v: View) {
        var userLogin : EditText = findViewById(R.id.login)
        var userPass : EditText = findViewById(R.id.pass)
        var res : ImageView = findViewById(R.id.pp)
        if (truLogin == userLogin.text.toString() && truPass == userPass.text.toString())
            res.setImageResource(R.drawable.milosmamkatvoya)
        else
            res.setImageResource(R.drawable.i)
    }
}