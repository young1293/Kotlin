package com.bj.luapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//It is convenient to import all widget properties for a specific layout in one go:
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
     // main_tv.setText("欢迎来到这里")//赋值的第一种写法
        main_tv.text="欢迎热烈欢迎";//赋值的第二种写法
        main_tv.setOnClickListener { Toast.makeText(applicationContext,"好的",Toast.LENGTH_LONG).show(); }
        
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }



}
