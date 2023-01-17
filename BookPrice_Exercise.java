/* 3. Given the price of n books, find the sum of the price of the Costliest k books. 
      The price of books is given in the form of an array. Use bubble sort algorithm for sorting. 
      Note that k is always less than n.
      Sample Input:-  n = 5 , arr =[3, 14, 54, 21, 41], k=2
      Expected Output:- The sum of k costliest book which can be brought is 95
*/

public class BookPrice_Exercise {
public static int sumOfCostliestBooks(int n, int[] arr, int k) {
    
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
    
    int sum = 0;
    for (int i = 0; i < k; i++) {
        sum += arr[i];
    }
    
    return sum;
}

    public static void main(String args[]) {
   int n = 5;
int[] arr = {3, 14, 54, 21, 41};
int k = 2;
int sum = sumOfCostliestBooks(n, arr, k);

System.out.println("The sum of k costliest book which can be brought is  " + sum);

    }
}
