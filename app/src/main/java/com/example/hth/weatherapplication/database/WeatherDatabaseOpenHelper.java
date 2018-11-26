package com.example.hth.weatherapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherDatabaseOpenHelper extends SQLiteOpenHelper{

    //build the province table
    public static final String CREATE_PROVINCE = "CREATE TABLE province (" +
            "id integer primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    // build the city
    public static final String CREATE_CITY = "CREATE TABLE city (" +
            "id integer primary key autoincrement," +
            "city_name text," +
            "city_code text," +
            "province_id integer)";

    // build the city
    public static final String CREATE_COUNTY = "CREATE TABLE county (" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";

    public WeatherDatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * crate the database with three tables with province city county
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }




}


