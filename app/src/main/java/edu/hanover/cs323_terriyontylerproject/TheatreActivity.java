package edu.hanover.cs323_terriyontylerproject;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class TheatreActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_theatre);
        ListView listTheatres = getListView();

        ArrayAdapter<Theatre> listAdapter = new ArrayAdapter<Theatre>(
                this, android.R.layout.simple_list_item_1,
                Theatre.theatres);
        listTheatres.setAdapter(listAdapter);

    }


    //create onListItemClick
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(TheatreActivity.this, TheatrePrice.class);
        startActivity(intent);
    }
}
