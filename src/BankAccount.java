public class BankAccount {

    private Double amount = 0.0;

    public Double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = sum + amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("You can not draw more than your account remaining. \nYou have: ", amount);
        } else {
            amount = amount - sum;
        }
    }

}
