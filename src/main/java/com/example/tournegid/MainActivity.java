package com.example.tournegid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void paseos(View view) {
        Toast.makeText(this, "Promoción: Gran paseo por costanera", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, paseos.class);
        startActivity(i);
    }
    public void mercado(View view) {
        Toast.makeText(this, "Promoción: Gran mercado", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, mercadofluvial.class);
        startActivity(i);
    }
    public void cerveceria(View view) {
        Toast.makeText(this, "Promoción: Gran cerveceria", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, cerveceria.class);
        startActivity(i);
    }
    public void mirador(View view) {
        Toast.makeText(this, "Promoción: Gran mirador", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, mirador.class);
        startActivity(i);
    }
}
