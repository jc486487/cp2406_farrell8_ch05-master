import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int month = sc.nextInt();

        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        LocalDate date = LocalDate.now();
        LocalDate entered = LocalDate.of(year, month, day);

        if (entered.isBefore(date))
        {
            System.out.println("It's in the past");
        }

        else if (entered.isAfter(date))
        {
            System.out.println("It's in the future");
        }
        else if (entered.equals(date))
        {
            System.out.println("It's in the current date");
        }
    }
}
