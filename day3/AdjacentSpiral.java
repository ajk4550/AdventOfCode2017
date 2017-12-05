/* Program that finds the Manhattan distance from two points in a new
 * Spiral memory. This spiral memory is represented as an ulam spiral.
 * Assumptions: Data point is always a positive integer
 *
 * Test case:
 * 12 is 3 steps from center
 * 23 is 2 steps from center
 * 1024 is 31 steps from center
 *
 * Aaron Kaye, 2017
 * Expected Output: 480
 */
import java.lang.Math;

public class AdjacentSpiral {
  public static void main(String[] args) {
    boolean searching = true;
    List<Integer> spiral = new List<Integer>();
    // Adding base case
    spiral.add(1);
    int i = 0;
    while(searching == true) {
      int adjacentSum = spiral.get();
      spiral.add();
      i++;
    }
  }
}


// 1 1 2 4 5 10 11 23 25 26 54 57 59 122 133 142 147 304 330 351 362 747 806 ....
