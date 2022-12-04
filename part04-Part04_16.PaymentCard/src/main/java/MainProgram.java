
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
       PaymentCard paulCard = new PaymentCard(20);
       PaymentCard mattsCard = new PaymentCard(30);

       paulCard.eatHeartily();
       mattsCard.eatAffordably();
       System.out.println("Paul: "+ paulCard.toString());
       System.out.println("Matt: "+ mattsCard.toString());

       paulCard.addMoney(20);
       mattsCard.eatHeartily();
       System.out.println("Paul: "+ paulCard.toString());
       System.out.println("Matt: "+ mattsCard.toString());


       paulCard.eatAffordably();
       paulCard.eatAffordably();
       mattsCard.addMoney(50);
       System.out.println("Paul: "+ paulCard.toString());
       System.out.println("Matt: "+ mattsCard.toString());



    }
}
