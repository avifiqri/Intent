package com.example.intentpage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Main2Activity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.main2);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("guru"));

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.item, menu);
        return true;

    }
}
