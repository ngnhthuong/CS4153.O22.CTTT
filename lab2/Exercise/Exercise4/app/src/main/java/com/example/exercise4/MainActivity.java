package com.example.exercise4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.exercise4.ViewContactInfoActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editTextName, editTextEmail, editTextProject;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextProject = findViewById(R.id.editTextProject);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String project = editTextProject.getText().toString();

                Intent intent = new Intent(MainActivity.this, ViewContactInfoActivity.class);
                intent.putExtra("nameKey", name);
                intent.putExtra("emailKey", email);
                intent.putExtra("projectKey", project);
                startActivity(intent);
            }
        });
    }
}
