import java.util.Scanner; //or use *
public class scan_short {
    public static void main(String[]args){
        short a,b,c;
        Scanner scan=new Scanner(System.in); 
        //Scanner ---> contructer(parameter) System.in---->connection between program and keyboard
        System.out.println("enter two numbers");
        a=scan.nextShort();//predefined method. used to read the input
        b=scan.nextShort();
        c=(short)(a+b);
        System.out.println(c);
        scan.close();
    }
}
