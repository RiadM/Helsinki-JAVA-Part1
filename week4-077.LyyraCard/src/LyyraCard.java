public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }

    public void payEconomical(){
        if(this.balance > 2.49){
            this.balance -= 2.50;
        }
    }

    public void payGourmet(){
        if (this.balance > 3.99){
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount){

        if(amount >= 0){
            this.balance += amount;

            if(this.balance >= 150){
                this.balance = 150;
            }
        }



    }

    public String toString(){
        return "The card has " + this.balance + " euros";
    }
}
