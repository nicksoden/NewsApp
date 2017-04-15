package com.example.android.newsapp;

/**
 * Created by Nicholas Soden on 2017-04-07.
 */

public class News {

    private String mSection;

    private String mNewsTitle;

    private String mDate;

    private String mUrl;

    private String mImageUrl;


    public News(String section, String newsTitle, String date, String url, String imageUrl){

        mSection = section;
        mNewsTitle = newsTitle;
        mDate = date;
        mUrl = url;
        mImageUrl = imageUrl;
    }

    public String getSection() {
        return mSection;
    }

    public String getNewsTitle(){
        return mNewsTitle;
    }

    public String getDate(){
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

}
