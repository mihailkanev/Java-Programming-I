
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){

        String printOutput = "The collection " + this.name + " ";

        if (this.elements.isEmpty()) {
            return printOutput + "is empty.";
        } 

        if (this.elements.size() == 1) {
            printOutput += "has 1 element:";
        } else {
            printOutput += "has " + this.elements.size() + " elements:";
        }
      
        for (String string : elements) {
            printOutput += "\n" + string; 
        }   
        
        return printOutput;
    }
}
