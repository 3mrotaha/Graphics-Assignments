package Exercise1;
import java.util.*;

public class primes {
    private int[] Primes = new int[5];

    public int getPrimes(int[] a, int minRange, int maxRange){
        int index = 0;
        for(int i = minRange; i <= maxRange; i++){
            if(isPrime(i)){
                if(index == Primes.length){
                    Primes = resizeArr(Primes, 1);
                }
                Primes[index] = i;
                index++;
            }                
        }
        
        a = Primes;
        return index;
    }

    private boolean isPrime(int num){
        if(num == 0 || num == 1) return false;
        else if(num == 2) return true;
        else{
            double sqrtNum = Math.sqrt(num);
            for(int i = 2; i <= sqrtNum; i++){
                if(num % i == 0)
                    return false;
            }

            return true;
        }
    }

    private int[] resizeArr(int[] a, int increment_value){
        int[] newArr = new int[a.length + increment_value];        
        for(int i = 0; i < a.length; i++)
            newArr[i] = a[i];

        return newArr;
    }    

    public void primesPrint(){
        for(int i = 0; i < Primes.length; i++){
            System.out.print(Primes[i] + (i < Primes.length - 1? ", ":""));
        }
    }


}
