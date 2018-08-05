import java.util.Scanner;

public class CellPhoneService
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum monthly minutes talktime: ");
        int minutes = sc.nextInt();

        System.out.println("Enter the maximum monthly text messages sent: ");
        int text = sc.nextInt();

        System.out.println("Enter the maximum monthly data used in Gigabytes: ");
        int data = sc.nextInt();

        if (minutes<500 && text == 0 && data == 0)
        {
            System.out.println("Based on your inputs, Plan A at $49/month is best for you. \nTalktime = 500 minutes; " +
                    "no data/text messages");
        }

        else if (minutes<500 && text >0 && data ==0)
        {
            System.out.println("Based on your inputs, Plan B at $55/month is best for you. \nTalktime = 500 minutes; " +
                    "no data");
        }

        else if (minutes>500 && text>=100 && data ==0)
        {
            System.out.println("Based on your inputs, Plan C at $61/month with 100 text messages \n or \nPlan D " +
                    "at $70/month with more than 100 text messages \nis best for you.");
        }

        else if (data>0)
        {
            System.out.println("Based on your inputs, Plan E at $79/month with 2GB data \n or \nPlan F " +
                    "at $87/month with more than 2GB data \nis best for you.");
        }
    }
}
