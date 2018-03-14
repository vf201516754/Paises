package br.com.victor.paises;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TelaUm extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_um);

        spinner = (Spinner) findViewById(R.id.spin);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.continentes_array, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        Button btnListar = (Button) findViewById(R.id.btn_listar);
        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = spinner.getSelectedItem().toString();

                Intent callOtherActivity;
                callOtherActivity = new Intent(TelaUm.this, TelaDois.class);
                startActivity(callOtherActivity);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callOtherActivity;
                callOtherActivity = new Intent(TelaUm.this, NovoChamado.class);
                startActivity(callOtherActivity);
            }
        });
    }
}
