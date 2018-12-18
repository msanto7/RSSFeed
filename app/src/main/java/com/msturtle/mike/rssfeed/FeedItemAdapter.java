package com.msturtle.mike.rssfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FeedItemAdapter extends ArrayAdapter<RssItem> {

    //constructors
    public FeedItemAdapter (Context context, ArrayList<RssItem> items) { super(context, 0, items); }

    //Methods ***
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        RssItem item = getItem(position);

        //new cell gotten if recycled one was not passed in
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rss_feed_item_row, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.rss_feed_item_textview);
        TextView description = (TextView) convertView.findViewById(R.id.rssFeedItemDescriptionTextView);
        TextView largeLetter = (TextView) convertView.findViewById(R.id.rssFeedItemLetterTextView);

        title.setText(item.getTitle());
        description.setText(item.getDescription());
        largeLetter.setText(item.getTitle().substring(0, 1 ));

        return convertView;
    }


} //Ends Class
