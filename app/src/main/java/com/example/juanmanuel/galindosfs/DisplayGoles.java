package com.example.juanmanuel.galindosfs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayGoles extends AppCompatActivity{

    //Se encarga de presentar la pantalla correspondiente al layout “activity_goles.xml”
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goles);

    }

    //Asocia a la pantalla el menú contextual definido en “main_menu.xml”
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // crea el menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return true;
    }

    //Contiene el código que se ejecuta cuando se selecciona una de las opciones del menú
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}
