package ru.netology.domain;

public class Post {
    private int postId;
    private int authorId;
    private DateTime dateTime;
    private Content content;
    private int countViews;
    private Like likes;
    private Repost reposts;
    private Comment comments;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public int getCountViews() {
        return countViews;
    }

    public void setCountViews(int countViews) {
        this.countViews = countViews;
    }

    public Like getLikes() {
        return likes;
    }

    public void setLikes(Like likes) {
        this.likes = likes;
    }

    public Repost getReposts() {
        return reposts;
    }

    public void setReposts(Repost reposts) {
        this.reposts = reposts;
    }

    public Comment getComments() {
        return comments;
    }

    public void setComments(Comment comments) {
        this.comments = comments;
    }
}
