package fr.moussacherif.pia12androidintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var minsiffra = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val mintext =findViewById<TextView>(R.id.fancyText)
        mintext.text = "Gunghäst"

        val minknapp = findViewById<Button>(R.id.fancyButton)
        minknapp.setOnClickListener {

            minsiffra += 1

            if(minsiffra > 10) {
                minsiffra = 0
            }

            mintext.text = minsiffra.toString()

        }


    }


}