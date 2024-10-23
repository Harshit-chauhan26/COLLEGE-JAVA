import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.*;
import java.text.*;
public class BillProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select language: 1 for English, 2 for French");
        int choice = scanner.nextInt();
        
        Locale locale;
        if (choice == 2) {
            locale = new Locale("fr", "FR");
        }
        else {
            System.out.println("Invalid choice, by default using Eng");
            locale = new Locale("en", "US");
        }
        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundle", locale);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        Locale l=Locale.of("hi", "IN");
        System.out.println("enter the item purchase");
        String item=sc.nextLine();
        System.out.println("enter the amout of the "+item);
        double price=sc.nextDouble();
        System.out.println("enter the amount you pay");
        double amount=sc.nextDouble();
        System.out.println("enter the tax percentage on"+ item);
        int tax=sc.nextInt();
        double taxamount= (tax*amount/100);
       NumberFormat nf = NumberFormat.getCurrencyInstance(l);
       System.out.print(name+"     ");
       System.out.print(item+"     ");
       System.out.print(nf.format(price)+"     ");
       System.out.print(tax+"%     ");
       System.out.print(nf.format(taxamount)+"     ");
       System.out.print(nf.format(amount)+"     ");
       
       
           }
           
       }