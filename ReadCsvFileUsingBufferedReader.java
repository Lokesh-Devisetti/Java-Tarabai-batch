/* 1.Write a program to read data from matches.csv file and find out how many 
   times the given team won in a given year using BufferedReader class? 

   Sample Input: 
   Enter Team name: Sunrisers Hyderabad
   Enter Year   : 2017
   Expected Output:  Sunrisers Hyderabad Team won 9 times in 2017
*/

// importing io and util packages
import java.io.*;
import java.util.*;
//creating class ReadCsvFileUsingScanner 
public class ReadCsvFileUsingBufferedReader {

   public static void main(String args[]) {
        String csvFile = "matches.csv";
        String line = "";
        String csvSplitBy = ",";
        int wins = 0;
        String teamName;
        String year;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Team name: ");
        teamName = scanner.nextLine();
        System.out.print("Enter Year: ");
        year = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] match = line.split(csvSplitBy);
                if (match[3].equals(teamName) && match[1].equals(year)) {
                    wins++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(teamName + " Team won " + wins + " times in " + year);
    }
}
