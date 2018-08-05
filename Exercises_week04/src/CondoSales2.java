import java.util.Scanner;

public class CondoSales2
{
    public static Scanner sc = new Scanner(System.in);

    public static int parkingLot()
    {
        System.out.println("Enter the type of parking lot you wish to have \n\t1- Garage \n\t2- Parking Space");
        int choice = sc.nextInt();
        int add_price;

        if (choice == 1 || choice == 2)
        {
            add_price = 5000;
        }
        else
        {
            System.out.println("Since an invalid option is entered, it is assumed that you do not want a parking lot");
            add_price = 0;
        }
        return add_price;
    }

    //main method
    public static void main(String args[])
    {
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
                int add_price = parkingLot();
                price = PARK + add_price;
                System.out.println("Name of chosen view: Park View");
                break;
            }

            case 2:
            {
                int add_price = parkingLot();
                price = GOLFCOURSE + add_price;
                System.out.println("Name of chosen view: Golf Course View");
                break;
            }

            case 3:
            {
                int add_price = parkingLot();
                price = LAKE + add_price;
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
