interface Expression {
    Expression plus(Expression addend);
    Expression times(int multiplication);
    Money reduce(Bank bank, String to);
}
