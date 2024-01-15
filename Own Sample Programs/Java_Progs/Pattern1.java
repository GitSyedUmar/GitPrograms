

import java.util.Scanner;

public class Pattern1
{
	public static void main(String[] args) {
	    
	    System.out.print("Enter the Input Range: ");
	    int n = new Scanner(System.in).nextInt();
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=i;j<=n-1;j++)
	        {
	            System.out.print(" ");
	        }
	        for(int k=0;k<i;k++)
	        {
	            if(i%2!=0)
	            System.out.print(i);
	            else
	            System.out.print("#");
	        }
	        System.out.println();
	    }
	    
	}
}
