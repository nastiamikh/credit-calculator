public class Main {
    public static void main (String[] args) {

       Calculate test = new Calculate();

       long payment12month = test.calculate(1_000_000, 12, 9.99);
       System.out.println(payment12month);

       long payment24month = test.calculate(1_000_000, 24, 9.99);
        System.out.println(payment24month);

       long payment36month = test.calculate(1_000_000, 36, 9.99);
        System.out.println(payment36month);
    }
}
