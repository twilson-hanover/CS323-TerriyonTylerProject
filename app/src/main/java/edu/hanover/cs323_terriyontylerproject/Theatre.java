package edu.hanover.cs323_terriyontylerproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class Theatre extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_theatre_price);
        ListView listTheatres = getListView();
        ArrayAdapter<Theatre> listAdapter = new ArrayAdapter<Theatre>(
                this, android.R.layout.simple_list_item_1,
                Theatre.theatres);
        listTheatres.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(Theatre.this, TheatrePrice.class);
        intent.putExtra(TheatrePrice, (int)id);
        startActivity(intent);
    }
}
