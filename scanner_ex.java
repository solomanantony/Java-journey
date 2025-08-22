import java.util.Scanner;
public class scanner_ex {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two numbers");
        byte a,b,c;
        a=scan.nextByte();
        b=scan.nextByte();
        c=(byte)(a+b);
        System.out.println(c);
        scan.close();
    }
}
