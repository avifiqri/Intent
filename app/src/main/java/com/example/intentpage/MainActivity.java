package com.example.intentpage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] kodaskrip = {"Yusuf", "Pawit", "Fajri","Heru", "Ashari"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.pindah);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,kodaskrip);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.list,menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nama = "Guru " + ((TextView)view).getText();
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("guru", nama);
        startActivity(intent);
    }
}
