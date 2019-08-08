package com.example.travelmantics;

import java.io.Serializable;

public class holidayDeal implements Serializable {
    private String id;
    private String title;
    private String hotel;
    private String price;
    private String imageUrl;

    public holidayDeal(){}


    public holidayDeal(String title, String hotel, String price, String imageUrl) {
        this.setId(id);
        this.setTitle(title);
        this.setHotel(hotel);
        this.setPrice(price);
        this.setImageUrl(imageUrl);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
