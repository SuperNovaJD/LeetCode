package HouseRobberII;

public class HouseRobberII {
	 public int rob(int[] nums) {
		    if(nums==null||nums.length==0) return 0;
		    if(nums.length==1) return nums[0];
		    if(nums.length==2) return Math.max(nums[0],nums[1]);

		    int prev1=nums[0],prev2=Math.max(nums[0],nums[1]);
		    //valid denotes until current element, whether nums[0] involves in the robbery. If so, valid=false;
		    boolean valid1=false,valid2=prev2==nums[1];            
		    for(int i=2;i<nums.length;i++){
		        int current=Math.max(prev1+nums[i],prev2);
		        boolean tmp=valid2;
		        if(current!=prev2) valid2=valid1;
		        valid1=valid2;
		        prev1=prev2;
		        prev2=current;
		    }
		    int max=prev1;   //store the amount from nums[0] to nums[nums.length-2]
		        if(!valid2){                
		         //if the result is not valid, which means both the first and the last houses are involved, 
		          //we redo the robbery starting from nums[1].
		        prev1=nums[1];prev2=Math.max(nums[1],nums[2]);
		        for(int i=3;i<nums.length;i++){
		            int current=Math.max(prev1+nums[i],prev2);
		            prev1=prev2;
		            prev2=current;
		        }
		    }
		       //compare the amount of nums[0]~nums[nums.length-2] and nums[1]~nums[nums.length-1].
		        return Math.max(max,prev2);
		}
}
