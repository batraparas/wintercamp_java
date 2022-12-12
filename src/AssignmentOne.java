import java.util.TreeSet;

class Employee implements Cloneable{
    int id;
    String name;

}

public class AssignmentOne {
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
    public static void main(String[] args) {
        sortString("bcad");
    }
}
