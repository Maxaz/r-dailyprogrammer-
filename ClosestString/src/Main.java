import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of lines to read for input: ");
        ClosestString cString = new ClosestString();
        int numLines = scan.nextInt();
        for (int i = 0; i < numLines; i++) {
            System.out.println("Enter the next string no. " + (i+1));
            cString.addString(scan.next());
        }

        cString.displayList();
        System.out.println("***************");
        System.out.println("The Hamming distance best string is: " + cString.hammingDistance());

    }
}
