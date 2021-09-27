import java.io.*;
import java.util.*;
class Array1
{
    public static void main(String arg[])
    {
       Scanner in=new Scanner(System.in);
       int i;
       int a[]=new int[10];
       int b[]=new int[10];
       int c[]=new int[10];
       System.out.println("Give the A array element:");
       for(i=0;i<5;i++)
       {
            a[i]=in.nextInt();
       }
       System.out.println("Given matrix:");
       for(i=0;i<5;i++)
       {
              System.out.println(a[i]); 
       }
        System.out.println("Give the B array element:");
       for(i=0;i<5;i++)
       {
            b[i]=in.nextInt();
       }
       System.out.println("Given matrix:");
       for(i=0;i<5;i++)
       {
              System.out.println(b[i]); 
        }
        for(i=0;i<5;i++)
    {
       c[i] =a[i]+b[i];
         System.out.println(c[i]);
   }
}
}