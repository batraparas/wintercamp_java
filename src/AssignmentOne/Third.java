package AssignmentOne;

public class Third {
    public static void main(String[] args) {
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
}
