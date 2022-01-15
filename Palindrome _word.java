import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String word,rev="";
        int len,j;
        System.out.println("Enter the word:");
        word=s.next();
        len=word.length();
        for(j=len-1;j>=0;j--)
         rev=rev+word.charAt(i);
        if(word.equals(rev))
         System.out.println("The entered string is a palindrome word");
        else
         System.out.println("The entered string is not a palindrome word");
    }
}
