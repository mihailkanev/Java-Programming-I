import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    private int weight = 0;
   

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {

        if (suitcase.totalWeight() + this.weight <= this.maxWeight) {
            this.hold.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }

    public void printItems(){
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    
    public String toString(){
        if(hold.isEmpty()) {
            return "no items (" + this.weight + " kg)";
        }
        if (hold.size() == 1) {
            return this.hold.size() + " suitcase (" + this.weight + " kg)";
        }
        return this.hold.size() + " suitcases (" + this.weight + " kg)";
    }
}
