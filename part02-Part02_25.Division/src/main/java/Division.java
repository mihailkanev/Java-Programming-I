

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"
        division(3,5);
        // division(3, 5);
    }

    // implement the method here
    public static void division(int num1,int num2) {
        double div = Double.valueOf(num1) / Double.valueOf(num2);
        System.out.println(div);
    }
}
