package com.law.retete.sliceapplication;

public class Reteta {
    private int id;
    private String title, shortdesc;
    private String rating;
    private String price;
    private int image;
    private String[] tags;
    private String text;
    private int fav;

    public Reteta(int id, String title, String shortdesc, String rating, String price, int image, String[] tags, String text) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.image = image;
        this.tags = tags;
        this.text = text;
        this.fav = 0;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }

    public String[] getTags() {
        return tags;
    }

    public String getText() {
        return text;
    }

    public int getFav() {
        return fav;
    }

    public void setFav(int fav) {
        this.fav = fav;
    }
}
