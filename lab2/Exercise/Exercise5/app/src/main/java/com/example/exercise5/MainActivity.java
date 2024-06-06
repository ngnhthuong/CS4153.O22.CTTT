package com.example.exercise5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open a webpage
//                Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//                startActivity(intentWeb);

                // Make a phone call
                Intent intentCall = new Intent(Intent.ACTION_CALL, Uri.parse("tel:123456789"));
                startActivity(intentCall);

                // Send an SMS
//                Intent intentSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:123456789"));
//                intentSms.putExtra("sms_body", "Làm Lab a Khiêm chưa m.");
//                startActivity(intentSms);

                // Open Google Maps for directions
//                String mapUri = "http://maps.google.com/maps?daddr=latitude,longitude";
//                Intent intentMap = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUri));
//                startActivity(intentMap);
            }
        });
    }
}
