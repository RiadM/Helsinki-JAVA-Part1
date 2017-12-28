
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added){

        int centsAdded = this.cents + added.cents;
        int eurosAdded = added.euros + this.euros;

        Money newAdded = new Money(eurosAdded,centsAdded);
        return newAdded ;
    }

    public boolean less(Money compared){

        if(this.euros > compared.euros){
            return false;
        }
        else if(this.euros < compared.euros){
            return true;
        } else {
            if(this.cents >= compared.cents){
                return false;
            } else {
                return true;
            }
        }
    }

    public Money minus(Money decremented){

        int totalThis = this.euros * 100 + this.cents;
        int totalDecr = decremented.euros * 100 + decremented.cents;

        int newTotal = totalThis - totalDecr;
        if(newTotal < 0){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }else {
            Money newMoney = new Money((newTotal / 100), (newTotal % 100));
            return newMoney;
        }

    }
    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
