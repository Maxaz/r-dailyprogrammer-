public class Base62 {

    public static final String MY_ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Base62() {

    }

    public static String toBase62(long i) {
        if (i == 0) {
            Character zero = MY_ALPHABET.charAt(0);
            return zero.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (i > 0) {
            i = fromBase10(i, stringBuilder);
        }
        return stringBuilder.reverse().toString();
    }

    private static long fromBase10(long i, StringBuilder stringBuilder) {
        int rem = (int)(i % MY_ALPHABET.length()) ;
        stringBuilder.append(MY_ALPHABET.charAt(rem));
        return i / MY_ALPHABET.length();
    }
}
