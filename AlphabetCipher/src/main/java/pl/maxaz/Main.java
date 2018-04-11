package pl.maxaz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input: ");
        String[] input = scan.nextLine().split(" ");
        String keyword = input[0];
        String message = input[1];
        AlphabetCipher alphabetCipher = new AlphabetCipher(keyword, message);
        System.out.println("Encrypted message: " + alphabetCipher.encode());
        System.out.println("Decrypted message: " + alphabetCipher.decode());
    }
}
