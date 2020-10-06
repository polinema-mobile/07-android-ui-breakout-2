package com.example.formcomponentintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class FormPendaftaran extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);

        button = (Button) findViewById(R.id.btnNEXT);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormPendaftaran.this,activity_form_2.class);
                startActivity(intent);
            }
        });
    }
}
