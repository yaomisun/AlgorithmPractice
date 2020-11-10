package AlgorithmPratice;


/**
 * Write a description of AplusB here.
 * 
 * @author (hongliang sun) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AplusB {

    public static void main(String[] args)
    {
        int a;
        int b;
        int[] temp={0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine().replaceAll("\\s","");
        for(int i=0;i<inputs.length();i++) {
         if(inputs.charAt(i)!=' ')
         {
            temp[i]=Integer.parseInt(String.valueOf(inputs.charAt(i)));
        }
        
        }
        a=temp[0];
        b=temp[1];
        int sum=a+b;
        System.out.println(sum);
    }
    
}
