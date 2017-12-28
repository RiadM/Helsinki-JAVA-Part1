
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double priceGourmet = 4.00;
    private static final double priceEconomical = 2.50;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if(cashGiven >= priceEconomical){
            this.cashInRegister+=priceEconomical;
            this.economicalSold++;
            return cashGiven - priceEconomical;
        }else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens

        if(cashGiven >= priceGourmet){
            this.cashInRegister+=priceGourmet;
            this.gourmetSold++;
            return cashGiven - priceGourmet;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical (LyyraCard card){

        if(card.balance() >= priceEconomical){
            card.pay(priceEconomical);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet (LyyraCard card){
        if(card.balance() >= priceGourmet){
            card.pay(priceGourmet);
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}