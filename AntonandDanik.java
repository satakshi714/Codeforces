import java.util.Scanner;
public class AntonandDanik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c1 = 0, c2 = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'A'){
                c1++;
            }else{
                c2++;
            }
        }
        if(c1>c2){
            System.out.println("Anton");
        }else if(c2>c1){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}
