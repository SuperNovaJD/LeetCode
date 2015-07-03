package ContainsDuplicateIII;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ContainsDuplicateIIISolution {
	 public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	        if(nums == null || k == 0 || nums.length == 0){
	            return false;
	        }
	        Comparator<Number> c1 = new Comparator<Number>(){
	            public int compare(Number n1, Number n2){
	                return new  Long(n1.val).compareTo(new Long(n2.val));
	            }
	        };
	        TreeSet<Number> set = new TreeSet<Number>(c1);
	        //����setremove������Ҫ��Ԫ��
	        LinkedList<Number> list = new LinkedList<Number>();
	        
	        for(int i = 0; i < nums.length; i++){
	            if(list.size() > k){
	                Number temp = list.pop();
	                set.remove(temp);
	            }
	            
	            Number n = new Number();
	            n.val = nums[i];
	            n.index= i;
	            
	            if(!set.isEmpty()){
	            	//�ҵ��ȴ��ڻ����nums��i�������б��� 
	                java.util.NavigableSet<Number> tailSet = set.tailSet(n,true);
	                if(!tailSet.isEmpty() && tailSet.first().val - nums[i] <= t){
	                    return true;
	                }
	              //�ҵ���С�ڻ����nums��i�������б���
	                java.util.NavigableSet<Number> headSet = set.headSet(n,true);
	                if(!headSet.isEmpty() && nums[i] - headSet.last().val <= t){
	                    return true;
	                }
	            }
	            
	            list.add(n);
	            set.add(n);
	        }
	        return false;
	    }
	 class Number{
		 int val;
		 int index;
	 }
}
