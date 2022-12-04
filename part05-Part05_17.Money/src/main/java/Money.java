
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        Money newLessThan = new Money(this.euros, this.cents);
        if (newLessThan.euros < compared.euros()) {
            return true;
        }
        if (newLessThan.euros == compared.euros() && newLessThan.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser){
        int money1 = this.euros * 100 + this.cents;
        int money2 = decreaser.euros * 100 + decreaser.cents;
        int d = money1 - money2;
        if (d < 0) {
            d = 0;
        }
          Money newMoney = new Money(0, d);
          return newMoney;
    }
}
