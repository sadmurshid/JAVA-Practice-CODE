import java.util.Scanner;
public class ass1task1
{
  public static void main(String args[])
  {
    Scanner er=new Scanner(System.in);
    System.out.println("Plese enter the redius of Sphere.");
    double r= er.nextDouble();
    task1 t=new task1();
    t.sphereVolume(r);
  }
}