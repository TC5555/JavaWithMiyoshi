public class IsReverse {
   public static boolean isRev(String word1, String word2){

      int length = word1.length();
      if(length <= 1 && word1.equalsIgnoreCase(word2)){
         return true;
      }

      if(length != word2.length()){
         return false;
      }

         return Character.toUpperCase(word1.charAt(0)) == Character.toUpperCase(word2.charAt(length-1)) && isRev(word1.substring(1, length), word2.substring(0, length-1));
      }
   public static void main(String[] args){
      String word1 = "OLLEh";
      String word2 = "Hello";
      System.out.print(isRev(word1, word2));
   }
}
