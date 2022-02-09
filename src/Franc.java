public class Franc {

    private int amount;
    Franc(int amount){
        this.amount = amount;
    }
    Franc times(int multiplicaion){
        return new Franc(amount * multiplicaion);
    }
    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

}
