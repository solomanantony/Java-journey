class Student {
    String rollNo;
    String name;

    Student() {
        rollNo = "25MCA101";
        name = "Solo";
    }


    void studentDetails() {
        System.out.println("Student rollno is:" + rollNo + ":" + "student name is:" + name);
    }
}    
class DefaultContructorEx{
public static void main(String[]args){
    Student s=new Student();//1.object created 2.memory allocated 
    s.studentDetails();
}
}