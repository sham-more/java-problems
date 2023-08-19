import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Find Duplicates From String Program : ");

        String str = "shamMoreESHmm";

        str = str.toUpperCase();

        Set<Character> set = new HashSet<Character>();

        Set<Character> Duplicates = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            
            if (set.contains(str.charAt(i))) {  
                Duplicates.add(str.charAt(i));
            }else{
              set.add(str.charAt(i));  
            }
        }
        System.out.print("Duplicates Are:");
        for(char c:Duplicates){
            
            System.out.print(c);
            
        } 
    }
}