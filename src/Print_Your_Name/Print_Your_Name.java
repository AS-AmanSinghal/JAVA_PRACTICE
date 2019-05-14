package Print_Your_Name;

import java.util.Scanner;

public class Print_Your_Name
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Name ");
        String str=s.nextLine();
        System.out.println("My name is "+str);
    }
}
