import java.util.Scanner;

public class AscendingAndDescending
{
    //ascending order
    public static int [] sortAcc(int list[])
    {
        int i, j, temp, small, pos;

        for(i = 0; i<list.length; i++)
        {
            small = list[i];
            pos = i;

            for (j = i + 1; j < (list.length - 1); j++) {
                if (list[j] < small) {
                    small = list[j];
                    pos = j;
                }
            }
            temp = list[i];
            list[i] = list[pos];
            list[pos] = temp;
        }

        return list;
    }

    //Descending order
    public static int [] sortDes(int list[])
    {
        int i, j, temp, large, pos;

        for(i = 0; i<list.length; i++)
        {
            large = list[i];
            pos = i;

            for (j = i + 1; j < (list.length - 1); j++) {
                if (list[j] > large) {
                    large = list[j];
                    pos = j;
                }
            }
            temp = list[i];
            list[i] = list[pos];
            list[pos] = temp;
        }

        return list;
    }

    //main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] list = new int[3];
        for (int i = 0; i<list.length; i++)
        {
            System.out.println("Enter an integer: ");
            list[i] = input.nextInt();
        }

        int [] list_acc = sortAcc(list);

        System.out.println("Array in ascending order");
        for(int a= 0; a<list_acc.length; a++)
        {
            System.out.print(list_acc[a] + "\t");
        }

        int [] list_des = sortDes(list);

        System.out.println("\nArray in descending order");
        for(int a= 0; a<list_des.length; a++)
        {
            System.out.print(list_des[a] + "\t");
        }
    }
}
