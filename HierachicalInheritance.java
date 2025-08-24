import java.util.Scanner;
class A{
      void addition(Scanner scan){
    System.out.println("enter two numbers");
    int a,b,c;
    a=scan.nextInt();
    b=scan.nextInt();
    c=a+b;
    System.out.println(c);
}

}
class B extends A{
    void subtract(Scanner scan){
    System.out.println("enter two numbers");
    int a,b,c;
    a=scan.nextInt();
    b=scan.nextInt();
    c=a-b;
    System.out.println(c);
}
}
class C extends A{
    void multiplication(Scanner scan){
    System.out.println("enter two numbers");
    int a,b,c;
    a=scan.nextInt();
    b=scan.nextInt();
    c=a*b;
    System.out.println(c);
}

}
public class HierachicalInheritance {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        C obj= new C();
        B obj1= new B();
        obj1.addition(scan);
        obj1.subtract(scan);
        obj.addition(scan);
        obj.multiplication(scan);
        scan.close();
    }
}
