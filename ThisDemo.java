class Apple{
    int a,b;
    public Apple(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+","+b);
    }
}
public class ThisDemo {
    public static void main(String[]args){
        Apple obj=new Apple(10,45);
    }
}
