package edu.hanover.cs323_terriyontylerproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class Movie extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listTheatres = getListView();
        //     ArrayAdapter<Theatre> listAdapter = new ArrayAdapter<Theatre>(
        //               this, android.R.layout.simple_list_item_1,
//                Theatre.theatres);
//        listTheatres.setAdapter(listAdapter);
    }

//    @Override
//    public void onListItemClick(ListView listView, View itemView, int position, long id) {
//        Intent intent = new Intent(Theatre.this, TheatrePrice.class);
//        intent.putExtra(TheatrePrice.EXTRA_DRINKNO, (int)id);
//        startActivity(intent);
//    }
}