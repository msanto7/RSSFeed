package com.msturtle.mike.rssfeed;

import java.net.URL;

public class RssItem {

    private String title;
    private String description;
    private URL link;

    //Constructor
    public RssItem (String title, String description, URL link) {
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
    public void setLink (URL link) {
        this.link = link;
    }
    public String getTitle () {
        return title;
    }
    public String getDescription () {
        return description;
    }
    public URL getLink () {
        return link;
    }


} //Ends Class
