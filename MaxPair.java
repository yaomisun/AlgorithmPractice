package AlgorithmPratice;


/**
 * Write a description of MaxPair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MaxPair {
    public static void main(String[] args)
    {
        
         Scanner scanner = new Scanner(System.in);
        String inputs1 = scanner.nextLine();
        int n=Integer.parseInt(inputs1);
        int[] temp = new int[n];
        String inputs = scanner.nextLine();
        String[] splite = inputs.split("\\s+");
        for(int i=0;i<n;i++) {
            int tt=Integer.parseInt(splite[i]);
            temp[i]=Integer.valueOf(tt);
        }
        // long result=MaxPair(temp);
     
     MaxPair(temp, n);
}
    
    public static void MaxPair(int[] inputs, int length)
    {
        int index1=1;
        if(length==1)
        System.out.println(((long)inputs[0]));
        else if(length==2)
        System.out.println(((long)inputs[0])*inputs[1]);
        else
        {
        for (int i=2; i<length; i++)
        {
            if (inputs[i]>inputs[index1])
            index1=i;
            
        }
        int index2=1;
        for (int i=2; i<length; i++)
        {
            if (inputs[index1]!=inputs[i] &&inputs[i]>inputs[index2])
            index2=i;
            
        }
        System.out.println(((long)inputs[index1])*inputs[index2]);
    }
}
        
        
    }
    


