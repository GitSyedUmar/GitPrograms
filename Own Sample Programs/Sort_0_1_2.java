import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[] = {0,1,0,2,0,2};
		int count0 = numcount(a,0);
		int count1 = numcount(a,1);
		int count2 = numcount(a,2);
		for(int i=0;i<a.length;i++)
		{
		    if(count0 > 0)
		    {
		        a[i] = 0;
		        count0--;
		    }
		    else if(count1 > 0)
		    {
		        a[i] = 1;
		        count1--;
		    }
		    else if(count2 > 0)
		    {
		        a[i] = 2;
		        count2--;
		    }
		}
		for(int i=0;i<a.length;i++)
		{
		    System.out.print(a[i]+" ");
		}
	}
	static int numcount(int a[],int n)
	{
	    int i=0;
	    int c=0;
	    while(i<a.length)
	    {
	        if(a[i] == n)
	        c++;
	        i++;
	    }
	    return c;
	}
}