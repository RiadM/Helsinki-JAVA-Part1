public class Counter {

    private int value;
    private boolean check;

    public Counter(){
        this(0,false);
    }

    public Counter(int startingValue){
        this(startingValue,false);
    }

    public Counter(boolean check){
        this(0,check);
    }

    public Counter(int startingValue, boolean check){
        this.value = startingValue;
        this.check = check;
    }


    public int value(){
        return this.value;
    }

    public void increase(int increaseAmount){
        if(this.value >= 0 && increaseAmount >= 0) {
            this.value+= increaseAmount;
        }
    }

    public void decrease(int decreaseAmount){
        if((this.value > 0 || !check) && decreaseAmount >= 0){

            if(decreaseAmount >= this.value && check){
                this.value = 0;
            }
            else if (check == false){
                this.value -= decreaseAmount;
            }
            else {
                this.value-= decreaseAmount;
            }
        }
    }

    public void increase(){
        this.increase(1);
    }

    public void decrease(){
       this.decrease(1);
    }
}
