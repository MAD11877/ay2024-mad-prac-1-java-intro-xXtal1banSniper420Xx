import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    //System.out.print("Please enter your height in meters: ");
    double height = in.nextDouble();

    //System.out.print("Please enter your weight in kilograms: ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.printf("%.1f\n", bmi);

    in.close();
  }
}
