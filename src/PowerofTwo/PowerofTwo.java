package PowerofTwo;

public class PowerofTwo {
	 public boolean isPowerOfTwo(int n) {

		   int count = 0;

		   if(n < 0){
		       return false;
		   }

		   while(n != 0){
		       int temp = n & 1;
		       if((n & 1) == 1){
		           count++;
		       }
		       n = n >>> 1;
		   }

		   if(count == 1){
		       return true;
		   }else{
		       return false;
		   }
		}
}
