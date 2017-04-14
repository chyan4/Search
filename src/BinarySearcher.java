
/**
 * Write a description of class LinearSearcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearcher
{
    public static int search(int[] a, int target)
    {
        int high = a.length-1;
        int low = 0;
        int guess = (high+low)/2;
        while (a[guess] != target)
        {
        	if (a[guess] < target && high != guess)
        	{
        		low = guess + 1;
        		guess = (high+low)/2;
        	}
        	else if (a[guess] > target && low != guess)
        	{
        		high = guess - 1;
        		guess = (high+low)/2;
        	}
        	else
        	{
        		return -1;
        	}
        }
        return guess;
    }

    public static int recursiveSearch(int[] a, int target,int low, int high)
    {
        // to do
        return -5; // remove
    }
}
