package com.wxd.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wxd.myapplication.databinding.ActivityMainBinding
import java.sql.Date
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

//        var num = findViewById<TextView>(R.id.textView);
//        var btn = findViewById<Button>(R.id.button);
//        val num = R.id.textView;
//        val btn = R.id.button;
//
//        var counter = 2
//        binding.button.setOnClickListener {
//            counter += 4
//            println(counter)
//            binding.textView.text = counter.toString()
//            binding.textView.textSize = counter.toFloat()
//        }

        binding.button.setOnClickListener {
            val text = binding.ageInput.text

            val sdf = SimpleDateFormat("yyyy", Locale.CHINESE)
            val currentDate = sdf.format(Date())
            var s =
                "您的年龄" + (currentDate.toString().toInt() - text.toString().toInt())
//            var s =
//                "您的年龄" + (currentDate.toString().toFloat() - text.toString().toFloat())
            binding.textView.setText(s);
        }
    }
}