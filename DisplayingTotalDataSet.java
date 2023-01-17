/*3.Write a program to read data from matches.csv file and find out following points:
   • how many matches we have got in this dataset.
   • how many Seasons(years) we have got in this dataset.
   • how many venues we have got in this dataset.

   Expected Output:
   Number of matches: 750
   Number of seasons: 5
   Number of venues: 9
*/
import java.util.*;
import java.io.*;
public class DisplayingTotalDataSet {
    public static void main(String[] args) {
        String csvFile = "matches.csv";
        String line = "";
        String csvSplitBy = ",";
        int matchCount = 0;
        Set<String> seasons = new HashSet<>();
        Set<String> venues = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] match = line.split(csvSplitBy);
                matchCount++;
                seasons.add(match[1]);
                venues.add(match[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of matches: " + matchCount);
        System.out.println("Number of seasons: " + seasons.size());
        System.out.println("Number of venues: " + venues.size());
    }
}
