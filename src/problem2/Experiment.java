package problem2;

import java.util.Arrays;
import java.util.Random;

/**
 * A quick-and-dirty experiment that lets us sort values presented on
 * the command line.
 *
 * @author Samuel A. Rebelsky
 */
public class Experiment {

  public static void main(String[] args) throws Exception {
    Random rand = new Random();
    for (int i = 1; i < 100; i++) {
      int[] arr1 = new int[i];
      int[] arr2 = new int[i];
      for (int j = 0; j < arr1.length; j++) {
        int randNum = rand.nextInt(100);
        arr1[j] = randNum;
        arr2[j] = randNum;
      }
      QuicksortDNF.sort(arr1);
      Arrays.sort(arr2);
      if (!compare(arr1, arr2)) {
        System.out.println("Error at: " + i);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
      }
    }
  } // main(Sting[])

  private static boolean compare(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }

    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }

    return true;
  }

} // Experiment
