import java.io.*;
import java.util.*;

class Result {

    /*
     You have an identity permutation of N integers as an array initially. 
     An identity permutation of integers is [1, 2, ..., N-1, N]. 
     In this task, you have to perform M operations on the array and report the sum of the elements of the array after each opertion.

     The i operation consists of an integer op(i)
        -If the array contains op(i), swap the first and last elements in the array.
        -Else, remove the last element of the array and push op(i) to the end of the array. 
     */

    public static List<Long> performOperations(int N, List<Integer> op) {
        List<Long> res = new ArrayList<Long>();
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int i, start = 1, end = N;
        Long sum = 0L;
        for(i = 1; i <= N; i++){
            map.put(i, i);
            sum += i;
        }
        for(i = 0; i < op.size(); i++){
            int ele = op.get(i);
            if(map.containsKey(ele)){
                int temp = start;
                start = end;
                end = temp;  
            }
            else{
                sum += (ele - end);
                end = ele;
            }
            res.add(sum);
        }
        return res;
    }

}


public class ArraySumOperation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
        String[] n = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        
        int N = Integer.parseInt(n[0]);

        int M = Integer.parseInt(n[1]);

        int i;

        List<Integer> op = new ArrayList<Integer>();
        for(i = 0; i < M; i++){
            op.add(Integer.parseInt(bufferedReader.readLine()));
        }

        List<Long> result = Result.performOperations(N, op);

        for(i = 0; i < M; i++)
        System.out.println(result.get(i));   

        bufferedReader.close();
    }
}