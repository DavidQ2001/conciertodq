package com.example.conciertodq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

    public void Cancelar(View view){
        Limpiar_datos();
    }

    private void Limpiar_datos(){
        jetcedula.setText("");
        jetnombre.setText("");
        jcbactivo.setChecked(false);
        jcbgeneral.setChecked(true);
        jcbprefencial.setChecked(true);
        jcbvip.setChecked(true);
    }


}