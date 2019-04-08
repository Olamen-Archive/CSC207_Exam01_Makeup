package problem1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;

/**
 * An example of iteration and filtering with predicates.
 */
public class Example2 {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Integer[] values = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
    Iterator<Integer> fit =  new FilteredIterator<Integer>(
        Arrays.asList(values).iterator(), (i) -> (i % 2) == 0);

    while (fit.hasNext()) {
      Integer i = fit.next();
      pen.println(i);
    } // while

    pen.close();
  } // main(String[])

} // class Example2
