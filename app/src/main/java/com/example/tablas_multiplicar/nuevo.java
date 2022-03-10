package com.example.tablas_multiplicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class nuevo extends AppCompatActivity {
    private Spinner tablas;
    private String resultado;
    private TextView vision;
    private ImageView mono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo);
        tablas=findViewById(R.id.tablitas);
        vision=findViewById(R.id.txt_tablasones);
        mono=findViewById(R.id.imgb_mono);
        mono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getApplicationContext(),creadores.class);
                startActivity(a);
            }
        });
        String tablaso[]={"Seleccione una opcion","tabla 1", "tabla 2", "tabla 3", "tabla 4","tabla 5", "tabla 6", "tabla 7", "tabla 8", "tabla 9", "tabla 10",};
        ArrayAdapter adaptadortablas=new
                ArrayAdapter(this, android.R.layout.simple_spinner_item,tablaso);
        tablas.setAdapter(adaptadortablas);

        tablas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              switch (adapterView.getSelectedItemPosition()){
                  case 1:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (1 + " X " + Y + " = " + 1* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 2:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (2 + " X " + Y + " = " + 2* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 3:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (3 + " X " + Y + " = " + 3* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 4:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (4 + " X " + Y + " = " + 4* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 5:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (5 + " X " + Y + " = " + 5* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 6:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (6 + " X " + Y + " = " + 6* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 7:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (7 + " X " + Y + " = " + 7* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 8:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (8 + " X " + Y + " = " + 8* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                  case 9:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (9 + " X " + Y + " = " + 9* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;

                      case 10:
                      resultado="";
                      for(int Y = 1; Y<= 10; Y++){
                          resultado += (10 + " X " + Y + " = " + 10* Y +  '\n');
                      }
                      vision.setText(resultado);
                      break;
              }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }



        });



}



}