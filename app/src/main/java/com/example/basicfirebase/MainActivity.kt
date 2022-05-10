package com.example.basicfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.reference
        //INSERTAR VALORES  ----CARTAS---
        //myRef.child("Cartas").child("1").setValue(Card("1","Rojo","Corazones"))
        //myRef.child("Cartas").child("2").setValue(Card("2","Negro","Trebol"))
        //myRef.child("Cartas").child("3").setValue(Card("3","Rojo","Diamantes"))

        //INSERTAR VALORES  ----USUARIOS---
        //myRef.child("Usuarios").child("1").setValue(User("Juan Perez",20, "M", "Ing. Bioquimica"))
        //myRef.child("Usuarios").child("2").setValue(User("Paulina Ruiz",25, "F", "Ing. Mecatronica"))
        //myRef.child("Usuarios").child("3").setValue(User("Rafael Tellez",18, "M", "Lic. Administracion"))

        myRef.child("Usuarios").child("3").get().addOnSuccessListener { response ->
            Log.d("Response", response.value.toString())
        }.addOnFailureListener {
            Log.d("Response","Error")
        }




    }
}