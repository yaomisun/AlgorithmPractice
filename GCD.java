package AlgorithmPratice;


/**
 * Write a description of GCD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class GCD {
     public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        String[] splite = inputs.split("\\s+");
        int a=Integer.parseInt(splite[0]);
        int b=Integer.parseInt(splite[1]);
        int re=GCDcalu(a,b);
        System.out.println(re);
    }
    public static int GCDcalu(int a, int b)
    {
        if(b==0)
        return a;
        else
        {
            int r=a%b;
            return GCDcalu(b,r);
        }
    }
}
