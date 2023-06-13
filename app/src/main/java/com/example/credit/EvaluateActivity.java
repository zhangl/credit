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
import com.example.credit.Company;
import com.example.credit.MainActivity;


public class EvaluateActivity extends AppCompatActivity {
    private ListView companyListView;
    private List<String> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);

        companyList = new ArrayList<String>();
        companyList.add("丰益表明活性材料（连云港）有限公司");
        companyList.add("金桥丰益氯碱（连云港）有限公司");
        companyList.add("连云港环海化工有限公司");
        companyList.add("丰益高分子材料（连云港）有限公司");
        //companyList.add(new Company("丰益表明活性材料（连云港）有限公司",0.077897,0.124102,0.277839,0.104243,0.116101,-0.0124,0.372315,1.530741,0.530741,0.631768));
        //companyList.add(new Company("金桥丰益氯碱（连云港）有限公司",0.097716,0.159782,0.169974,0.180694,0.220249,7.638309,0.388445,0.769176,0.566888,0.437173));
        //companyList.add(new Company("连云港环海化工有限公司",0.1436708,1.6774111,1.5145822,0.1354045,0.1582937,2.2285613,0.9143497,0.8343266,0.78608803,0.1999217));
        //companyList.add(new Company("丰益高分子材料（连云港）有限公司", 0.041691189,0.062905884,0.069215525,0.063334343,0.067981507,2.318094001,0.337245003,1.272530946,0.835986939,-0.057475468));

        companyListView = findViewById(R.id.company_listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, companyList);
        companyListView.setAdapter(adapter);

        companyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCompany = companyList.get(position);
                Toast.makeText(EvaluateActivity.this, "选中的公司：" + selectedCompany, Toast.LENGTH_SHORT).show();
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
