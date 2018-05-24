package edu.hanover.cs323_terriyontylerproject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, MovieActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, TheatreActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView)findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
//    private void setActionBarTitle(int position) {
//        String title;
//        if (position == 0){
//            title = getResources().getString(R.string.app_name);
//        } else {
//            title = titles[position];
//        }
//        getActionBar().setTitle(title);
//    }
}
