//code resusability
class parent{
    int add()
    {
        int a=49;
        int b=67;
        int c=a+b;
        System.out.println(c);
        return c;
    }
}
class child extends parent{
    void addition(){
        child obj=new child();
        obj.add();
    }
}
public class inherit {
    public static void main(String[]args){                               
        child obj2=new child();
        obj2.addition();
}}




