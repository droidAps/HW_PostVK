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

    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private Copyright copyright;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
