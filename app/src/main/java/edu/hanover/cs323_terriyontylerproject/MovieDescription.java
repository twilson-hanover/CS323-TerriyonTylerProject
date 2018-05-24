package edu.hanover.cs323_terriyontylerproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDescription extends Activity {

    public static final String EXTRA_MOVIENO = "movieNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_description);

        int movieNo = (Integer)getIntent().getExtras().get(EXTRA_MOVIENO);
        Movie movie = Movie.movies[movieNo];

        ImageView photo = (ImageView) findViewById(R.id.image);
        photo.setImageResource(movie.getImageResourceId());
        photo.setContentDescription(movie.getName());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(movie.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(movie.getDescription());
    }
}
