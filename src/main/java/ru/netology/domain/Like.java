package ru.netology.domain;

public class Like {
    private int countLikes;
    private int[] userId;

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }

    public int[] getUserId() {
        return userId;
    }

    public void setUserId(int[] userId) {
        this.userId = userId;
    }
}
