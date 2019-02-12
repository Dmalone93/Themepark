package ThemePark;

import Stalls.Stall;
import attractions.Attraction;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviews = getAllReviewed();
    }


    public int getAttractionNumber(){
        return this.attractions.size();
    }

    public int getStallNumber(){
        return this.stalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        for(IReviewed review : reviews){
            reviews.add(review);
        }
    }
}
