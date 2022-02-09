class Dollar{
    private int amount;
    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplicaion){
        return new Dollar(amount * multiplicaion);
    }
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}