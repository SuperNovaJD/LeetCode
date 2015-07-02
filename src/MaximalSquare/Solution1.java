package MaximalSquare;

public class Solution1 {
	public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        if(matrix.length == 1){
            return findRowMax(matrix);
        }
        if(matrix[0].length == 1){
            return findColMax(matrix);
        }
        int count = 0;
        int[][] temp = new int[matrix.length][matrix[0].length];
        //convert the char matrix to numbers
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1'){
                    temp[i][j] = 1;
                    count = 1;
                }else{
                    temp[i][j] = 0;
                }
            }
        }
        
        for(int i = matrix.length-2; i >= 0; i--){
            for(int j = matrix[0].length-2; j >= 0; j--){
                if(temp[i][j] == 1){
                    temp[i][j] = Math.min(Math.min(temp[i][j+1],temp[i+1][j]),temp[i+1][j+1]) + 1;
                }
                count =(temp[i][j] > count) ? temp[i][j]:count;
            }
        }
        return count * count;
    }
    public int findRowMax(char[][] matrix){
        for(int i = 0; i < matrix[0].length; i ++){
            if(matrix[0][i] == '1'){
                return 1;
            }
        }
        return 0;
    }
    public int findColMax(char[][] matrix){
        for(int i = 0; i < matrix.length; i ++){
            if(matrix[i][0] == '1'){
                return 1;
            }
        }
        return 0;
    }
}
