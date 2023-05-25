public class User {
    private String phoneNumber;
    private String username;
    private double loadBalance;

    public User(String phoneNumber, String username) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.loadBalance = 100.00;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public double getLoadBalance() {
        return loadBalance;
    }

    public void setLoadBalance(double loadBalance) {
        this.loadBalance = loadBalance;
    }
}
