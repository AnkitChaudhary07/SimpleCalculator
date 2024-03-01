package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hellokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAdd.setOnClickListener {
            if(binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()
                val sum = no1 + no2

                binding.resultText.text = "Sum is: ${sum.toString()}"
            } else {
                Toast.makeText(this,"Please enter the values...",Toast.LENGTH_LONG).show()
            }
        }

        binding.btnSub.setOnClickListener{
            if(binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()
                val sub = no1 - no2

                binding.resultText.text = "Difference is: ${sub.toString()}"

            } else {
                Toast.makeText(this,"Please enter the values...",Toast.LENGTH_LONG).show()
            }
        }

        binding.btnMul.setOnClickListener {
            if(binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()
                val mul = no1 * no2

                binding.resultText.text = "Multiplication is: ${mul.toString()}"

            } else {
                Toast.makeText(this,"Please enter the values...",Toast.LENGTH_LONG).show()
            }
        }

        binding.btnDiv.setOnClickListener {
            if(binding.edtNo1.text.toString() != "" && binding.edtNo2.text.toString() != "") {

                val no1 = binding.edtNo1.text.toString().toInt()
                val no2 = binding.edtNo2.text.toString().toInt()
                if(no2 == 0) Toast.makeText(this, "can't divide by 0", Toast.LENGTH_LONG).show()
                else {
                    val div = no1 / no2

                    binding.resultText.text = "Division is: $div"
                }

            } else {
                Toast.makeText(this,"Please enter the values...",Toast.LENGTH_LONG).show()
            }
        }

    }
}