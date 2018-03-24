import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input of type int: ");
        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.print(baumSweetSequenceSolution(i) + ", ");
        }

        System.out.print(baumSweetSequenceSolution(input));
    }

    private static int baumSweetSequenceSolution(int input) {
        // int to base2
        String binaryInput = Integer.toBinaryString(input);
        ArrayList<Boolean> countOdds = new ArrayList<>();
        int countOdd = 0;

        // counting the '0' and checking if the count is odd or not
        for (int i = 1; i < binaryInput.length(); i++) {

            if (binaryInput.charAt(i) == '0'){
                if (binaryInput.charAt(i-1) != '0'){
                    countOdd = 0;
                }
                countOdd++;
            }
            if ((binaryInput.charAt(i) != '0') && (countOdd > 0) || (i == binaryInput.length()-1)){
                countOdds.add((countOdd % 2 != 0));
            }
        }

        // if at least once there was an odd length of '0' return 0
        if (!countOdds.isEmpty()) {
            for (Boolean b : countOdds) {
                if (b == true) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
