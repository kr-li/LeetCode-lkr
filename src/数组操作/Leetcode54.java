package 数组操作;

import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length<=0 || matrix[0].length <=0){
            return ans;
        }

        int m = matrix.length, n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];
        int direction = 1, i = 0, j = 0;
        while (true){
            if (i < 0 || j < 0 || i == m || j == n || visited[i][j]){
                break;
            }
            ans.add(matrix[i][j]);
            visited[i][j] = true;
            switch (direction){
                case 1:
                    if (j + 1 == n || visited[i][j+1]){
                        i++;
                        direction = 2;
                    }
                    else {
                        j++;
                    }
                    break;
                case 2:
                    if (i + 1 == m || visited[i+1][j]){
                        j--;
                        direction = 3;
                    }
                    else {
                        i++;
                    }
                    break;
                case 3:
                    if (j == 0 || visited[i][j-1]){
                        i--;
                        direction = 4;
                    }
                    else {
                        j--;
                    }
                    break;
                case 4:
                    if (visited[i-1][j]){
                        j++;
                        direction = 1;
                    }
                    else {
                        i--;
                    }
                    break;
                default: break;
            }
        }
        return ans;
    }
}
