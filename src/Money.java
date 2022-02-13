abstract class Money {
    protected int amount;

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
}


class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplicaion) {
        return new Dollar(amount * multiplicaion);
    }
}

class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplicaion) {
        return new Franc(amount * multiplicaion);
    }
}
