package Darrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> solution(int matrix[][]) {
        // int sr = 0;
        // int er = matrix.length - 1;
        // int sc = 0;
        // int ec = matrix[0].length - 1;

        // while (sr <= er && sc <= ec) {
        // // top
        // for (int j = sc; j <= ec; j++) {
        // System.out.print(matrix[sr][j] + ",");
        // }
        // // right
        // for (int i = sr + 1; i <= er; i++) {
        // System.out.print(matrix[i][ec] + ",");
        // }
        // // bottom
        // for (int j = ec - 1; j >= sc; j--) {
        // System.out.print(matrix[er][j]+",");
        // }
        // //right
        // for(int i=er-1;i>=sr+1;i--){
        // System.out.print(matrix[i][sc]+",");
        // }
        // sr++;
        // sc++;
        // er--;
        // ec--;
        // }
        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;
        // int arr[] = new int[matrix.length];
        List<Integer> list = new ArrayList<>();

        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                // System.out.print(matrix[sr][j] + ",");
                // arr[j] = matrix[sr][j];
                list.add(matrix[sr][j]);
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                // System.out.print(matrix[i][ec] + ",");
                // arr[i] = matrix[i][ec];
                list.add(matrix[i][ec]);
            
            }
           // bottom
           if(sr<er){
            for (int j = ec-1 ; j >= sc; j--) {
                // System.out.print(matrix[er][j]+",");
                // arr[j] = matrix[er][j];
                list.add(matrix[er][j]);
            
            }
            }
            // left
            if(sc<ec){
            for (int i = er - 1; i >= sr + 1; i--) {
                // System.out.print(matrix[i][sc]+",");
                // arr[i] = matrix[i][sc];
                list.add(matrix[i][sc]);
            
            }
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
      
        return list;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 ,4}, {  5, 6,7,8 }, { 9,10,11,12 } };
        List<Integer> list = solution(matrix);
        System.out.println(list);
    }

}
