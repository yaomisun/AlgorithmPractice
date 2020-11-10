package AlgorithmPratice;


/**
 * Write a description of Stackprac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Stack;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;

public class Stackprac {

    private String[] s;
    private int N=0;
    public void ArrayStack(int length)
    {
       s=new String[length];
    }
    
    public boolean isEmpty()
    {
        return N==0;
    }
    public void push(String item)
    {
        if(N==s.length) resize(2*s.length);
        s[N++]=item;
    }
    public String pop()
    {
        String toRemove= s[--N];
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
