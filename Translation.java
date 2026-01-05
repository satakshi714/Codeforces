import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()){
            System.out.println("NO");
            return;
        }

        boolean isRev = true;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(s2.length() - 1 - i)){
                isRev = false;
                break;
            }
        }

        System.out.println(isRev ? "YES" : "NO");
        sc.close();
    }
}
