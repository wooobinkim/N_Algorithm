package Programmers.정수삼각형;
import java.util.*;
public class 최고의집합 {

    class Solution {
        public int[] solution(int n, int s) {
            int[] answer = {};

            if(s/n == 0) return new int[]{-1};
            else{
                int[] arr = new int[n];
                for(int i=0 ; i<arr.length ; i++){
                    arr[i] = s/n;
                }
                for(int i=0 ; i<(s%n) ; i++){
                    arr[i] += 1;
                }
                Arrays.sort(arr);
                return arr;
            }
        }
    }
}
