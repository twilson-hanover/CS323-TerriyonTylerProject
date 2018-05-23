package edu.hanover.cs323_terriyontylerproject;

public class Movie {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Movie[] movies = {
            new Movie("Deadpool 2", "Description", R.drawable.index),
            new Movie("Godspeed", "Description", R.drawable.index),
            new Movie("Solo", "Description", R.drawable.index),
    };

    private Movie(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

