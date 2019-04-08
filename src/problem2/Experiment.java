package problem2;

import java.util.Arrays;

/**
 * A quick-and-dirty experiment that lets us sort values presented on
 * the command line.
 *
 * @author Samuel A. Rebelsky
 */
public class Experiment {

  public static void main(String[] args) throws Exception {
    int[] values = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      values[i] = Integer.parseInt(args[i]);
    } // for
    QuicksortDNF.sort(values);
    System.out.println(Arrays.toString(values));
  } // main(Sting[])

} // Experiment
