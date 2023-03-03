package com.co.booking.models;

public class HotelInfoOnlyAdult {

    private String location;
    private String checkIn;
    private String checkOut;
    private String adults;
    private String rooms;

    public HotelInfoOnlyAdult(String location, String checkIn, String checkout, String adults, String rooms) {
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkout;
        this.adults = adults;
        this.rooms = rooms;
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
