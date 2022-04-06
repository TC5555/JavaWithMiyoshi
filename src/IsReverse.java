public class IsReverse {
   public static boolean isRev(String word1, String word2){

      if(word1.isEmpty() || (word1.length() <= 1 && word1.equals(word2))){
         return true;
      }

      if(word1.length() != word2.length()){
         return false;
      }

      int length = word1.length() -1;
         return Character.toUpperCase(word1.charAt(0)) == Character.toUpperCase(word2.charAt(length)) && isRev(word1.substring(1, length +1), word2.substring(0, length));
      }
   public static void main(String[] args){
      String word1 = "";
      String word2 = "";
      System.out.print(isRev(word1, word2));
   }
}
