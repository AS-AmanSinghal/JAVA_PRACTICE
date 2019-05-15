package If_Else;

import java.util.Scanner;

public class If_Else_Example
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number for even and odd ");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        if(number%2==0)
        {
            System.out.println(number+" is even");
        }
        else
        {
            System.out.println(number+" is odd");
        }
    }
}
