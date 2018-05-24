package edu.hanover.cs323_terriyontylerproject;

public class Movie {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Movie[] movies = {
            new Movie("Deadpool 2", "Follow Deadpool and his team of misfits as they take on the villain, Cable.", R.drawable.deadpool),
            new Movie("Godspeed", "2 athletes perform a 24/7 competition across the world.", R.drawable.godspeed),
            new Movie("Solo: A Star Wars Story", "Board the Millennium Falcon and journey to a galaxy far, far away on an all-new adventure with the most beloved scoundrel in the galaxy.", R.drawable.solo),
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

