package problem1;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * An example of iteration and filtering with predicates.
 */
public class Example1 {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Integer[] values = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8};
    Iterator<Integer> it = Arrays.asList(values).iterator();
    Predicate<Integer> even = (i) -> (i % 2) == 0;

    while (it.hasNext()) {
      Integer i = it.next();
      if (even.test(i)) {
        pen.println(i);
      } // if
    } // while

    pen.close();
  } // main(String[])

} // class Example1
