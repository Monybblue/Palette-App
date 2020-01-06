package th.ac.su.ict.supaporn.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewColors = findViewById<TextView>(R.id.viewColors)

        var btn1 = findViewById<Button>(R.id.bt1)
        var btn2 = findViewById<Button>(R.id.bt2)
        var btn3 = findViewById<Button>(R.id.bt3)
        var btn4 = findViewById<Button>(R.id.bt4)
        var btn5 = findViewById<Button>(R.id.bt5)
        var btn6 = findViewById<Button>(R.id.bt6)

        btn1.setOnClickListener(){
            viewColors.setText("235-255-221")
            viewColors.setBackgroundColor(Color.parseColor("#ebe1dd"))
        }
        btn2.setOnClickListener(){
            viewColors.setText("236-203-202")
            viewColors.setBackgroundColor(Color.parseColor("#eccbca"))
        }
        btn3.setOnClickListener(){
            viewColors.setText("117-131-156")
            viewColors.setBackgroundColor(Color.parseColor("#75839c"))
        }
        btn4.setOnClickListener(){
            viewColors.setText("153-169-191")
            viewColors.setBackgroundColor(Color.parseColor("#99a9bf"))
        }
        btn5.setOnClickListener(){
            viewColors.setText("195-204-216")
            viewColors.setBackgroundColor(Color.parseColor("#c3ccd8"))
        }
        btn6.setOnClickListener(){
            viewColors.setText("221-226-269")
            viewColors.setBackgroundColor(Color.parseColor("#dee2e5"))
        }

    }
}
