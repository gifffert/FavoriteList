package ru.embersoft.favoritelist.Helpers;

public class FavItem {

    private String item_title;
    private String key_id;
    private int item_image;

    public FavItem() {
    }

    public FavItem(String item_title, String key_id, int item_image) {
        this.item_title = item_title;
        this.key_id = key_id;
        this.item_image = item_image;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }
}
