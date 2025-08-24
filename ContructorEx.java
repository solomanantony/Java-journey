class Employee{
    int empid;
    String empname;
    int empage;
        Employee(int id,String name,int age){
            empid=id;
            empname=name;
            empage=age;
        }

        void empDetails(){
            System.out.println("Employee id: "+empid);
            System.out.println("Employee Name: "+empname);
            System.out.println("Employee age: "+empage);
        }
    } 

    public class ContructorEx {
        public static void main(String[] args) {
            Employee obj=new Employee(101,"solo",222);
            obj.empDetails();
        }

    
}
