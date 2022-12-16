import java.util.Scanner;

public class Laboratory1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String string = sc.nextLine();

        int a = 0;
        int b = string.length()- 1;

        while(a < b) {
            while (string.charAt(a) == ' ') {
                a++;
            }
            while (string.charAt(b) == ' ') {
                b--;
            }
            if(string.charAt(a) == string.charAt(b)){
                a++;
                b--;
            }
            else{
                break;
            }
        }
        if(a>=b){
            System.out.println(string.equalsIgnoreCase(string) + " is a palindrome");
        }
        else{
            System.out.println(string.equalsIgnoreCase(string) + " is not a palindrome");
        }
    }
}
