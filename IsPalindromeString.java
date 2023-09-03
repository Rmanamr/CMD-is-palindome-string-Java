/*Enter a string to see whether it's palindrome or not*/

import java.util.Scanner; 

public class IsPalindromeString {  
   public static void main(String args[]){  
      while(true){
         System.out.println("Please enter a string to check if it's palindrome :"); 
         Scanner input = new Scanner(System.in); 
         String original;   
         original = input.nextLine();     
         if (isPalindromeStringChecker(original)){
            System.out.println(original + " is palindrome.");  
         }
         else{ 
            System.out.println(original + " is not palindrome."); 
         } 
         System.out.println("******************************************************");
         }
      }  

   public static boolean isPalindromeStringChecker(String original){
            String reverse = "";
            int length = original.length(); 
            for (int i = length - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
            }  
            if (original.equals(reverse))
               return true;
            else{
               return false;
            }
   }
}  


//by Arman Azarnik