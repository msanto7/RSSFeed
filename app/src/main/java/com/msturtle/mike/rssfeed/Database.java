package com.msturtle.mike.rssfeed;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "rssFeed";

    //table names
    private static final String TABLE_FEEDS = "feeds";

    //column names
    private static final String KEY_ID = "id";
    private static final String KEY_FEEDTITLE = "title";
    private static final String KEY_FEEDADDRESS = "address";


    //default constructor
    public Database (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);  //initial DB
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_FEEDS_TABLE = "CREATE TABLE " + TABLE_FEEDS + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_FEEDTITLE + " TEXT," + KEY_FEEDADDRESS + " TEXT" + ")";
        db.execSQL(CREATE_FEEDS_TABLE);

    } //Query to create our basic feeds table

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FEEDS);

        //create table from new
        onCreate(db);
    }

    } //End class
