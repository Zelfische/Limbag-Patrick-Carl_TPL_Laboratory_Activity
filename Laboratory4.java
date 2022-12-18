import java.util.Scanner;
import java.util.StringTokenizer;

public class Laboratory4 {

    private static final String Integer = "int";
    private static final String Double = "double";
    private static final String Char = "char";
    private static final String string = "str";
    private static final String Ass_operator = "=";
    private static final String Delimeter = ";";
    private static StringBuilder builder;
    private static final int Value_pos = 3;

    public static void main(String args[]){
        builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Source Language");
        String inputString = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        int index = 0;

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken(" ");
            identify_token(token,inputString.contains(Ass_operator),index++);
        }
        String syntax = builder.toString();
        System.out.println(syntax);
    }

    private static void identify_token(String token, boolean hasAss_Operator, int index){

        if(token.equals(Integer)|| token.equals(Double)|| token.equals(Char)|| token.equals(string)){
            builder.append("<data_type>");
        }else if(token.equals(Ass_operator)){
            builder.append("<ass_operator>");
        }else if(token.contains(Delimeter)&&!hasAss_Operator){
            if(token.startsWith(Delimeter)){
                builder.append("<delimeter><value>");
            }else{
                builder.append("<value><delimiter>");
            }
        }else if(!token.contains(Delimeter)&& hasAss_Operator && index == Value_pos){
            builder.append("<value>");
        }else{
            builder.append("<identifier>");
        }
    }
}
