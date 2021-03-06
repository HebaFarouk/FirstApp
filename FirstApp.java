package com.example.heba.first;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstApp extends AppCompatActivity {

    TextView emailtext,passtext,mobiletext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app);

        emailtext=findViewById(R.id.getemail);
        passtext=findViewById(R.id.getpass);
        mobiletext=findViewById(R.id.getmobnumber);

        SharedPreferences sharedPref =getSharedPreferences("my",MODE_PRIVATE);

        emailtext.setText(sharedPref.getString("useremail","non"));
        mobiletext.setText(sharedPref.getString("mob","nomob"));
        passtext.setText(sharedPref.getString("pass","no pass entered"));
    }
}
