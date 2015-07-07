package Test;

import CourseSchedule.CourseScheduleBFS;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseScheduleBFS  test = new CourseScheduleBFS();
		int[][] prerequisites = {{1,0}};
		test.canFinish(2, prerequisites);
	}

}
