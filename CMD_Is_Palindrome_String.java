import java.util.Scanner; 

/**Java CMD program for checking whether the entered string is palindrome or not.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Is_Palindrome_String{  
   
   /** main class for interacting with the user */
   public static void main(String args[]){  

      /** while loop to keep the program running */
      while(true){
         System.out.println("Please enter a string to check if it's palindrome :"); 
         Scanner input = new Scanner(System.in); 

         /** reading the next line and storing it in original String variable */
         String original = input.nextLine();     
         if (is_Palindrome_String_Checker(original)){
            System.out.println(original + " is palindrome.");  
         }
         else{ 
            System.out.println(original + " is not palindrome."); 
         } 
         System.out.println("******************************************************");
         }
      }  

   /** 
     * method for checking wheather the input string is palindrome or not.
     * @param original  the input string
     * @return  boolean 
     * <pre>
     *      is_Palindrome_String_Checker("WooW"); // Output: true
     *      is_Palindrome_String_Checker("Woow"); // Output: false
     * </pre>
   */
   public static boolean is_Palindrome_String_Checker(String original){
      String reverse = "";
      int length = original.length(); 
      for (int i = length - 1; i>=0; i--){
      reverse = reverse + original.charAt(i);
      }  
      if (original.equals(reverse)){
         return true;
      }
      else{
         return false;
      }
   }
}  