package AlgorithmPratice;


/**
 * Write a description of QueuePrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Stack;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;

public class Queueprac {

    private String[] s;
    private int N=0;
    public void ArrayQueue(int length)
    {
       s=new String[length];
    }
    
    public boolean isEmpty()
    {
        return N==0;
    }
    public void enqueue(String item)
    {
        if(N==s.length) resize(2*s.length);
        s[N++]=item;
    }
    public String dequeue()
    {
        String toRemove= s[0];
        for (int i=0; i<s.length; i++)
        s[i]=s[i-1];
        s[N]=null;
        if(N>0 && N==s.length/4) resize(s.length/2);
        return toRemove;
    }
    
    private void resize(int capacity)
    {
        String[] copy=new String[capacity];
        for(int i=0; i<N; i++)
            copy[i]=s[i];
        s=copy;
    }
}
