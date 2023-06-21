package com.vikman.enterprise.javatutorialpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView welcomeTextView;
    private EditText editTextTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeTextView = findViewById(R.id.welcomeMessage);
        editTextTitle = findViewById(R.id.editTextTextPersonName);
    }
    public void onBtnClick(View view){
        welcomeTextView.setText(editTextTitle.getText().toString());
        editTextTitle.setText("");
    }
}