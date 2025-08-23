class over{
   void add(){ 
    int a=33;
    int c=a+10;
    System.out.println(c);
   }
   void add(int a,int b ){
    int c=a+b;
    System.out.println(c);
   }
} public class overloadingg {
public static void main(String[]args){
    over obj1=new over();
    obj1.add();
    obj1.add(7,8);
}
}
