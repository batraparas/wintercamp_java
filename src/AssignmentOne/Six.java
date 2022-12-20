package AssignmentOne;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int st = scanner.nextInt(), en = scanner.nextInt();
        if(st>0 && st<s.length()-1 && en > st && en < s.length()-1){
            System.out.println(s.substring(st, en));
        }
    }
}
