abstract class Money {
    protected int amount;
    protected String currency;
    abstract Money times(int multiplicaion);

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static Money franc(int amount) {
        return new Franc(amount);
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
    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplicaion) {
        return new Dollar(amount * multiplicaion);
    }
    String currency(){
        return currency;
    }
}

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplicaion) {
        return new Franc(amount * multiplicaion);
    }
    String currency(){
        return currency;
    }
}
