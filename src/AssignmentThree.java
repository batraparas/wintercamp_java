import java.util.Scanner;

public class AssignmentThree {
    static Scanner scanner = new Scanner(System.in);

    static void sol1(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int st=0, en=n-1, mid=0;
        while(mid<=en){
            int temp = arr[mid];
            if(arr[mid]==1){
                arr[mid] = arr[en];
                arr[en] = temp;
                en--;
            } else{
                arr[mid] = arr[st];
                arr[st] = temp;
                st++;
                mid++;
            }
        }
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void sol2(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        k = k%n;
        for(int j=0; j<k;j++){
            for (int i = n - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }

    static void sol3(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int max_ele = arr[0], min_ele = arr[0];
        for(int i=0; i<n;i++){
            max_ele = Math.max(max_ele, arr[i]);
            min_ele = Math.min(min_ele, arr[i]);
        }
        System.out.println("Max Element: "+max_ele+"\tMin Element: "+min_ele);
    }

    static void sol4(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int max_ele = arr[0], min_ele = arr[0];
        for(int i=0; i<n;i++){
            max_ele = Math.max(max_ele, arr[i]);
            min_ele = Math.min(min_ele, arr[i]);
        }
        int sec_max=min_ele, sec_min = max_ele;
        for(int i=0; i<n;i++){
            sec_min = arr[i]==min_ele ? sec_min : Math.min(sec_min, arr[i]);
            sec_max = arr[i]==max_ele ? sec_max : Math.max(sec_max, arr[i]);
        }
        System.out.println("2nd Max Element: "+sec_max+"\t2nd Min Element: "+sec_min);
    }

    static void sol5(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int currDist=arr[1]-arr[0];
        for(int i=0; i<n-1; i++){
            for(int j=i+1;j<n;j++){
                currDist = Math.min(currDist, arr[j] - arr[i]);
            }
        }
        System.out.println(currDist);
    }

    static void sol8(){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int max_ele = arr[0], min_ele = arr[0];
        for(int i=0; i<n;i++){
            max_ele = Math.max(max_ele, arr[i]);
            min_ele = Math.min(min_ele, arr[i]);
        }
        int diff = (max_ele-min_ele)/n, x1=0, x2=0;
        for(int i=min_ele;i<=max_ele;i+=diff){
            x1^=i;
        }
        for(int i=0;i<n;i++){
            x2^=arr[i];
        }
        System.out.println("Missing Element is : "+(x1^x2));
    }
    public static void main(String[] args) {
//        sol1();
//        sol2();
//        sol3();
//        sol4();
//        sol5();
//        sol8();
    }
}