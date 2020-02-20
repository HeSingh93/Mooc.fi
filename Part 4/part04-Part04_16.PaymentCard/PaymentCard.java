public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        } else
            System.out.println("Insufficient money");
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        } else
            System.out.println("Insufficient money");
    }

    public void addMoney(double amount) {
        if (amount < 0)
            return;
        balance += amount;
        if (balance > 150.0) {
            balance = 150.0;
        }
    }


}
