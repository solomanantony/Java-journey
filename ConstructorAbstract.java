abstract class Student{
    int rollno;
    String name;
    public Student(int rollno,String name){
        this.rollno= rollno;
        this.name=name;
    }
    void studentDetails(){
        System.out.println(""+rollno);
        System.out.println(""+name);
    }
}
class Result extends Student{
    public Result(int rollno,String name){
        super(rollno,name);
    }
}
public class ConstructorAbstract {
    public static void main(String[]args){
        Result obj =new Result(101,"solo");
        obj.studentDetails();
    }
}
