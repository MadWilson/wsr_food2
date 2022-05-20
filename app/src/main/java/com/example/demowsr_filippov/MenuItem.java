package com.example.demowsr_filippov;

public class MenuItem {
    private String name;
    private int price;
    private String iconResource;

    public MenuItem(String name, int price, String iconResource) {
        this.name = name;
        this.price = price;
        this.iconResource = iconResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIconResource() {
        return iconResource;
    }

    public void setIconResource(String iconResource) {
        this.iconResource = iconResource;
    }
}
