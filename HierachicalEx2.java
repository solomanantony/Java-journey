class maths {
    void calculateSquare(double x){
        System.out.println("square value is: "+x*x);
    }
    void calculateRoot(double x){
        System.out.println("square root value: "+Math.sqrt(x));
    }
    void calculateCube(double x){
        System.out.println("cube value is: "+x*x*x);
    }
}
class A extends maths{

} 
class B extends maths{

}
public class HierachicalEx2 {
    public static void main(String[] args) {
        maths obj= new maths();
        A obj1= new A();
        B obj2= new B();
        obj.calculateSquare(5);
        obj1.calculateRoot(9);
        obj2.calculateCube(5);
    }
}
