package com.example.conciertodq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText jetnombre,jetcedula;
    CheckBox jcbvip,jcbprefencial,jcbgeneral,jcbactivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jetnombre=findViewById(R.id.etnombre);
        jetcedula=findViewById(R.id.etcedula);
        jcbactivo=findViewById(R.id.cbactivo);
        jcbgeneral=findViewById(R.id.cbgeneral);
        jcbprefencial=findViewById(R.id.cbpreferencial);
        jcbvip=findViewById(R.id.cbvip);


    }


}