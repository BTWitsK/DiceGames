package Games;

public class Money {
    private int balance = 0;

    public Money(int balance) {
        setBalance(balance);

    }

    public void setBalance (int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount){
        //TODO:implement credit
    }

    public void debit(int amount){
        //TODO:implement debit
    }
}
