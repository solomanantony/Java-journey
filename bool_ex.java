import java.util.Scanner;
public class bool_ex {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("enter two boolean values");
        boolean a=scan.nextBoolean();
        boolean b=scan.nextBoolean();
        System.out.println("boolean values are:"+a+":\t"+b);
        scan.close();

    }    
}
