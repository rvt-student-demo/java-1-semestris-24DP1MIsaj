package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount < 0)
            this.balance += amount;
            
        if (this.balance + amount > 0)
            this.balance += amount;
    }

    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard paulsCard = new PaymentCard(20);
            PaymentCard mattsCard = new PaymentCard(30);

            paulsCard.eatHeartily();
            mattsCard.eatAffordably();

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);

            paulsCard.addMoney(20);
            mattsCard.eatHeartily();

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);

            paulsCard.eatAffordably();
            paulsCard.eatAffordably();
            mattsCard.addMoney(50);

            System.out.println("Paul: " + paulsCard);
            System.out.println("Matt: " + mattsCard);
        }
    }
}
