public class LimitException extends Exception{

    private final Double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
