package com.example.peanutclientapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peanutclientapp.R;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcome;
    Button btnLogout, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.tvWelcome);
        btnLogout = findViewById(R.id.btnLogout);
        btnProfile = findViewById(R.id.btnProfile);

        // Get username from LoginActivity
        String username = getIntent().getStringExtra("username");

        if (username != null && !username.isEmpty()) {
            tvWelcome.setText("Welcome, " + username + "!");
        } else {
            tvWelcome.setText("Welcome to Peanut Client App!");
        }

        // Toast confirmation
        Toast.makeText(this, "You are now logged in!", Toast.LENGTH_SHORT).show();

        // Logout button
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Logged out successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // View Profile button
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}