package com.example.asagir.oscars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        // get the data from the adapter

        ListAdapter actorAdapter = new ListAdapter(MainActivity.this, android.R.layout.simple_list_item_1, i forgot what goes here );

        listView.setAdapter(actorAdapter);
    }
}
