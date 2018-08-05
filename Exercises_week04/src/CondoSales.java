import java.util.Scanner;

public class CondoSales
{

    //main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n\t1- Park view \n\t2- Golf course view \n\t3- Lake view");
        int usersChoice = sc.nextInt();

        int PARK= 150000;
        int GOLFCOURSE = 170000;
        int LAKE = 210000;
        int price;

        switch (usersChoice)
        {
            case 1:
            {
                price = PARK;
                System.out.println("Name of chosen view: Park View");
                break;
            }

            case 2:
            {
                price = GOLFCOURSE;
                System.out.println("Name of chosen view: Golf Course View");
                break;
            }

            case 3:
            {
                price = LAKE;
                System.out.println("Name of chosen view: Lake View");
                break;
            }

            default:
            {
                price = 0;
            }
        }

        System.out.println("Price of condo: $" + price);
    }
}
