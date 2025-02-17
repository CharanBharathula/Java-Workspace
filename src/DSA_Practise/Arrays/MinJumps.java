package DSA_Practise.Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinJumps {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr, 0));
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        // what is the purpose of try with resources?

    }

    private static int minJumps(int[] arr, int i) {
        if ( i == arr.length - 1){
            return 0;
        }
        if( arr[i] == 0 )
            return -1;
        int minJ = Integer.MAX_VALUE;
        for( int j = i+1; j <= Math.min( i+arr[i], arr.length-1 ); j++ ){
            int jumpsFromJ = minJumps(arr, j);
            if( jumpsFromJ != -1 )
                minJ = Math.min( minJ, 1 + jumpsFromJ );
        }
        if( minJ == Integer.MAX_VALUE ) // un reachable
            return -1;
        return minJ;

    }
}
