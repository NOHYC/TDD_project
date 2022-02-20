interface Expression {
    Expression plus(Money addend);
}

class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    static Money franc(int amount) {
        return new Money(amount, "CHF");
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
    public Expression plus(Money addend){
        return new Sum(this, addend);
    }

}
class Bank {
    Money reduce(Expression source, String to)
    {
        Sum sum = (Sum) source;
        int amount = sum.addend.amount + sum.augend.amount;
        return new Money(amount, to);
    }
}

class Sum implements Expression{
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Expression plus(Money addend) {
        return null;
    }
}


