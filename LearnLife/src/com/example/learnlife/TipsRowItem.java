package com.example.learnlife;

public class TipsRowItem {
    private String title;
    private String description;

    public TipsRowItem(String title, String desc) {
        this.title = title;
        this.description = desc;
    }
    public String getDesc() {
        return description;
    }
    public void setDesc(String desc) {
        this.description = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + description;
    }
}
