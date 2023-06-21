package com.vikman.enterprise.javatutorialpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextFirstname;
    private EditText editTextLastname;
    private EditText editTextEmail;
    private Button registerButton;
    private TextView firstName;
    private TextView lastName;
    private TextView email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextLastname = findViewById(R.id.editTextLastname);
        editTextFirstname = findViewById(R.id.editTextFirstname);
        registerButton = findViewById(R.id.registerButton);
        firstName = findViewById(R.id.firstNameTextView);
        lastName = findViewById(R.id.lastNameTextView);
        email = findViewById(R.id.emailTextView);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName.setText("First Name: "+editTextFirstname.getText().toString());
                lastName.setText("First Name: "+editTextLastname.getText().toString());
                email.setText("First Name: "+editTextEmail.getText().toString());
                editTextFirstname.setText("");
                editTextLastname.setText("");
                editTextEmail.setText("");
            }
        });
    }
}