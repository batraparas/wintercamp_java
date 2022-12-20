import java.util.*;

public class DayTwo {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Character, Integer> freqMap = new HashMap<>();

    static void printMapValues(Object arr[], int st){
        if(st==arr.length){
            return;
        }
        System.out.println(arr[st] + "-------->" + freqMap.get(arr[st]));
        printMapValues(arr, st+1);
    }
    static void getFreq(String s, int st){
        if(st==s.length()){
            return;
        }
        if(freqMap.containsKey(s.charAt(st))){
            freqMap.put(s.charAt(st), freqMap.get(s.charAt(0))+1);
        }
        else {
            freqMap.put(s.charAt(st), 1);
        }
        getFreq(s, st+1);
    }

    //reverse string remove ind 4 to 9 using string buffer

    static void reverseString(String s){
        StringBuffer sbb = new StringBuffer(s);
        sbb.reverse();
        String temp = sbb.toString();
        temp = temp.substring(0, 4) + temp.substring(9);
        System.out.println(temp);
    }

    static void replaceSubstring(String s, int st, int en){
        s = s.substring(0, st) + "temp" + s.substring(en);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String key = scanner.nextLine();

//        getFreq(key, 0);
//        Object[] arr = freqMap.keySet().toArray();
//        printMapValues(arr, 0);
//        reverseString(key);
        replaceSubstring(key, 3, 6);
    }

}
