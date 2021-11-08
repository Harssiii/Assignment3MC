package com.harssiii.assignment3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartPage extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }
    public void startQuiz(View view) {
        Intent intent = new Intent(this, McqScreen.class);
        EditText editText = (EditText) findViewById(R.id.PersonName);
        EditText editText2 = (EditText) findViewById(R.id.EmailAddress);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(EXTRA_MESSAGE, message2);
        startActivity(intent);
    }
}