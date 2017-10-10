public class Pow {
    public static void main(String[] args) {
        double base = 4.0;
        int exp = -2;
        System.out.println(pow(base, exp));
    }

    public static double pow(double base, int exp) {
        double result = 1.0;
        boolean inverse = false;
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            for (int i=1; i<=-exp; i++) {
                result *= base;
            }
            return 1.0 / result;
        } else {
            for (int i=1; i<=exp; i++) {
                result *= base;
            }
            return result;
        }
    }
}
