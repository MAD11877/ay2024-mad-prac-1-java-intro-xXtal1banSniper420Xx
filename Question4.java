import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //System.out.print("Enter the base size of the triangle: ");

        Scanner in = new Scanner(System.in);

        int baseSize = in.nextInt();

        for (int i = baseSize; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}

