package AssignmentOne;

class Employee implements Cloneable{
    int id, salary;
    String name, deptName;
    Employee(int id, String name, int salary, String deptName){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deptName = deptName;
    }

    Employee(Employee employee){
        this.id         =   employee.id;
        this.name       =   employee.name;
        this.salary     =   employee.salary;
        this.deptName   =   employee.deptName;
    }

    public Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}

public class Second {
    public static void main(String[] args) {
        try{
            Employee e1 = new Employee(1, "deepak", 1000000, "Dev");
            Employee e2 = (Employee) e1.clone();
            Employee e3 = new Employee(e1);
            System.out.println("e1 details : " + e1.id  + "\t" + e1.name);
            System.out.println("e2 details : " + e2.id  + "\t" + e2.name);
            System.out.println("e3 details : " + e3.id  + "\t" + e3.name);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
