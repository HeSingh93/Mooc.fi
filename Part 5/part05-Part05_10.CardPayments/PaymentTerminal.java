
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        money = 1000;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50)
            return false;
        affordableMeals++;
        card.takeMoney(2.50);
        return true;
    }

    public double eatAffordably(double payment) {
        if (payment < 2.50)
            return payment;
        money = money + 2.50;
        affordableMeals++;
        return payment - 2.50;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30)
            return false;
        heartyMeals++;
        card.takeMoney(4.30);
        return true;
    }

    public double eatHeartily(double payment) {
        if (payment < 4.30)
            return payment;
        money = money + 4.30;
        heartyMeals++;
        return payment - 4.30;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > money || sum < 0) return;
        card.addMoney(sum);
        money = money + sum;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
