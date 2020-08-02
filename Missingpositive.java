/* 
From a given array of positive and negative numbers find the smallest missing positive integer 

Example: 
Input: 1, 3, 4, 7
Output: 2

Input: -3, -1, 0, 2
Output: 1

Time Complexity: O(n)
Space Complexity: O(1)

for i = array[idx], swap i and array[i] if i < array(len) 
*/


import java.io.*;

class Missingpositive{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = new String[5];
        line = br.readLine().split(" ");
        int n = line.length;
        int[] a = new int[n];
        int i;

        for(i = 0; i < n; i++){
            a[i] = Integer.parseInt(line[i]);
        }

        i = 0;
        int count = 0;
        while(count < n){
            if(a[i] < n && a[i] > 0 && a[i] != i+1){
                int temp = a[i];
                a[i] = a[a[i] - 1];
                a[a[i] - 1] = temp;
            }
            else i += 1;
            count += 1;
        }
        for(i = 0; i < n; i++){
            if(a[i] != i+1){
                System.out.println(i + 1);
                break;
            }
        }

    }
}
