package com.sajju.wechat

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TextView(this).apply {
            text = "Wechat\n\nSimple end-to-end encrypted chat\n\nAndroid build test successful."
            textSize = 22f
            setPadding(48, 80, 48, 48)
        }
        setContentView(view)
    }
}
