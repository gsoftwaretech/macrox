package tech.gsoftware.macrox.data;

import java.util.List;

public class Data {
    private String theme;
    private List<Item> items;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}