package com.example.macbookair.androidintenlesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button thirdActivtiyBtn = findViewById(R.id.button3);
        thirdActivtiyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startThirdActivity();
                Log.d("qwe", "Button 3 clicked ");
            }
        });
    }

    public void startThirdActivity (){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}
