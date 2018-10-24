package com.msturtle.mike.rssfeed;

public class RssFeed {

    public String rssFeedTitle;
    public String rssFeedAddress;
    public int id;

    public RssFeed (String title, String address) {
        rssFeedTitle = title;
        rssFeedAddress = address;
    } //ends init method


    //constructor if there is an expected id
    public RssFeed (int feedId, String title, String address) {
        rssFeedTitle = title;
        rssFeedAddress = address;
        id = feedId;
    } //end


} //End Class

//this class is used for database
