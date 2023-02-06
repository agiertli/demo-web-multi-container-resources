package com.redhat.demo.webfront.model;


public class MotionPicture {
    private int id;
    private int year;
    private String name;
    private String imageUrl;
    private String genre;
    private int rank;
    private boolean isTVShow;

    public MotionPicture(){
    }
    public MotionPicture(
            int id,
            String name,
            int year,
            String imageUrl,
            String genre,
            int rank,
            boolean isTVShow
    ){
        this.id = id;
        this.year = year;
        this.name = name;
        this.imageUrl = imageUrl;
        this.genre = genre;
        this.rank = rank;
        this.isTVShow = isTVShow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return this.name + "year" + this.year + this.imageUrl + this.rank + this.genre + this.isTVShow;
    }

    public boolean isTVShow() {
        return isTVShow;
    }

    public void setTVShow(boolean TVShow) {
        isTVShow = TVShow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
