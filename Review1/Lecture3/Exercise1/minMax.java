package Exercise1;
import java.util.*;



public class minMax{
    private int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    private int[] a = new int[10];

    public void read10Numbers(){        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++)
            a[i] = sc.nextInt();
    }

    public void printMinMax(){
        for(int i = 0; i < 10; i++){            
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }     
        System.out.print("the maximum number is " + max + ", the minimum number is " + min);
    }
}