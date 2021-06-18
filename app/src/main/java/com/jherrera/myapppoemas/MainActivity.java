package com.jherrera.myapppoemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.patria:
                Intent intent = new Intent(this,MAPatria.class);
                startActivity(intent);
                break;
            case R.id.btnguerra:
                Intent intente = new Intent(this,MAGuerra.class);
                startActivity(intente);
                break;
            case R.id.btnlibertad:
                Intent intenti = new Intent(this,MALibertad.class);
                startActivity(intenti);
                break;
        }
    }
}