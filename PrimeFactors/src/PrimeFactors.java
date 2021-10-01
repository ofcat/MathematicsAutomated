public class PrimeFactors {


    public static void primeFactors(int n) {
        //print all 2s tha divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        //check all the other factors
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);

    }

    //simple prime checker
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String[] args) {
        int n = 105;
        primeFactors(n);
    }
}
