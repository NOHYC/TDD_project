interface Expression {
    Expression plus(Money addend);

    Money reduce(Bank bank, String to);
}
