import java.util.HashSet;

public class recursion14 {
   
    private static final int String = 0;
    private static int newHashSet;
    public static void subsequence(String str,int idx,String newString,HashSet <String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
         }
         char currChar=str.charAt(idx);
         subsequence(str, idx+1, newString+currChar, set);
         subsequence(str, idx+1, newString, set);
    }
/**
 * @param args
 */
public static void main(String[] args) {
    String str1="abc";
    String str2="aaa";
     final HashSet<String>set=new HashSet<>();
     subsequence(str2, 0, " ",set);
    
      }
}