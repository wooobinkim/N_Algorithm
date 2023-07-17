package Programmers.정수삼각형;
import java.util.*;
public class 정수삼각형 {
    class Solution {
        public int solution(int[][] triangle) {
            int answer = 0;

            int[][] memory = new int[triangle.length][triangle.length];
            memory[0][0] = triangle[0][0];

            for(int i=0 ; i<triangle.length-1 ; i++){
                for(int j=0 ; j<triangle[i].length ; j++){
                    if(memory[i+1][j] < memory[i][j]+triangle[i+1][j]){
                        memory[i+1][j] = memory[i][j]+triangle[i+1][j];
                    }
                    if(memory[i+1][j+1] < memory[i][j]+triangle[i+1][j+1]){
                        memory[i+1][j+1] = memory[i][j]+triangle[i+1][j+1];
                    }

                    answer = Math.max(answer, memory[i+1][j]);
                    answer = Math.max(answer, memory[i+1][j+1]);
                }
            }

            return answer;
        }
    }
}
