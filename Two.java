import java.io.*;
import java.util.*;
class Two
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j;
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int z[][]=new int[3][3];
		System.out.print("x array:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				x[i][j]=in.nextInt();
			}
		}
		System.out.print("y array:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				y[i][j]=in.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println(z[i][j]);
			}
		}
	}
}