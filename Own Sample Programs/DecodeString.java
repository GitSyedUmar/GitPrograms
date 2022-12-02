import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s = "2[a]3[bc]uh";
	    String str = "", sb = "";
	    int v=0;
	    int l1 = s.length();
	    
	    for (int i=0;i<l1 ;i++) 
	    {
	        char chi = s.charAt(i);
	        
	        if(Character.isDigit(chi))
	        {
	            v = Character.getNumericValue(chi);
	        }
	        if(chi == '[')
	        {
	            for(int j=i+1;j<l1;j++)
	            {
	                char chj = s.charAt(j);
	                
	                if(chj == ']')
	                {
	                    str = "";
	                    str = str + s.substring(i+1,j);
	                    break;
	                }
	            }
	            for(int j=0;j<v;j++)
	            {
	                sb = sb + str;
	            }
	        }
	    }
	    for(int k=l1-1;k>=0;k--)
	    {
	        char chj = s.charAt(k);
	        
	        if(chj == ']')
	                {
	                    sb = sb + s.substring(k+1,l1);
	                    break;
	                }
	    }
		System.out.println(sb);
	}
}