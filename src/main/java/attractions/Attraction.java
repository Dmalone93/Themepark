package attractions;

import ThemePark.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;

    }
    public String getName() {
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }


}
