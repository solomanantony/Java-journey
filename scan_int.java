import java.util.Scanner;
public class scan_int {
    public static void main(String[]args){
        int a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two variables");
        a=scan.nextInt();
        b=scan.nextInt();
        c=a+b;
        System.out.println(c);
        scan.close();
    }
}
