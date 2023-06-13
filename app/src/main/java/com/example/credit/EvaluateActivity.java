package com.example.credit;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class EvaluateActivity extends AppCompatActivity {
    private ListView companyListView;
    private List<String> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);

        companyList = new ArrayList<>();
        companyList.add("丰益表面活性材料（连云港）有限公司");
        companyList.add("公司B");
        companyList.add("公司C");
        companyList.add("公司C");

        companyListView = findViewById(R.id.company_listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, companyList);
        companyListView.setAdapter(adapter);

        companyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCompany = companyList.get(position);
                openTableActivity(selectedCompany);
            }
        });
    }

    private void openTableActivity(String company) {
        Intent intent = new Intent(this, TableActivity.class);
        intent.putExtra("selectedCompany", company);
        startActivity(intent);
    }
}
