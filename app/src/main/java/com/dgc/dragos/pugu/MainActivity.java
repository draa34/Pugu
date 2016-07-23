package com.dgc.dragos.pugu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{ int k=0, logat=0;

    Button login;
    EditText inputUsername;
    EditText inputPassword;
    ImageView pugu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.LoginButton);
        login.setOnClickListener(this);
        inputUsername = (EditText) findViewById(R.id.username);
        inputPassword = (EditText) findViewById(R.id.password);
        pugu = (ImageView) findViewById(R.id.pugu);
        assert pugu != null;
        pugu.setOnClickListener(this);


    }




    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.LoginButton) {
            k++;
            String username = inputUsername.getText().toString();
            String password = inputPassword.getText().toString();

            if (username.compareTo("roxie") == 0 && password.compareTo("pugumicu") == 0) {
                Toast.makeText(MainActivity.this, "Te-ai logat, boss!", Toast.LENGTH_SHORT).show();
                logat=1;
            } else

            {
                Toast.makeText(MainActivity.this, "Ai apasat pe buton, bravo!", Toast.LENGTH_SHORT).show();
            }

            if (k == 10) {
                pugu.setVisibility(View.VISIBLE);
            }
        }
        else if (v.getId() == R.id.pugu)
        {   if(logat==1)
            pugu.setImageResource(R.drawable.creator);
        }

    }
}

