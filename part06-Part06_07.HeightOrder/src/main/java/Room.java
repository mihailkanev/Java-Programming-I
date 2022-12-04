import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list = new ArrayList<>();

    public void Person(){
        this.list = new ArrayList<>();
    }

    public void add(Person person){
        list.add(person);
    }

    public boolean isEmpty() {
        if(this.list.isEmpty()){
            return true;
        } 
            return false;
    }

    public ArrayList<Person> getPersons(){
        return list;
    }

    public Person shortest(){
        if (this.list.isEmpty()) {
            return null;
        }
        Person shortestperson = this.list.get(0);

        for (Person person : list) {
            if (person.getHeight() < shortestperson.getHeight()) {
                shortestperson = person;
            }
        }

        return shortestperson;
    }

    public Person take(){
        Person takPerson = this.shortest();
        this.list.remove(takPerson);
        return takPerson;
    }

}
