package com.example.exercise4;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.exercise4.R;

public class ViewContactInfoActivity extends AppCompatActivity {

    private TextView textViewName, textViewEmail, textViewProject;
    private Button buttonFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactinfo);

        textViewName = findViewById(R.id.textViewName);
        textViewEmail = findViewById(R.id.textViewEmail);
        textViewProject = findViewById(R.id.textViewProject);
        buttonFinish = findViewById(R.id.buttonFinish);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("nameKey");
            String email = bundle.getString("emailKey");
            String project = bundle.getString("projectKey");

            textViewName.setText("Name: " + name);
            textViewEmail.setText("Email: " + email);
            textViewProject.setText("Project: " + project);
        }

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
