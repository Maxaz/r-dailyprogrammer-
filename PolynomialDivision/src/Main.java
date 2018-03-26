public class Main {

    public static void main(String[] args) {
        int[] dividend = {2, -9, 21, -26, 12};
        int[] divisor = {2, -3};
        extendedSyntheticDivision(dividend, divisor);
    }

    private static void extendedSyntheticDivision(int[] dividend, int[] divisor) {

        int[] out = dividend.clone();
        int normalizer = divisor[0];
        int coef;
        for (int i = 0; i < (dividend.length - (divisor.length - 1)); i++) {
            out[i] /= normalizer;

            coef = out[i];
            if (coef != 0) {
                for (int j = 1; j < divisor.length; j++) {
                    out[i + j] += -1 * (divisor[j]) * coef;
                }
            }
        }
        int separator = (dividend.length - (divisor.length - 1));
//        int[] quotient = new int[separator];
        System.out.print("Quotient: ");
        for (int i = 0; i < separator; i++) {
            System.out.print(out[i] + "x^" + (separator - i - 1));
            if (i != separator - 1) {
                System.out.print(" + ");
            }
        }
//        int[] remainder = new int[(out.length - separator)];
        System.out.print(" Remainder: ");
        for (int i = separator; i < out.length; i++) {
            System.out.print(out[i] + "x^" + (out.length - i - 1));
            if (i != out.length - 1) {
                System.out.print(" + ");
            }
        }

    }

}
