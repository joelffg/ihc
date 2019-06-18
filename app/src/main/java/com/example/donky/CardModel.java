package com.example.donky;

public class CardModel {
    private int imageId;
    private String titleId;
    private int subtitleId;

    public CardModel(int imageId, String titleId, int subtitleId) {
        this.imageId = imageId;
        this.titleId = titleId;
        this.subtitleId = subtitleId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return titleId;
    }

    public int getSubtitle() {
        return subtitleId;
    }
}
