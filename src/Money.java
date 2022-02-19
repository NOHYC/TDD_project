abstract class Money {
    protected int amount;
    protected String currency;
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    abstract Money times(int multiplicaion);

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
    String currency(){
        return currency;
    }
}


class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplicaion) {
        return  Money.dollar(amount * multiplicaion);
    }
    String currency(){
        return currency;
    }
}

class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplicaion) {
        return  Money.franc(amount * multiplicaion);
    }
    String currency(){
        return currency;
    }
}
