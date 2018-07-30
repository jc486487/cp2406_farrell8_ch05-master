import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = input.nextInt();

        if (value%2 ==0)
            System.out.println("The integer entered is even.");
        else
            System.out.println("The integer entered is odd.");
    }
}
