package com.valid.test.model;

public class AttrTrack {

    private String rank;

    public AttrTrack() {
    }

    public AttrTrack(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        int r = Integer.parseInt(rank) + 1;
        return r < 10 ? "0" + r : String.valueOf(r);
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
