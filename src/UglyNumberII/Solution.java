package UglyNumberII;

import java.util.ArrayList;

public class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1){
            return 1;
        }
        //ArrayList<Integer> test = new ArrayList<Integer>();
        ArrayList<Integer> uglyNum = new ArrayList<Integer>();
        int index_2 = 0;
        int index_3 = 0;
        int index_5 = 0;
        uglyNum.add(1);
        int count = 1;
        while(count < n){
            int small = Math.min(uglyNum.get(index_2)*2, Math.min(uglyNum.get(index_3)*3,uglyNum.get(index_5)*5));
            uglyNum.add(small);
            count++;
            while(index_2 < count && uglyNum.get(index_2)*2<=uglyNum.get(uglyNum.size()-1)) index_2++;
            while(index_2 < count && uglyNum.get(index_3)*3<=uglyNum.get(uglyNum.size()-1)) index_3++;
            while(index_2 < count && uglyNum.get(index_5)*5<=uglyNum.get(uglyNum.size()-1)) index_5++;
        }
        return uglyNum.get(count-1);
    }
}