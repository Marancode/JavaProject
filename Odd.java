import java.io.*;
import java.util.*;
class Odd 
{
	public static void main(String args[])
	{
	      Scanner in=new Scanner(System.in);
	      int i,odd=0,even=0;
	      int x[]=new int[10];
	      System.out.println("x array");
	      for(i=1;i<=5;i++)
	      {
	             x[i]=in.nextInt();
	       }
	       for(i=1;i<=5;i++)
	       {
	              if(x[i]%2==0)
	              {
	                      //System.out.println(odd);
	                      odd=odd+1;
	              }
	              else
	              {
	                    // System.out.println(even);
		   even=even+1;
	              }
 	     }
	     System.out.println(odd);
	     System.out.println(even);
            }	
}