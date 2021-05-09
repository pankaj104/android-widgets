package abc.com.androidwidgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text2.text=" hello Pankaj "
        text2.append("how is it going")
        editTextTextPersonName.requestFocus()
        checkBox.setOnCheckedChangeListener{
            buttonView, isCheked ->
            Toast.makeText(this, "Item is now $isCheked", Toast.LENGTH_LONG).show()
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioButton -> {
                    Toast.makeText(this, "Item is now Button 1" , Toast.LENGTH_LONG).show()
                }
                R.id.radioButton2 ->{
                    Toast.makeText(this, "Item is now Button 2", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}