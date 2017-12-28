import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList();

    }

    public void add(Bird x){
        this.birdList.add(x);
    }

    public void observed(String birdObserved){

        for(Bird bird : this.birdList){
            if(bird.getBirdName().equalsIgnoreCase(birdObserved)){
                bird.setNumberOfTimeObserved();
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }

    public void statistics(){
        for(Bird bird : this.birdList){
            System.out.println(print(bird.getBirdName(), bird.getBirdNameLatin(), bird.getNumberOfTimeObserved()));
        }
    }

    public void show(String birdShow){
        for(Bird bird : this.birdList){
            if(bird.getBirdName().equalsIgnoreCase(birdShow)){
                System.out.println(print(bird.getBirdName(), bird.getBirdNameLatin(), bird.getNumberOfTimeObserved()));
            }
        }
    }

    public static String print(String name,String latin, int observ){
        String x = name + " (" + latin + "): " + observ + " observations";
        return x;
    }
}
