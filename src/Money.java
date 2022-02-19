class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
    String currency(){
        return currency;
    }
    public String toString(){
        return amount + " " + currency;
    }
    Money times(int multiplication) {
        return new Money(amount * multiplication, currency);
    }
}
class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }
}
