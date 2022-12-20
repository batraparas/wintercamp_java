import java.util.Scanner;
import java.util.TreeSet;

class Parent extends Grandparent {
        {
        System.out.println("instance - parent");
        }
public Parent() {
        System.out.println("constructor - parent");
        }
static {
        System.out.println("static - parent");
        }
        }
class Grandparent {
    static {
        System.out.println("static - grandparent");
    }
    {
        System.out.println("instance - grandparent");
    }
    public Grandparent() {
        System.out.println("constructor - grandparent");}
    }
class Child extends Parent {
        public Child() {
            System.out.println("constructor - child");
        }
        static {
            System.out.println("static - child");
        }
        {
            System.out.println("instance - child");
        }
    }
//solution-2
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

class MyPair{
    String first;
    int second;
    MyPair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
public class AssignmentOne {

    static Scanner scanner = new Scanner(System.in);

    //solution-1
    static void sortString(String s){
        TreeSet<Character> treeSet = new TreeSet<>();
        for(int i=0; i<s.length(); i++){
            treeSet.add(s.charAt(i));
        }
        StringBuilder temp = new StringBuilder();
        for(Character ch : treeSet){
            temp.append(ch);
        }
        System.out.println(temp);
    }

    static void solutionThree(){
        int s = 0, t=1, i=0;

        while(i<10)
        {
            s = s + i;
            int j=i;
            while(j>0){
                t *=(j - i);
            j--;
            }
            s *=t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }



    static void solutionFive(){
        int n = scanner.nextInt();
        MyPair[] arr = new MyPair[n];
        for(int i=0; i<n;i++){
            String key = scanner.next();
            int val =scanner.nextInt();
            arr[i] = new MyPair(key, val);
        }
        for(MyPair pair : arr){
            System.out.printf("%-15s", pair.first);
            System.out.printf("", pair.second);
        }
    }

    //solution-6
    static void getSubString(){
        String s = scanner.nextLine();
        int st = scanner.nextInt(), en = scanner.nextInt();
        if(st>0 && st<s.length()-1 && en > st && en < s.length()-1){
            System.out.println(s.substring(st, en));
        }
    }

    public static void main(String[] args) {
        //sorting a string
        /*sortString("bcad");
        //cloning object
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
        solutionThree();

        //solution-6
        getSubString();*/
//        solutionFive();

//        Child c1 = new Child();


    }
}
