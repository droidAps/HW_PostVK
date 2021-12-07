package ru.netology.domain;

public class Content {
    private String text;
    private String mediaURL;
    private String postIdURL;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMediaURL() {
        return mediaURL;
    }

    public void setMediaURL(String mediaURL) {
        this.mediaURL = mediaURL;
    }

    public String getPostIdURL() {
        return postIdURL;
    }

    public void setPostIdURL(String postIdURL) {
        this.postIdURL = postIdURL;
    }
}
