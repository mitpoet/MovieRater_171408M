package com.example.tim.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etLanguage.setVisibility(View.GONE)
        etChkbox2.setVisibility(View.INVISIBLE)
        etChkbox3.setVisibility(View.INVISIBLE)
        etGone1.setVisibility(View.GONE)
        etGone2.setVisibility(View.GONE)
        etGone3.setVisibility(View.GONE)
        etChkbox1.setOnClickListener(View.OnClickListener {
            if(etChkbox1.isChecked == true){

                etChkbox2.setVisibility(View.VISIBLE)
                etChkbox3.setVisibility(View.VISIBLE)
                val etGone1 : CheckBox = findViewById(R.id.etGone1)
                etGone1.text = "Suitable for all ages = False"


            }
            else{
                etChkbox2.setVisibility(View.INVISIBLE)
                etChkbox3.setVisibility(View.INVISIBLE)
                etGone1.text = "Suitable for all ages = True"

            }
        })

        rbtnButton1.setOnClickListener(View.OnClickListener {
            val etLanguage : RadioButton = findViewById(R.id.etLanguage)
            if (rbtnButton1.isChecked == true){
                 etLanguage.text = "English"
            }
        })

        rbtnButton2.setOnClickListener(View.OnClickListener {
            val etLanguage : RadioButton = findViewById(R.id.etLanguage)
            if (rbtnButton2.isChecked == true){
                etLanguage.text = "Chinese"
            }
        })

        rbtnButton3.setOnClickListener(View.OnClickListener {
            val etLanguage : RadioButton = findViewById(R.id.etLanguage)
            if (rbtnButton3.isChecked == true){
                etLanguage.text = "Malay"
            }
        })

        rbtnButton4.setOnClickListener(View.OnClickListener {
            val etLanguage : RadioButton = findViewById(R.id.etLanguage)
            if (rbtnButton4.isChecked == true){
                etLanguage.text = "Tamil"
            }
        })



        etChkbox2.setOnClickListener(View.OnClickListener {
            val etChkBox2 : CheckBox = findViewById(R.id.etChkbox2)
            if(etChkBox2.isChecked == true){
                etGone2.text ="Violence"
            }
            else{
                etGone2.text = ""
            }
        })

        etChkbox3.setOnClickListener(View.OnClickListener {
            val etChkBox3 : CheckBox = findViewById(R.id.etChkbox3)
            if(etChkBox3.isChecked == true) {
                etGone3.text = "Language"
            }
            else{
                etGone3.text = ""
            }
        })


        btn1.setOnClickListener {
            val etName = findViewById(R.id.etName) as EditText
            val etDescription = findViewById(R.id.etDescription) as EditText

            val etChkbox2 = findViewById(R.id.etChkbox2) as CheckBox
            val etChkbox3 = findViewById(R.id.etChkbox3) as CheckBox
            val etDate = findViewById(R.id.etDate) as EditText
            var count:Int = 0


            if (etName.getText().toString().trim().isEmpty()) {
                etName.setError("Field empty")
            count += 1}
            if (etDescription.getText().toString().trim().isEmpty()) {
                etDescription.setError("Field empty")
                count += 1}
            if (etDate.getText().toString().trim().isEmpty()) {
                etDate.setError("Field empty")
                count += 1}


            if (count == 0){
                Toast.makeText(
                    this, "Title" + etName.text + "\n"
                            + "Overview:" + etDescription.text + "\n" + "Release Date" + etDate.text + "\n"
                            + "Language: " + etLanguage.text + "\n" +
                            etGone1.text + "\n" + "Reason" + "\n" + etGone2.text + "\n"
                            + etGone3.text + "\n"
                    , Toast.LENGTH_LONG
                ).show()

            }


            }
        }
    }



