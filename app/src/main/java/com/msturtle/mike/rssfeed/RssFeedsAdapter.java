package com.msturtle.mike.rssfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class RssFeedsAdapter extends ArrayAdapter<RssFeed> {

    //constructors
    public RssFeedsAdapter (Context context, List<RssFeed> feeds) {
        super(context, 0, feeds);  //initialize parent class first
    }

    //Methods ***
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        RssFeed feed = getItem(position);

        //new cell gotten if recycled one was not passed in
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rss_edit_feed_item_row, parent, false);
        }

        TextView feedAddress = (TextView) convertView.findViewById(R.id.rssEditFeedAddressTextView);
        TextView feedTitle = (TextView) convertView.findViewById(R.id.rss_edit_feed_title_textview);

        feedAddress.setText(feed.rssFeedAddress);
        feedTitle.setText(feed.rssFeedTitle);

        return convertView;
    }



} //Ends class
