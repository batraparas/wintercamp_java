package AssignmentOne;

import java.util.Scanner;
class MyPair{
    String first;
    int second;
    MyPair(String first, int second){
        this.first = first;
        this.second = second;
    }
}
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
}
