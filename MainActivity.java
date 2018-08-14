package com.example.heba.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText userEmail;
    private EditText userPassword;
    private EditText userMobile;


    final public static String ENTERED_EMAIL = "email";
    final public static String ENTERED_PASSWORD = "password";
    final public static String ENTERED_MOBILE = "1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loginData = (TextView) findViewById(R.id.cont);

        userEmail = (EditText)findViewById(R.id.email);
        userPassword = (EditText)findViewById(R.id.pass);
        userMobile = (EditText)findViewById(R.id.mob);



        loginData.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent dataIntent=new Intent(MainActivity.this, FirstApp.class);

                String uEmail = userEmail.getText().toString();
                dataIntent.putExtra(ENTERED_EMAIL, uEmail);

                String uPassword = userPassword.getText().toString();
                dataIntent.putExtra(ENTERED_PASSWORD, uPassword);

                String uMobile = userMobile.getText().toString();
                dataIntent.putExtra(ENTERED_MOBILE, uMobile);


                startActivity(dataIntent);
            }
        });
    }
}