package com.example.abubakarzahid.loginfoam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editname;
    EditText editpassword;
    Button btnonclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editname = (EditText) findViewById(R.id.edtname);
        editpassword = (EditText)findViewById(R.id.edtpassword);
        btnonclick = (Button) findViewById(R.id.btnlogin);
    }
    public void btnclickact1(View view){
        Intent i = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(i);
    }

    }


