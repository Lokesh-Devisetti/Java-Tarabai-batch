/* 1. Write a Java program to print list of repeated words and list of non-repeated words in a given file and 
      print number of repeated words and number of non-repeated words.
 
     Sample Input: Create text file and write some data to the file.
 
     Expected Output:
     Repeated words: 
     // Display all words which are repeating
     Number of repeated words: 33
     Non-Repeated Words: 
     // Display all words which are not repeating
     Number of repeated words: 12
*/
 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RepeatedNonRepeatedWords {
 
    public static void main(String args[]) {
        System.out.println("Create text file and write some data to the file");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count=0;
        int ncount=0;
        String[] words = input.split(" ");
        Map<String,String> wordMap = new HashMap<String,String>();                
        Map<String,String> printedMap = new HashMap<String,String>();
        for(int i=0;i<words.length;i++) {
            String word = words[i].toUpperCase(); 
            if(wordMap.get(word)!=null) 
            {
                if(printedMap.get(word)==null)
                { 
                    count++;
                    printedMap.put(word, word); 
                }
            }
            else 
            {
                ncount++;
                wordMap.put(word, word);
                
            }
        }
        System.out.println("Number of repeated words: "+count);
        System.out.println("Number of non-repeated words:"+ncount);
    
 
    }
}