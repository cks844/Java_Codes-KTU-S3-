import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,num,rem,rev=0;
        System.out.println("Enter a number:"); 
         n=s.nextInt();
         num=n;
        while(n!=0){
             rem=n%10;
             rev=rev*10+rem;
             n/=10;
        }
        if(rev==num)
         System.out.println("The entered number is a palindrome number"); 
        else
         System.out.println("The entered number is not a palindrome number"); 
        
    }
}
