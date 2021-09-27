import java.io.*;
import java.util.*;
class Ascen
{
     public static void main(String args[])
     {
         int i,j,n,t;
         int x[]=new int[10];
         Scanner in=new Scanner(System.in);
         System.out.println("n value");
         n=in.nextInt();
         System.out.println("x array");
         for(i=0;i<n;i++)
         {
	x[i]=in.nextInt();
          }
          for(i=0;i<n;i++)
          {
	for(j=i+1;j<n;j++)
	{
	       if(x[i]>x[j])
	       {
	              t=x[i];
	              x[i]=x[j];
	               x[j]=t;
                         }
                 }
          }
          System.out.println("sorted");
          for(i=0;i<n;i++)
         {
          System.out.println(x[i]);
          }
     }
}
