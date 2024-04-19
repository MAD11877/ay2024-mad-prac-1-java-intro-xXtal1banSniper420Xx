import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    //System.out.print("Please enter an integer: ");

    Scanner in = new Scanner(System.in);

    int number = in.nextInt();

    int result = number * number;

    //System.out.println("The result of multiplying the number by itself is: " + result);

    in.close();
  }
}
