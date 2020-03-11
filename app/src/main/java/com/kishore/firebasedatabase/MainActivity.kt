package com.kishore.firebasedatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var firebaseDatabase: FirebaseDatabase
    lateinit var databaseReference: DatabaseReference

    lateinit var enterdata:EditText
    lateinit var submitdata:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firebaseDatabase= FirebaseDatabase.getInstance()

        databaseReference=firebaseDatabase.getReference("data")

        val key=databaseReference.key


var db=databaseReference.child(key.toString())
        enterdata=findViewById(R.id.enterdata)
        submitdata=findViewById(R.id.submitdata)



        submitdata.setOnClickListener {

            db.setValue(enterdata.text.toString())
        }


    }
}
