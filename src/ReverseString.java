import java.util.Locale;

public class ReverseString {
    public static void main(String[] args){
        String original="Madam";
        String cleaned=original.toLowerCase().replaceAll("","");
        String reversed="";
        for (int i = cleaned.length()-1; i>=0 ; i--) {
            reversed+=cleaned.charAt(i);
        }

        if(cleaned.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        String reverse=new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
        System.out.println(reverse);
    }
}
