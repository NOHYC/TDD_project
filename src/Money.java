class Dollar{
    int amount;
    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplicaion){
        return new Dollar(amount * multiplicaion);
    }
}