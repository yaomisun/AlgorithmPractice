package AlgorithmPratice;


/**
 * Write a description of LeastCommonMutiple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class LeastCommonMutiple {
 public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        String[] splite = inputs.split("\\s+");
        int a=Integer.parseInt(splite[0]);
        int b=Integer.parseInt(splite[1]);
        int gcd=GCD(a,b);
        long raw=((long)a)*b;
        if (raw % gcd == 0)
                System.out.println( raw / gcd);
            else
                System.out.println( raw);
        
    }
    public static int GCD(int a, int b)
    {
        if(b==0)
        return a;
        else
        {
            int r=a%b;
            return GCD(b,r);
        }
    }
}
