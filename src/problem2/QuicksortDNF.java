package problem2;

/**
 * An implementation of Quicksort that partitions using the Dutch National
 * Flag algorithm.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class QuicksortDNF {
  /**
   * Sort an array of integers in place, using Quicksort w/DNF.
   */
  public static void sort(int[] values) {
    sort(values, 0, values.length);
  } // sort(int[])
  
  /**
   * Sort the subarray of values between lb (inclusive) and ub (exclusive)
   * using Quicksort w/DNF
   */
  private static void sort(int[] values, int lb, int ub) {
    // Special case: 0 or 1 elements
    if (ub - lb <= 1) {
      return;
    } // if zero or one elements
    
    // Prepare bounds for DNF
    int r = 0;      // The end of the red/small section
    int w = 0;      // The end of the white/equal section
    int b = ub;     // The start of the blue/greater section
    
    // Rearrange the values
    swap(values, lb, w);   // Incorrect!
    
    // Recurse
    sort(values, lb, r);
    sort(values, b, ub);
  } // sort(int[], int, int)
  
  /**
   * Swap the elements at positions i and j.
   */
  private static void swap(int[] values, int i, int j) {
    int tmp = values[i];
    values[i] = values[j];
    values[j] = tmp;
  } // swap(int[], int, int)
} // QuicksortDNF
