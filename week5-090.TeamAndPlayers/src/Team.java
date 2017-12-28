import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> team;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        this.team = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player){
        if(this.team.size() < this.maxSize){
            this.team.add(player);
        }
    }

    public void printPlayers(){
        for(Player player: this.team){
            System.out.println(player);
        }
    }


    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int size(){
        return this.team.size();
    }

    public int goals(){
        int sum = 0;
        for(Player player: this.team){
            sum += player.goals();
        }

        return sum;
    }


}
