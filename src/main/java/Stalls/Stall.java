package Stalls;

import ThemePark.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int parkingSlot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSlot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSlot = parkingSlot;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSlot(){
        return this.parkingSlot;
    }

    public int getRating(){
        return this.rating;
    }

}
