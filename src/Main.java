import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        int[][] testArr1 = {{1, 2, 3, 4}, {2, 7, 3, 5}, {3, 4, 5, 6}};
        int[][] testArr2 = {{1, 2, 3, 4}, {2, 7, 8, 5}, {3, 4, 4, 6}};
        int[][] testArr3 = {{1, 2, 3, 8}, {2, 7, 8, 5}, {3, 2, 5, 3}};
        int[][] testArr4 = {{1, 2, 9, 9}, {2, 7, 8, 5}, {3, 2, 5, 3}};
        int[][] testArr5 = {{1, 2, 3, 8}, {0, 7, 8, 5}, {0, 2, 5, 3}};
        System.out.println(Algorithm2DArrays.consecutive(testArr1));
        System.out.println(Algorithm2DArrays.consecutive(testArr2));
        System.out.println(Algorithm2DArrays.consecutive(testArr3));
        System.out.println(Algorithm2DArrays.consecutive(testArr4));
        System.out.println(Algorithm2DArrays.consecutive(testArr5));


    }
}
