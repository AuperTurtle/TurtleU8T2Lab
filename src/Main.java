import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        int[][] testArr1 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr2 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr3 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        int[][] testArr4 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] testArr5 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        int[][] testArr6 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
        int[][] testArr7 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
        System.out.println(Algorithm2DArrays.magicSquare(testArr1));
        System.out.println(Algorithm2DArrays.magicSquare(testArr2));
        System.out.println(Algorithm2DArrays.magicSquare(testArr3));
        System.out.println(Algorithm2DArrays.magicSquare(testArr4));
        System.out.println(Algorithm2DArrays.magicSquare(testArr5));
        System.out.println(Algorithm2DArrays.magicSquare(testArr6));
        System.out.println(Algorithm2DArrays.magicSquare(testArr7));



    }
}
