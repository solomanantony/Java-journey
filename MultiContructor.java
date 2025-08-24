class Test{
    String name;
    Test(){
        System.out.println("welcome to lead");
    }
    Test(String Name){
        name=Name;
        System.out.println(name);
    }
int a,b,c;
Test(int x,int y){
    a=x;
    b=y;
    c=a+b;
    System.out.println(c);
}
int p,q,r;
Test(int x,int y, int z){
    p=x;
    q=y;
    r=z;
    System.out.println(p+":"+q+":"+r);
}
}
public class MultiContructor{
    public static void main(String[]args){
        Test t =new Test();
        Test t1= new Test("lead");
        Test t2= new Test(23,67);
        Test t3= new Test(10,20,30);
    }
}
