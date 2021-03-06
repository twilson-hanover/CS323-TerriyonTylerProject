package edu.hanover.cs323_terriyontylerproject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                // if user clicks position 1 (movie) send to movie activity page
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, MovieActivity.class);
                    startActivity(intent);
                }
                // if user clicks position 1 (theatre) send to theatre page
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

    @Override
    //creates the options menu for the toolbar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
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
