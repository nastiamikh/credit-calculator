public class Main {
    public static void main (String[] args) {

       Calculate test = new Calculate();
       long payment = test.calculate(1_000_000, 36, 9.99);

       System.out.println(payment);
    }
}
