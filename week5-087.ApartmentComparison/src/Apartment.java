
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartement){
        if(this.squareMeters > otherApartement.squareMeters){
            return true;
        } else{
            return false;
        }
    }

    public int priceDifference(Apartment otherApartement){
        return Math.abs((this.squareMeters * this.pricePerSquareMeter) - (otherApartement.squareMeters * otherApartement.pricePerSquareMeter));
    }


    public boolean moreExpensiveThan(Apartment otherApartement){
        if((this.pricePerSquareMeter*this.squareMeters) > (otherApartement.squareMeters*otherApartement.pricePerSquareMeter)){
            return true;
        } else{
            return false;
        }
    }
}
