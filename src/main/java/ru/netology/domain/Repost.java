package ru.netology.domain;

public class Repost {
    private int countRepost;
    private int[] userId;

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int[] getUserId() {
        return userId;
    }

    public void setUserId(int[] userId) {
        this.userId = userId;
    }
}
