package com.example.credit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button evaluateButton;
    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evaluateButton = findViewById(R.id.evaluate_button);
        settingsButton = findViewById(R.id.settings_button);

        evaluateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEvaluateActivity();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
    }

    private void openEvaluateActivity() {
        Intent intent = new Intent(this, EvaluateActivity.class);
        startActivity(intent);
    }

    private void openSettingsActivity() {
        // 在这里实现打开参数设置页面的逻辑
    }
}
