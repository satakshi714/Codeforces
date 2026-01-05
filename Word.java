import java.util.Scanner;
public class Word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count1 = 0,  count2 = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                count1++;
            }else{
                count2++;
            }
        }
        if(count1 > count2){
            System.out.println(input.toUpperCase());
        }else{
            System.out.println(input.toLowerCase());
        }
        sc.close();
    }
}