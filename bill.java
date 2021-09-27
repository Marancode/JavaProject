import java.io.*;
import java.util.*;
class bill
{
   public static void main(String args[])
{
    int lmr,cmr,units,billl;
     int conno;
    String name;
    float price;
   Scanner pb=new Scanner(System.in);
    System.out.println("conno:");
   conno=pb.nextInt();
   System.out.println("ame");
   name=pb.nextLine();
    System.out.println("lmr");
    lmr=pb.nextInt();
    System.out.println("cmr");
    cmr=pb.nextInt();
    units=lmr-cmr;
    System.out.println("units");
    System.out.println("price");
    price=pb.nextFloat();
    billl=units*price;
    System.out.println("amount:"+billl);
}
}
