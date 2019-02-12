package attractions;

import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Rollercoster extends Attraction implements ISecurity {

    public Rollercoster(String name, int rating){
        super(name, rating);
    }

    public boolean isAlloweedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight() > 4.7){
            return true;
        }
        return false;

    }
}

