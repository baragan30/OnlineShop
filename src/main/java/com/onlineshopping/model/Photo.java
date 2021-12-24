package com.onlineshopping.model;

public class Photo {
    private int id;
    private String source;

    public Photo(int id,String source){
        this.id=id;
        this.source=source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
