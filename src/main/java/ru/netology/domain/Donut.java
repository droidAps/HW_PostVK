package ru.netology.domain;

public class Donut {
    private int isDonut;
    private int paidDuration;
    private String placeholderURL;
    private boolean canPublishFreeCopy;
    private String editMode;

    public int getIsDonut() {
        return isDonut;
    }

    public void setIsDonut(int isDonut) {
        this.isDonut = isDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public String getPlaceholderURL() {
        return placeholderURL;
    }

    public void setPlaceholderURL(String placeholderURL) {
        this.placeholderURL = placeholderURL;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
