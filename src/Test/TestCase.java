package Test;

import CourseSchedule.CourseScheduleBFS;
import MinimumSizeSubarraySum.MinimumSizeSubarraySumSolution;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MinimumSizeSubarraySumSolution  test = new MinimumSizeSubarraySumSolution();
		rangeBitwiseAnd(5,7);
	
	}
	 public static int rangeBitwiseAnd(int m, int n) {
	        int offset = 0;
	        while(m!=n){
	            m>>=1;
	            System.out.println(m);
	            n>>=1;
	            
	            offset++;
	            System.out.println("  "+offset);
	        }
	        
	        return m<<offset;
	    }

}
