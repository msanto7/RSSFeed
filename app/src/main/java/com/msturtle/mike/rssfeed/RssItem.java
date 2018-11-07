package com.msturtle.mike.rssfeed;

public class RssItem {

    private String title;
    private String description;
    private String link;

    //Constructor
    public RssItem (String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }
    //Empty Constructor
    public RssItem () {

    }

    //Access methods
    public void setTitle (String title) {
        this.title = title;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public void setLink (String link) {
        this.link = link;
    }
    public String getTitle () {
        return title;
    }
    public String getDescription () {
        return description;
    }
    public String getLink () {
        return link;
    }


} //Ends Class
