package com.harssiii.assignment3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    TextView tv10, tv11, tv12;
    Button btnRestart;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        tv10 = (TextView)findViewById(R.id.textView10);
        tv11 = (TextView)findViewById(R.id.textView11);
        tv12 = (TextView)findViewById(R.id.textView12);
        btnRestart = (Button) findViewById(R.id.button3);
        btnShare = (Button) findViewById(R.id.button2);
        StringBuffer sb = new StringBuffer();
        sb.append(McqScreen.correct + "\n");
        StringBuffer sb2 = new StringBuffer();
        sb2.append( McqScreen.wrong + "\n");
        StringBuffer sb3 = new StringBuffer();
        sb3.append( McqScreen.correct +"0" + "\n");
        tv10.setText(sb);
        tv11.setText(sb2);
        tv12.setText(sb3);

        McqScreen.correct=0;
        McqScreen.wrong=0;

        btnRestart.setOnClickListener(v -> {
            Intent in = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(in);
        });
    }
}