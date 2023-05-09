package accessmodifiers.financial;

public class Record {
    void displayBalance() {
        Balance balance = new Balance();

//        balance.amount = 900;
//
//
//        System.out.println(balance.amount);
//
//        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Record record = new Record();
        record.displayBalance();
    }
}