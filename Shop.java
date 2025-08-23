import java.util.Scanner;
 public class Shop {
    public static void main(String[]args){
        String item;
        double price;
        int quantity;
        double total;
        System.out.println("FOOD COURT\n******************\n MENU\n-------------------\npizza\nburger\ncola");
        System.out.print("select one: ");
        Scanner scan=new Scanner(System.in);
        item=scan.nextLine();
        System.out.print("enter quantity: ");
        quantity=scan.nextInt();
        System.out.print("enter the price of one: ");
        price=scan.nextDouble();
        total= price * quantity;
        System.out.println("Total amount of "+quantity+" "+item+" is "+total);
        scan.close();

    }
    
}
