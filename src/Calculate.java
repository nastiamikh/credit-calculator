public class Calculate {
    public long calculate (double amount,double month, double percent) {
        double percent1 = percent / 12 / 100;
        double formula1 = 1 + percent1;
        double power = (double) Math.pow(formula1, month);
        double formula2 = percent1 * power;
        double formula3 = power - 1;
        double payment = formula2 / formula3 * amount;
        return (long) payment;
    }
}

