import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print(){
        int index = 0;
        for (String string : list) {
            index++;
            System.out.println(index + ": " + string);
        }
    }

    public void remove(int x){
        x = x - 1;
       this.list.remove(x);
    }
}
