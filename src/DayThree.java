import java.util.*;

class Student{
    String fname, lname;
    public Student(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.lname.compareTo(s2.lname);
    }
}



public class DayThree {

    static Scanner scanner = new Scanner(System.in);
    static void generatePowerSet(String s){
        int n = s.length();
        int powSize = (int)Math.pow(2, n);
        for(int counter = 0; counter<powSize;counter++){
            for(int j=0; j<n;j++){
                if((counter & (1<<j))!=0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
    static void replaceCharacters(){
        String s = scanner.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }
            else{
                hmap.put(ch, 1);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        String temp = "";
        for(int i=0; i<s.length(); i++){
             temp += String.valueOf(hmap.get(s.charAt(i)));
        }
        s = temp;
        System.out.println(s);
    }
    static void longestSubsequence(){
        String s = "abcdeabc";
        int left=0, right=0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(right<s.length()){
            if(hashMap.containsKey(s.charAt(right))){
                arrayList.add(right-left);
                left = right;
                hashMap.clear();
            }
            else{
                hashMap.put(s.charAt(right), 1);
            }
            right++;
        }
        System.out.println(Collections.max(arrayList));
    }
    public static void main(String[] args) {
//        System.out.println("jedii".compareTo("arara"));
//        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("deepak", "khattar"));
//        studentList.add(new Student("deepak", "arora"));
//        studentList.add(new Student("paras", "batra"));
//
//        for(Student stud : studentList){
//            System.out.println(stud.fname+"\t"+stud.lname);
//        }
//        System.out.println("*******************************************");
//
//        Collections.sort(studentList, new sortByName());
//
//        for(Student stud : studentList){
//            System.out.println(stud.fname+"\t"+stud.lname);
//        }
//        replaceCharacters();
//        generatePowerSet("123");
//        System.out.println("absdasdb       ".trim() + "***********asdads");
        longestSubsequence();
    }

}
