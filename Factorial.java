import java.util.*;
import java.io.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		int f;
		System.out.print("Give the n value");
		n=in.nextInt();
		f=fact(n);
		System.out.print("fact:"+f);
	}
static int fact(int n)
{
	int i;
	int f=1;
for(i=1;i<=n;i++)
{
	f=f*i;
}
	return(f);
}
}