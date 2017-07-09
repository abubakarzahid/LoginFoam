package com.example.abubakarzahid.loginfoam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      button1= (Button)findViewById(R.id.btnclick1);
    }
    public void btnclick2 (View view){
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }

}
