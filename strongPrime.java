import java.util.*;

public class strongPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        List<Integer> primes = new ArrayList<>();
        for(int i = n1; i <= n2; i++) {
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        for(int i = n1; i <= n2; i++) {
            if(findStrongPrimeNum(i, primes)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean findStrongPrimeNum(int n, List<Integer> primes) {
        if(!isPrime(n)) {
            return false;
        }
        int position = primes.indexOf(n) + 1;
        if(position == 0 || position == 1 || position == primes.size()) {
            return false;
        }
        int prevPrime = primes.get(position - 2);
        int nextPrime = primes.get(position);

        return (n > (prevPrime + nextPrime) / 2.0);
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
