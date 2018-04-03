import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input: ");
        String[] input = scan.nextLine().split(" ");
        alphabetCipherSolver(input[0], input[1]);
        alphabetCipherDesolver(input[0], input[1]);
    }

    private static void alphabetCipherSolver(String keyword, String message) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        String keyword1 = keyword;

        if (keyword.length() < message.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            int limit = (message.length() / keyword.length());
            int rest = message.length() % keyword.length();
            for (int i = 0; i < limit; i++) {
                stringBuilder.append(keyword);
            }
            if (rest > 0) {
                for (int j = 0; j < rest; j++) {
                    stringBuilder.append(keyword.charAt(j));
                }
            }
            keyword1 = stringBuilder.toString();
        }
        StringBuilder encodedMessageBuilder = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ALPHABET, ALPHABET.indexOf(message.charAt(i)), ALPHABET.length());
            stringBuilder.append(ALPHABET, 0, ALPHABET.indexOf(message.charAt(i)));
            String tempAlph = stringBuilder.toString();
            encodedMessageBuilder.append(tempAlph.charAt(ALPHABET.indexOf(keyword1.charAt(i))));
        }

        String encodedMessage = encodedMessageBuilder.toString();
        System.out.println("Encrypted message: " + encodedMessage);
    }

    private static void alphabetCipherDesolver(String keyword, String encryptedMessage) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        String keyword1 = keyword;

        if (keyword.length() < encryptedMessage.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            int limit = encryptedMessage.length() / keyword.length();
            int rest = encryptedMessage.length() % keyword.length();
            for (int i = 0; i < limit; i++) {
                stringBuilder.append(keyword);
            }
            if (rest > 0) {
                for (int j = 0; j < rest; j++) {
                    stringBuilder.append(keyword.charAt(j));
                }
            }
            keyword1 = stringBuilder.toString();
        }

        StringBuilder decryptedStringBuilder = new StringBuilder();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            int keywordPos = ALPHABET.indexOf(keyword1.charAt(i));
            int encryptedPos = ALPHABET.indexOf(encryptedMessage.charAt(i));
            int decryptPos = encryptedPos - keywordPos;
            if (decryptPos >= 0) decryptedStringBuilder.append(ALPHABET.charAt(decryptPos));
            else decryptedStringBuilder.append(ALPHABET.charAt(ALPHABET.length() + decryptPos));
        }
        String decryptedString = decryptedStringBuilder.toString();
        System.out.println("Decrypted message: " + decryptedString);
    }
}
