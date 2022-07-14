public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + e.getRemainingAmount());
                try {
                    bankAccount.withDraw(bankAccount.getAmount().intValue());
                } catch (LimitException ex) {
                    System.out.println(e.getMessage() + e.getRemainingAmount());
                    break;
                }
            }

        }
    }
}