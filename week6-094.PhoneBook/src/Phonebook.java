import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();


    public void add(String name, String number){
        Person newPerson = new Person(name,number);
        this.list.add(newPerson);
    }

    public void printAll(){
        for(Person human: this.list){
            System.out.println(human.toString());
        }
    }

    public String searchNumber(String name){
        for(Person human: this.list){
            if(human.getName().equals(name)){
                return  human.getNumber().toString();
            }
        }
        return "number not known";


    }
}
