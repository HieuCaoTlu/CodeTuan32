package com.example.codetuan32;

class Contact {
    private int avatar;
    private String title;
    private String description;

    public Contact(String title, String description, int avatar) {
        this.title = title;
        this.description = description;
        this.avatar = avatar;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setPhone(String description) {
        this.description = description;
    }
}