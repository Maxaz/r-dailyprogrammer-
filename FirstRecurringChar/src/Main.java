import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String input = scan.nextLine();

        System.out.println("Recuring character exists? " + solver(input));
    }

    private static boolean solver(String input) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++){
            if (hashMap.containsKey(input.charAt(i))){
                System.out.println(input.charAt(i) + " originally at index(0 based): " + hashMap.get(input.charAt(i)));
                return true;
            } else hashMap.put(input.charAt(i),i);
        }
        return false;
    }
}
