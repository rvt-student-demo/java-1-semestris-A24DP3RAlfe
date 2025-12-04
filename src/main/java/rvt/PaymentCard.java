package rvt;

class PaymentCardMain {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(28);

        paulsCard.eatAffordably();
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatAffordably();


        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(70);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
    
}


 public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + String.format("%.2f", this.balance) + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.94) {
            this.balance -= 2.94;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.57) {
            this.balance -= 4.57;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        }
    }
 }