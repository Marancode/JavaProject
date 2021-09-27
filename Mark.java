import java.io.*;
import java.util.*;
class Mark
{
	public static void main(String args[])throws IOException
	{
	     Scanner in=new Scanner(System.in);
	     DataInputStream input=new DataInputStream(System.in);
	     int i,n;
	     int t[]=new int[5];
	     int e[]=new int[5];
	     int m[]=new int[5];
	     int s[]=new int[5];
	     int ss[]=new int[5];
	     int regno[]=new int[10];
	     int tot[]=new int[5];
	     float avg[]=new float[5];
	     String name[]=new String[30];
	     System.out.print("How many students:");
	     n=in.nextInt();
	     System.out.println("Tamilnadu Higher Secondry School");
	     System.out.println("------------------------------------");
	     for(i=0;i<n;i++)
	     {
	           System.out.print("Regno          :");
                              regno[i]=in.nextInt();
   	           System.out.print("Name:");
	           name[i]=in.readLine();
	           System.out.print("Tamil            :");
	           t[i]=in.nextInt();
	           System.out.print("English         :");
	           e[i]=in.nextInt();
	           System.out.print("Maths           :");
	           m[i]=in.nextInt();
	           System.out.print("Science          :");
	           s[i]=in.nextInt();
	          System.out.print("Social Science:");
	           ss[i]=in.nextInt();
	           tot[i]=t[i]+e[i]+m[i]+s[i]+ss[i];
	           avg[i]=tot[i]/5;
	           System.out.println(tot[i]);
	            
	           System.out.println(avg[i]);
	          }
	               
	  }
        }
	               

		