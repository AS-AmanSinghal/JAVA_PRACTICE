package If_Else_If_Ladder;

import java.util.Scanner;

public class If_Else_If_Ladder_Example
{
    public static void main(String[] args)
    {
        System.out.println("Enter a For find Largest among three ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a+" is largest");
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is largest");
            }
            else
            {
                System.out.println(c+" is largest");
            }
        }
    }
}
