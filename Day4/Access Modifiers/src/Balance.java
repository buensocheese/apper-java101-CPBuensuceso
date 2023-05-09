package accessmodifiers.financial;

public class Balance {
    private int amount;

    public int getBalance() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 900) {
            this.amount = 900;
        } else {
            this.amount = amount;
        }
    }
}