package Programmers.정수삼각형;
import java.util.*;

public class 이중우선순위큐 {
    class Solution {
        public int[] solution(String[] operations) {
            int[] answer = {};
            PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();
            PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>(Collections.reverseOrder());

            for(int i=0 ; i< operations.length ; i++){
                String s = operations[i];
                String status = s.split(" ")[0];
                int val = Integer.parseInt(s.split(" ")[1]);

                if(status.equals("I")){

                    minQ.add(val);
                    maxQ.add(val);

                }else if(status.equals("D")){

                    if(val == -1 && !minQ.isEmpty()){
                        int n = minQ.poll();
                        maxQ.remove(n);
                    }

                    if(val == 1 && !maxQ.isEmpty()){
                        int n = maxQ.poll();
                        minQ.remove(n);
                    }

                }
            }

            int s1 = minQ.size();
            int s2 = maxQ.size();

            if(s1==0 || s2==0){
                return new int[]{0,0};
            }else{
                return new int[]{maxQ.peek(),minQ.peek()};
            }
        }
    }
}
