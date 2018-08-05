import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture
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

        LocalDate today = LocalDate.now();

        int currentYear = today.getYear();
        int currentMonth = today.getMonthValue();

        if(currentYear!=year)
        {
            System.out.println("It's not the current year");
        }

        else if ((month<currentMonth) && (month>=1))
        {
            System.out.println("It's an earlier month this year");
        }

        else if ((month>currentMonth) && (month<=12))
        {
            System.out.println("It's an later month this year");
        }

        else if (month==currentMonth)
        {
            System.out.println("It's this month");
        }
    }
}
