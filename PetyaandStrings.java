import java.util.*;
public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        int res = s1.compareTo(s2);
        if(res < 0){
            System.out.println(-1);
        }else if(res > 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
