package com.co.booking.models;

public class BookingInfo {

    private String location;
    private String checkIn;
    private String checkOut;
    private String adults;
    private String rooms;
    private String children;
    private String ageChildren;


    public BookingInfo(String location, String checkIn, String checkOut, String adults, String rooms, String children, String ageChildren) {
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.adults = adults;
        this.rooms = rooms;
        this.children = children;
        this.ageChildren = ageChildren;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getAgeChildren() {
        return ageChildren;
    }

    public void setAgeChildren(String ageChildren) {
        this.ageChildren = ageChildren;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckout() {
        return checkOut;
    }

    public void setCheckout(String checkout) {
        checkOut = checkout;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }
}
