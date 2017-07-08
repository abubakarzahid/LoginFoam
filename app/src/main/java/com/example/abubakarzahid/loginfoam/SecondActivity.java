package com.example.abubakarzahid.loginfoam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView listView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView)findViewById(R.id.list);
        btn = (Button) findViewById(R.id.button2);
    }
    public void btnclickact2(View view){
        Intent i = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(i);
    }



}
