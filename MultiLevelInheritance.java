import java.util.Scanner;

class A {
    void addition(Scanner scan) {
        System.out.println("enter two number");
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = a + b;
        System.out.println("a+b=" + c);

    }
}

class B extends A {
    void subtraction(Scanner scan) {
        System.out.println("enter two number");
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = a - b;
        System.out.println("a-b=" + c);
    }
}

class C extends B {
    void multiplication(Scanner scan) {
        System.out.println("enter two number");
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = a * b;
        System.out.println("a*b=" + c);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);/* If each method (addition, subtraction, multiplication) creates its own
                                               Scanner and closes it after use there is a problem! System.in is a shared input
                                               stream. Once it's closed, any further attempt to read from it throws an
                                               exception.*/
        C obj = new C();
        obj.addition(scan);
        obj.subtraction(scan);
        obj.multiplication(scan);
        scan.close();
    }
}
