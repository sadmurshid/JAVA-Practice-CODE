/*
   Programmer : Sa'd Murshid Khan Adon
   Id         : 14301101
   Sec        : 8
   Version    : 1.0.0
                                                              */
import java.util.Scanner;
class ass11task10
{
  public static void main (String args [])
  {
    Scanner er =new Scanner(System.in);
    task10 a=new task10();
    System.out.println("Plese enter the numarical value of month.");
    int m=er.nextInt();
    
    System.out.println("Plese enter the date.");
    int d=er.nextInt();
    
    System.out.println(a.season(m,d));
  }
}