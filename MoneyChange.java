package AlgorithmPratice;


/**
 * Write a description of MoneyChange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MoneyChange {
public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int changecount=0;
        int curamount=Integer.parseInt(scanner.nextLine());
         while (curamount>0)
            {
                if (curamount - 10 >= 0)
                {
                    curamount = curamount - 10;
                    changecount += 1;
                }
                else if (curamount - 5 >= 0)
                {
                    curamount = curamount - 5;
                    changecount += 1;
                }
                else
                {
                    curamount = curamount - 1;
                    changecount += 1;
                }
            }
            System.out.println(changecount);
    }
}

