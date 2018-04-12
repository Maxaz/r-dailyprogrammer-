package pl.maxaz;

public class AlphabetCipher {
    private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private final String keyword;
    private final String message;

    public AlphabetCipher(String keyword, String message) {
        this.keyword = keyword;
        this.message = message;
    }

    public String encode() {
        String key = getKey();
        StringBuilder encodedMessageBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ALPHABET, ALPHABET.indexOf(message.charAt(i)), ALPHABET.length());
            stringBuilder.append(ALPHABET, 0, ALPHABET.indexOf(message.charAt(i)));
            String tempAlph = stringBuilder.toString();
            encodedMessageBuilder.append(tempAlph.charAt(ALPHABET.indexOf(key.charAt(i))));
        }

        return encodedMessageBuilder.toString();
    }


    public String decode() {
        String key = getKey();

        StringBuilder decryptedStringBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int keywordPos = ALPHABET.indexOf(key.charAt(i));
            int encryptedPos = ALPHABET.indexOf(message.charAt(i));
            int decryptPos = encryptedPos - keywordPos;
            if (decryptPos >= 0) decryptedStringBuilder.append(ALPHABET.charAt(decryptPos));
            else decryptedStringBuilder.append(ALPHABET.charAt(ALPHABET.length() + decryptPos));
        }
        return decryptedStringBuilder.toString();
    }

    private String getKey() {
        String key = keyword;

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
            key = stringBuilder.toString();
        }
        return key;
    }

}
