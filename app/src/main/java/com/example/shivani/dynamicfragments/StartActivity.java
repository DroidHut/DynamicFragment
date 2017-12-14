package com.example.shivani.dynamicfragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button1=(Button)findViewById(R.id.allFragments);
        button2=(Button)findViewById(R.id.addFragments);
        button3=(Button)findViewById(R.id.removeFragments);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.allFragments:
                Intent intent1=new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent1);
                break;
            case R.id.addFragments:
                Intent intent2=new Intent(StartActivity.this,FragmentAdder.class);
                startActivity(intent2);
                break;
            case R.id.removeFragments:
                Intent intent3=new Intent(StartActivity.this,FragmentAdder.class);
                startActivity(intent3);
                break;
            
        }
    }
}
