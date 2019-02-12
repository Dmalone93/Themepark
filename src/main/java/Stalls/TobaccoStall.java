package Stalls;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSlot, int rating){
        super(name, ownerName, parkingSlot, rating);
    }

    public boolean isAlloweedTo(Visitor visitor) {
        if(visitor.getAge() > 18){
            return true;
        }
        return false;
    }
}
