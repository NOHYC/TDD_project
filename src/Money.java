interface Expression {
    Expression plus(Money addend);
    Money reduce(String to);
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
    public Money reduce(String to) {
        return this;
    }
}
class Bank {
    Money reduce(Expression source, String to)
    {
        return source.reduce(to);
    }
}

class Sum implements Expression{
    Money augend;
    Money addend;

    Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }
    public Money reduce(String to){
        int amount = addend.amount + augend.amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Money addend) {
        return null;
    }
}


