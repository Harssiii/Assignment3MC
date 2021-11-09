package com.harssiii.assignment3_emissionpoints;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }
    public void startQuiz(View view) {
        Intent intent = new Intent(this, McqScreen.class);
        EditText editText = findViewById(R.id.PersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}