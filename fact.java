import java.io.*;
import java.util.*;
class fact
{ 
   public static void main(String args[])
{
  int i=1,n,z=1;
  Scanner fa=new Scanner(System.in);
   System.out.println("give a n value");
   n=fa.nextInt();
 while(i<=n)
{
 z=z*i;
 
 
 i++;
}
System.out.println("fact"+z);
}
}
