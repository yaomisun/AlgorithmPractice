package AlgorithmPratice;


/**
 * Write a description of SumofLastDigitofFib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SumofLastDigitofFib {
public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int length=Integer.parseInt(scanner.nextLine());
        if (length <= 1)
            {
                System.out.println(length);
            }
         
            else
            {
                int[] F = new int[length+1];
            F[0] = 0;
            F[1] = 1;
            
                for(int i=2; i<=length; i++)
                {
                    F[i] = (F[i - 1] + F[i - 2])%10;
                    sum=sum+F[i];
                }
                System.out.println(sum%10);
            }
            
    }
}
