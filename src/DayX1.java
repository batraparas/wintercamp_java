import java.util.Scanner;

class myTestOne{
    static Scanner scanner  = new Scanner(System.in);
    static  void doSomeThing(){
        int a, b;
        try{
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a/b);
            System.out.println(a*b);
            System.out.println(a%b);
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
public class DayX1 {
    public static void main(String[] args) {
        myTestOne.doSomeThing();
    }
}
