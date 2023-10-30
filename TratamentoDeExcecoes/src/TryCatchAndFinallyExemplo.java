import java.util.Scanner;
public class TryCatchAndFinallyExemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberA, numberB, res;
        System.out.println("A: ");
        numberA = in.nextInt();
        System.out.println("B: ");
        numberB = in.nextInt();
        try {
            res = numberA / numberB;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            in.close();
            System.out.println("The code is still running!");
        }
    }
}
