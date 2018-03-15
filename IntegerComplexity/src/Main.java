import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();

        int b = (int) Math.sqrt(a);
        int c = 0;

        for (int i = 2; i <= b; i++) {
            if (a % i == 0) {
                c = i;
            }
        }
        int ab = c + (a / c);
        System.out.println("value of A: " + a);
        System.out.println("value of B: " + (a/c));
        System.out.println("value of C: " + c);
        System.out.println("min value of B+C: " + ab);
    }
}
