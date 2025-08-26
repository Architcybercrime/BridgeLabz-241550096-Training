// Sieve to list primes up to n
import java.util.*;
public class SieveOfEratosthenes {
    public static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false; if (n>=1) isPrime[1]=false;
        for (int p=2;p*p<=n;p++){
            if (isPrime[p]){
                for (int k=p*p;k<=n;k+=p) isPrime[k]=false;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i=2;i<=n;i++) if (isPrime[i]) primes.add(i);
        return primes;
    }
    public static void main(String[] args){
        System.out.println(sieve(30)); // primes up to 30
    }
}
