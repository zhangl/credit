package com.example.credit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TableActivity extends AppCompatActivity {
    private TextView companyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        companyTextView = findViewById(R.id.company_textview);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedCompany = extras.getString("selectedCompany");
            companyTextView.setText(selectedCompany);
        }
    }
}
