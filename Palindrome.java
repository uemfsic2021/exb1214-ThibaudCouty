public class Palindrome {
  public static boolean is_palindrome(String s) {
    // add your code here
  int k=0;
    for (int i = 0; i <= ((s.length()) / 2); i++) {
      
      if (s.charAt(i) == s.charAt((s.length()) - i-1)) {
        k++;
      }}

   if (k == (s.length() / 2)+1) {
     System.out.println("C'est un palindrôme :)");
    return true;
    } 
    else {
        System.out.println("Ce n'est pas un palindrôme :(");
        return false;
      }
      
    }}
  
