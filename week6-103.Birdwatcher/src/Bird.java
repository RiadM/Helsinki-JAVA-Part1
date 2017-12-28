public class Bird {

    private String birdName;
    private String birdNameLatin;

    private int numberOfTimeObserved;

    public Bird(String birdName, String birdNameLatin) {
        this.birdName = birdName;
        this.birdNameLatin = birdNameLatin;
        this.numberOfTimeObserved = 0;
    }

    public String getBirdName() {
        return this.birdName;
    }

    public String getBirdNameLatin(){
        return this.birdNameLatin;
    }

    public int getNumberOfTimeObserved(){
        return this.numberOfTimeObserved;
    }

    public void setNumberOfTimeObserved() {
        this.numberOfTimeObserved += 1;
    }
}
