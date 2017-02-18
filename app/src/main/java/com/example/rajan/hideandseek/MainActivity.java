package com.example.rajan.hideandseek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } public void show (View v){
        int id=v.getId();
        switch (id){
            case R.id.btn1:
                Intent intent=new Intent(this,secondactivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:

                Intent intent1=new Intent(this,MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
