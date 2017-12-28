

    // copy here the class BoundedCounter from last weeks assignment 78
  public class BoundedCounter{
        private int value;
        private int upperLimit;

        public BoundedCounter(int upperLimit){
            this.upperLimit = upperLimit;
        }

        public int getValue(){
            return this.value;
        }

        public void setValue(int value){
            if(value >= 0 && value <= this.upperLimit){
                this.value = value;
            }
        }

        public void next(){
            this.value++;
            if(this.value > this.upperLimit){
                this.value = 0 ;
            }
        }

        public String toString(){
            if(this.value < 10){
                return "0" + value;
            } else{
                return "" +value;
            }
        }
    }


