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

public class SpiralMemory {
  public static void main(String[] args) {
    int dataPoint = 347991; // Data point being evaluated
    int depth = getLayer(dataPoint);
    int distance = manhattanDistance(depth, dataPoint);

    // The final result
    System.out.println("Distance: " + distance);
  }

  /* Gets the depth of the data point in the spiral memory
   * @param int dataPoint - The data address in the spiral memory
   * @return int -  The depth of the data point from the center
   */
  public static int getLayer(int dataPoint) {
    boolean searching = true;
    int corner = 1; // Corner being evaluated
    int depth = 1; // Iterator keeping track of the depth

    // Base case: Data point is at the start of the memory spiral
    if(dataPoint == 1) { return 0; }

    // This algorithm checks to see if the data point resides in the
    // bounds of the memory layer
    while(searching) {
      int firstSquared = (int) Math.pow(corner, 2); // Lower bound
      int secondSquared = (int) Math.pow(corner+2, 2); // Upper bound

      if(dataPoint <= secondSquared && dataPoint >= firstSquared) {
        // The data point exists between the bounds, quit while-loop
        searching = false;
      } else {
        // Data point did not exists between the bounds, advance to next layer
        depth += 1; // Increament depth by 1
        corner+= 2; // Corner increments by two because we are looking at odds
      }
    }
    return depth;
  }

  /* Gets the manhattan distance of a given point at a given depth
   * @param depth - the ring that the data point resides on from the center
   * @param dataPoint - the value we are calculating the distance for
   * @return int representing the manhattan distance from the point to the center
   */
  public static int manhattanDistance(int depth, int dataPoint) {
    // Calcuating the Manhattan Distance
    // Distance to midpoint
    int index = (dataPoint - 1) % (2 * depth);
    // Distance to center
    int edgeDistance = Math.abs(index - depth);
    // Returning the final answer
    return edgeDistance + depth;
  }
}
