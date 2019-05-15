package Switch_Case;

import java.util.Scanner;

public class Switch_Case_Example
{
    public static void main(String[] args)
    {
        System.out.println("Enter for Case ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("You select case "+a);
                break;
            case 2:
                System.out.println("You select case "+a);
                break;
            default:
                System.out.println("I am a default function");
        }
    }
}
