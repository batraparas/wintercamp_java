package AssignmentOne;

import java.util.Scanner;
import java.util.TreeSet;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
}
