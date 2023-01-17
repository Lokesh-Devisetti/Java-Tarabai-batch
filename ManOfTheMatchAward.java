/* 4. Write a program to read data from matches.csv file and find out how many times a given player won
      the man of the match award in a given year?
   Sample Input:
   Enter player Name: Yuvraj Singh
   Enter Year:        2017

   Expected Output: 2 times
*/
import java.io.*;
import java.util.*;
public class ManOfTheMatchAward {
    public static void main(String[] args) {
        String csvFile = "matches.csv";
        String line = "";
        String csvSplitBy = ",";
        int awardCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player Name: ");
        String playerName = scanner.nextLine();
        System.out.print("Enter Year: ");
        String year = scanner.nextLine();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] match = line.split(csvSplitBy);
                if (match[10].equals(playerName) && match[1].equals(year)) {
                    awardCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(playerName + " won the man of the match award " + awardCount + " times in " + year);
    }
}

  