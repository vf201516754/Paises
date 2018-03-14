package br.com.victor.paises;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void testIntent(View view) {
        final Button testCastingButton;
        testCastingButton = (Button) findViewById(R.id.btn_entrar);

        testCastingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callOtherActivity;
                callOtherActivity = new Intent(LoginActivity.this, TelaUm.class);
                startActivity(callOtherActivity);
            }
        });
    }


}

