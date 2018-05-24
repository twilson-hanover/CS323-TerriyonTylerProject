package edu.hanover.cs323_terriyontylerproject;

public class Theatre {
    //initialize Theatre parameters
    private String name;
    private String price;
    private String location;
    private int imageResourceId;

    public static final Theatre[] theatres = {
            new Theatre("Infinity Theatres", "9.00$", "Madison", R.drawable.index),
            new Theatre("Xscape theatres", "6.00$", "Madison", R.drawable.index),
            new Theatre("Riverrun Theatres", "7.50$", "Madison", R.drawable.index),
    };

    private Theatre(String name, String price, String location, int imageResourceId) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }
    //getter functions
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
