public class DynamicBinding {
    public static void main(String[] args) {
        DynamicBinding obj=new DynamicBinding();
    // |creating a object|keyword|contructor|
        obj.welcome();
        int a,b,c;
        a=23;
        b=21;
        c=a-b;
        System.out.println("subtraction is:\t"+c);
    }
    void welcome()
    {
        System.out.println("welcome to java programming");
        int a,b,c;
        a=33;
        b=44;
        c=a*b;
        System.out.println(c);
    }
}
