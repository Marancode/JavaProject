import java.io.*;
import java.util.*;
class Merge
{ 
        public static void main(String args[])
{
     Scanner in=new Scanner(System.in);
      int x[]=new int[10];
      int y[]=new int[10];
      int z[]=new int[10];
      int i,j,k=0,n;
      System.out.println("x array");
       System.out.println("y arrray");
      for(i=0;i<5;i++)
      {
            x[i]=in.nextInt();
       
       
         y[i]=in.nextInt();
        }
      
        
        System.out.println("Combine array");
        for(i=0;i<5;i++)
        {
              z[i]=x[i];
         }
         for(j=i;j<10;j++)
         {
              z[j]=y[k];
              k++;
          }
          for(i=0;i<10;i++)
          {
                  System.out.println(z[i]);
          }
     }
}
 