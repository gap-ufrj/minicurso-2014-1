package com.gap.aula05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditaActivity extends Activity {

    EditText editNome, editDre;
    Button btConfirma;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insere_edita);

        editNome = (EditText) findViewById(R.id.editNome);
        editDre = (EditText) findViewById(R.id.editDRE);
        btConfirma = (Button) findViewById(R.id.btConfirmar);

        btConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}