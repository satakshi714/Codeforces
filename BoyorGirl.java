import java.util.*;
public class BoyorGirl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Set<Character> unique = new HashSet<>();
        for(char c : name.toCharArray()){
            unique.add(c);
        }
        if(unique.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
