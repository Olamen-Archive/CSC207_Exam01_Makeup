package problem2;

import java.util.Random;

/**
 * An implementation of Quicksort that partitions using the Dutch National
 * Flag algorithm.
 * Code based on Zixuan Guo's previous ThreeWayQuickSort code:
 * https://github.com/Olament/algs4/blob/master/Part%20One/Sort/ThreeWayQuickSort.java
 *
 * @author Samuel A. Rebelsky
 * @author Zixuan Guo
 */
public class QuicksortDNF {
  /**
   * Sort an array of integers in place, using Quicksort w/DNF.
   */
  public static void sort(int[] values) {
    shuffle(values);
    sort(values, 0, values.length);
  } // sort(int[])
  
  /**
   * Sort the subarray of values between lb (inclusive) and ub (exclusive)
   * using Quicksort w/DNF
   */
  private static void sort(int[] values, int low, int high) {
    // Special case: 0 or 1 elements
    if (high - low <= 1) {
      return;
    } // if zero or one elements

    /* initialize pointer */
    int lb = low;  // lower bound, exclusive
    int hb = high; // high bound, inclusive
    int pos = lb + 1; // equal bound, exclusive
    int pivot = values[low]; // pivot for partition

    /* partition */
    while (pos < hb) {
      if (values[pos] < pivot) {
        swap(values, lb++, pos++);
      } else if (values[pos] > pivot) {
        swap(values, pos, --hb);
      } else {
        pos++;
      }
    }

    // Recurse
    sort(values, low, lb);
    sort(values, hb, high);
  } // sort(int[], int, int)
  
  /**
   * Swap the elements at positions i and j.
   */
  private static void swap(int[] values, int i, int j) {
    if (i == j) { return; } // no need for swap if same indexes
    int tmp = values[i];
    values[i] = values[j];
    values[j] = tmp;
  } // swap(int[], int, int)

  private static void shuffle(int[] array) {
    Random rand = new Random();
    for (int i = array.length - 1; i >= 0; i--) {
      swap(array, i, rand.nextInt(i + 1));
    }
  }
} // QuicksortDNF
