import java.util.Scanner;

public class Laboratory3 {
    public static void main(String[] args){

        System.out.println("Enter Source Language: ");
        Scanner sc = new Scanner(System.in);
        String in_string = "";
        String out_string = "";
        in_string = sc.nextLine();

        String[] tokens = in_string.split("(?<!(\\\"|').{0,255}) | (?!.*\\\\1.*)"); //confusion
        for (String token : tokens){
            if (token.equals("int") || token.equals("char") || token.equals("double") || token.equals("String")){
                out_string += "<data_type> ";
            } else if (token.equals("=")) {
                out_string += "<assignment_operator> ";
            } else if (token.contains(";")) {
                out_string += "<delimiter> ";
            } else if (token.contains("\"")){
                out_string += "<value> ";
            } else if (token.matches("[0-9];+")|| token.matches("[1-9][0-9]")){
                out_string += "<value> ";
            }else{ out_string += "<identifier> ";
            }
        }
        System.out.println("Output is: " + out_string);
    }
}
