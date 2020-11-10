package AlgorithmPratice;


/**
 * Write a description of Binarysearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binarysearch {

    public int search(int[] a, int key)
    {
    int hi=a.length-1;
    int lo=0;
    int com=0;
    while (lo<=hi)
    {
        int mid=lo+(lo+hi)/2;
        if(key <a[mid]) hi=mid-1;
        else if(key>a[mid]) lo=mid+1;
        else
        return mid;
    }
    return -1;
}

public void mainrun()
{
    int[] a={2,3,4,6,7,9,11,13,14,15,16};
    
    System.out.println(search(a, 9));
    
}
}
