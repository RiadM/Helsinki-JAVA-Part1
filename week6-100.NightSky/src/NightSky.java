public class NightSky {
    private double density;
    private int width;
    private  int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }


    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public void printLine(){


        for(int i = 0; i < this.width; i++){
            if( (((double)Math.random() * 100) / 100) <= this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            } else{
                System.out.print(" ");
            }
        }
    }

    public void print(){
        this.starsInLastPrint = 0;
        for(int i = 0; i < this.height; i++){
            this.printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
