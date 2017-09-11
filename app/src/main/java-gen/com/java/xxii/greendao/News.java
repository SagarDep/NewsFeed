package com.java.xxii.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NEWS.
 */
public class News {

    /** Not-null value. */
    private String News_ID;
    private String Key_Words;

    public News() {
    }

    public News(String News_ID) {
        this.News_ID = News_ID;
    }

    public News(String News_ID, String Key_Words) {
        this.News_ID = News_ID;
        this.Key_Words = Key_Words;
    }

    /** Not-null value. */
    public String getNews_ID() {
        return News_ID;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNews_ID(String News_ID) {
        this.News_ID = News_ID;
    }

    public String getKey_Words() {
        return Key_Words;
    }

    public void setKey_Words(String Key_Words) {
        this.Key_Words = Key_Words;
    }

}