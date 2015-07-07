package CourseSchedule;

import java.util.*;

public class CourseScheduleBFS {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
	   ArrayList[] graph = new  ArrayList[numCourses];
	   int[] degree = new int[numCourses];
	   Queue queue = new LinkedList();
	   
	   int count = 0;
	   for(int i = 0; i < graph.length; i++){
		   graph[i] = new ArrayList<Integer>();
	   }
	   for(int i = 0; i < prerequisites.length; i++){
		   degree[prerequisites[0][i]]++;
		   graph[prerequisites[i][0]].add(prerequisites[i][1]);
	   }
	   
	   for(int i = 0; i < degree.length; i++){
		   if(degree[i] == 0){
			   queue.add(i);
			   count++;
		   }
	   }
	  // System.out.println(count);
	   while(queue.size() != 0){
		   int temp = (int)queue.poll();
		   for(int i = 0; i < graph[temp].size(); i++){
			   int pointer = (int)graph[temp].get(i);
			   degree[pointer]--;
			   //System.out.println("pointer is "+pointer);
			   if(degree[pointer] == 0){
				   queue.add(pointer);
				   count++;
			   }
		   }
	   }
	   //System.out.println(count);
	   if(count == numCourses){
		   
		   return true;
	   }
       return false;
    }

}
