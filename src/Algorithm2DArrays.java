import java.util.ArrayList;
public class Algorithm2DArrays
{
    /** Return true if target is found in the 2D array arr, false otherwise.
     *  For example, if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     *  and target is 5, this method returns true. If target is 15, returns false
     *
     *  @param arr  2D array of ints
     *  @param target  target value to be searched for in arr
     *  @return  true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr[0].length; z++) {
                if (arr[i][z] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *  For example, if arr is:
     *                  {{"hi", "bye", "howl", "goo"},
     *                   {"time", "owl", "you", "good"},
     *                   {"map", "low", "bow", "mom"}};
     *  and searchStr is "ow", this method returns 4, because 4 strings in arr
     *  contain "ow" as a substring.
     *
     *  @param arr  2D array of Strings
     *  @param searchStr  value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr[0].length; z++) {
                if (arr[i][z].contains(searchStr)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It then returns the number of changes that were made.
     *
     *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
     *  then this method modifies arr to be:
     *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
     *  and returns 8 (the number of even numbers replaced by 0)
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr[0].length; z++) {
                if (arr[i][z] % 2 == 0) {
                    arr[i][z] = 0;
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Return the sum of all elements of arr that are in the one particular row,
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row

     */
    public static int sumForRow(int[][] arr, int row) {
        int total = 0;
        for (int i = 0; i < arr[row].length; i++) {
            total += arr[row][i];
        }
        return total;
    }

    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][col];
        }
        return total;
    }

    /** Creates a 2D array of ints of size n x m, where n is number of rows and
     *  m is number of columns; the elements in the 2D array should be numbered 0
     *  through n x m - 1, with the numbers filled top to bottom, left to right.
     *  The method prints the 2D array "grid" of numbers, and also returns
     *  the 2D array.
     *
     *  For example, for rows = 3 and cols = 4, this method should print
     *  (and return):
     *  0 1 2 3
     *  4 5 6 7
     *  8 9 10 11
     *
     *  Print each element with a single space in between.
     *
     *  @param rows  number of rows
     *  @param cols  number of columns
     *  @return  the same 2D array "number grid" that gets printed by the method
     */
    public static int[][] printNumberGrid(int rows, int cols) {
        int currentNum = 0;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int z = 0; z < cols; z++) {
                arr[i][z] = currentNum;
                currentNum++;
                System.out.print(arr[i][z] + " ");
            }
            System.out.println("");
        }
        return arr;
    }

    /** Creates and returns a square 2D array of Strings of size n x n; the
     *  elements in the 2D array alternate between "X" and "O" (letter),
     *  starting with "X"
     *
     *  For example, if n = 5, this method should return the following 2D array
     *  (with 5 rows and 5 columns):
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *  O X O X O
     *  X O X O X
     *
     *  For example, if n = 6, this method should return the following 2D array
     *  (with 6 rows and 6 columns):
     *  X O X O X O
     *  O X O X O X
     *  X O X O X O
     *  O X O X O X
     *  X O X O X O
     *  O X O X O X
     *
     *  @param n  number of rows and cols (creating square 2D array of size n x n)
     *  @return  a 2D array of Strings that alternate between "X" and "O"
     */
    public static String[][] gridOfXandO(int n) {
        boolean current = true;
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                current = false;
            }   else    {
                current = true;
            }
            for (int z = 0; z < n; z++) {
                if (current) {
                    arr[i][z] = "X";
                    current = false;
                }   else    {
                    arr[i][z] = "O";
                    current = true;
                }
            }
        }
        return arr;
    }

    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @parram len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> tempArr = new ArrayList<String>();
        for (int i = 0; i < wordChart.length; i++) {
            for (int z = 0; z < wordChart[0].length; z++) {
                if (wordChart[i][z].length() == len) {
                    tempArr.add(wordChart[i][z]);
                }
            }
        }
        return tempArr;
    }

    /** calculates and returns the average class grade as a double for a
     *  all Students in the 2D array seatingChart
     *
     *  @param wordChart  2D array of Strings
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static double classAverage(Student[][] seatingChart) {
        double average = 0;
        int students = 0;
        for (int i = 0; i < seatingChart.length; i++) {
            for (int z = 0; z < seatingChart[0].length; z++) {
                average += seatingChart[i][z].getGrade();
                students++;
            }
        }
        return average / students;
    }

    /** Returns a new 2D array that contains all values in the 2D array arr
     *  in reverse, such that the last value in the last row becomes the first
     *  value in the first row, and so on.  This method does NOT modify arr, the
     *  original 2D array object.
     *
     *  Example: if arr is {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}
     *  then this method returns the following 2D array:
     *                     {{12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}}
     *
     *  @param arr  2D array of ints
     */
    public static int[][] reverse(int[][] arr) {
        int tempArr[][] = new int[arr.length][arr[0].length];
        int a = 0;
        int b = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int z = arr[0].length - 1; z >= 0; z--) {
                tempArr[a][b] = arr[i][z];
                b++;
            }
            b = 0;
            a++;
        }
        return tempArr;
    }

    /** Returns true if any two consecutive elements, horizontally or vertically,
     *  are equal, false otherwise.  You do not need to check for "wrap around"
     *  consecutiveness, such as if the last element in a row is the same as
     *  the first:
     *
     *  For example, if arr is:
     *      1, 2, 3, 4
     *      2, 7, 3, 5
     *      3, 4, 5, 6
     *
     *  then this method returns true because there is a pair of consecutive
     *  numbers (vertically)
     *
     *  As another example, if arr is:
     *      1, 2, 3, 4
     *      2, 7, 8, 5
     *      3, 4, 4, 6
     *
     *  then this method returns true because there is a pair of consecutive
     *  numbers (horizontally)
     *
     *  As another example, if arr is:
     *      1, 2, 3, 8
     *      2, 7, 8, 5
     *      3, 2, 5, 3
     *
     *  then this method returns false because there are not two consecutive
     *  numbers, vertically or horizontally, that are equal.
     *
     *  NOTE: do not consider "wrap around" consecutiveness, in other words,
     *  the 3's and 2's below are not considered consecutive:
     *      1, 2, 3, 8
     *      2, 7, 8, 5
     *      3, 2, 5, 3
     *
     *  Similarly, equal numbers on a diagonal are not considered consecutive,
     *  so the 8's below are not consecutive:
     *      1, 2, 3, 8
     *      2, 7, 8, 5
     *      3, 2, 5, 3
     *
     *  @param arr  2D array of ints
     */
    public static boolean consecutive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int z = 0; z < arr[0].length; z++) {
                if (i + 1 < arr.length) {
                    if (arr[i][z] == arr[i + 1][z]) {
                        return true;
                    }
                }
                if (z + 1 < arr[0].length) {
                    if (arr[i][z] == arr[i][z + 1]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /** A magic square is a square grid filled with distinct positive integers
     *  such that each element is a different integer, and the sum of the integers
     *  in each row, column and diagonal is equal.  This method should return true
     *  if arr is a magic square.
     *
     *  PRECONDITION: arr is a square 2D array with the same number of rows and
     *                columns
     *
     *  For example, if arr is:
     *      7, 2, 3
     *      0, 4, 8
     *      5, 6, 1
     *
     *  then this method returns true because all numbers are unique (no duplicate
     *  values) and each row, column, and diagonal add up to the same number (12)
     *
     *  As another example, if arr is (note the 3 and 2 swapped):
     *      7, 3, 2
     *      0, 4, 8
     *      5, 6, 1
     *
     *  then this method returns false because the column sums no longer add up to
     *  the same value
     *
     *  As another example, if arr is:
     *      3, 3, 3
     *      3, 3, 3
     *      3, 3, 3
     *  then this method returns false because although the sums are the same
     *  along rows, columns, and diagonals, there are duplicate numbers.
     *
     *  @param arr  2D array of ints
     */
    public static boolean magicSquare(int[][] arr) {
        int magicNum = sumForRow(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            if (sumForRow(arr, i) != magicNum) {
                return false;
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (sumForColumn(arr, i) != magicNum) {
                return false;
            }
        }
        if (consecutive(arr) == true) {
            return false;
        }
        return true;
    }

}