package com.example.peanutclientapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.peanutclientapp.R;

public class ProfileActivity extends AppCompatActivity {

    TextView tvName, tvEmail, tvPhone, tvRole;
    Button btnBack, btnTrades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize UI components
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvRole = findViewById(R.id.tvRole);
        btnBack = findViewById(R.id.btnBack);
        btnTrades = findViewById(R.id.btnTrades);

        // Sample user data (you can later fetch this from login or API)
        tvName.setText("Name: Admin User");
        tvEmail.setText("Email: admin@peanutapp.com");
        tvPhone.setText("Phone: +91 9876543210");
        tvRole.setText("Role: Administrator");

        // Back to MainActivity
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Navigate to Trades List
        btnTrades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, TradesActivity.class);
                startActivity(intent);
            }
        });
    }
}