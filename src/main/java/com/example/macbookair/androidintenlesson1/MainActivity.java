package com.example.macbookair.androidintenlesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivityBtn = findViewById(R.id.button2);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecondActivity();

                Log.d("qwe", "Button 2 clicked ");
            }
        });

    }

    public void startSecondActivity (){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
