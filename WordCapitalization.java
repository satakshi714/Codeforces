import java.util.*;
public class WordCapitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = Character.toUpperCase(s.charAt(0));
        System.out.println(ch + s.substring(1));
    }
}
