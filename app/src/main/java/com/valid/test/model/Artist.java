package com.valid.test.model;

import java.util.List;

public class Artist {

    private String name;
    private String listeners;
    private String mbid;
    private String url;
    private String streamable;
    private List<Image> image;

    public Artist() {
    }

    public Artist(String name, String listeners, String mbid, String url, String streamable, List<Image> image) {
        this.name = name;
        this.listeners = listeners;
        this.mbid = mbid;
        this.url = url;
        this.streamable = streamable;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getListeners() {
        return listeners;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    public String getMbid() {
        return mbid;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStreamable() {
        return streamable;
    }

    public void setStreamable(String streamable) {
        this.streamable = streamable;
    }

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public String getDescription() {
        String data = "";

        data =
                "Name: " + name + "\n" +
                        "Listeners: " + listeners + "\n";
        return data;
    }
}
