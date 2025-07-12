import java.util.Scanner;
public class Main {
    public static void main(String s[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String item=sc.nextLine();
        System.out.println("Enter the location where u found the item");
        String loc=sc.nextLine();
        System.out.println("Enter your contact information");
        String con=sc.nextLine();
        System.out.println("Enter when did u found the item (DD/MM/YYYY)");
        String date=sc.nextLine();

        Founditem f = new Founditem(item,loc,con,date);

        System.out.println("Name of the item: " + item);
        System.out.println("Location : " + loc);
        System.out.println("Contact information: " + con);
        System.out.println("Date: " + date);
    
    }
}
