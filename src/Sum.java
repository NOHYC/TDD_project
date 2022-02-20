class Sum implements Expression {
    Expression augend;
    Expression addend;

    Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = addend.reduce(bank, to).amount + augend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
    public Expression times(int multiplication){
        return new Sum(augend.times(multiplication),addend.times(multiplication));

    }
    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
