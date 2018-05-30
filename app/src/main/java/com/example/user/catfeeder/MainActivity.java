package com.example.user.catfeeder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button addJadwal;
    private Button feedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aj = (Button) findViewById(R.id.addJadwal);
        Button feed = (Button) findViewById(R.id.feedButton);

        aj.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AddJadwalActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
}
