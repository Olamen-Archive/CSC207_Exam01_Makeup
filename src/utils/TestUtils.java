package utils;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Some simple utilities for writing tests.
 * 
 * @author Samuel A. Rebelsky
 */
public class TestUtils {
  
  /** 
   * Check that the values return by it are the values in expected
   */
  public static <T> void checkIterator(T[] expected, Iterator<T> it,
      Supplier<String> message) {
    for (int i = 0; i < expected.length; i++) {
      assertTrue(it.hasNext(), message);
      assertEquals(expected[i], it.hasNext(), message);
    } // for
    assertFalse(it.hasNext(), message);
  } // checkIterator
  
  public static <T> void checkIterator(T[] expected, Iterator<T> it, 
      String message) {
    checkIterator(expected, it, () -> message);
  } // checkIterator(T[], Iterator<T>, String)
  
  public static <T> void checkIterator(T[] expected, Iterator<T> it) {
    checkIterator(expected, it, () -> "");
  } // checkIterator(T[], Iterator<T>)
  
  /**
   * Remove all the values that meet a predicate.
   */
  public static <T> void remove(Iterable<? extends T> values, 
      Predicate<? super T> pred) {
    Iterator<? extends T> it = values.iterator();
    while (it.hasNext()) {
      if (pred.test(it.next())) {
        it.remove();
      } // if
    } // while
  } // remove(Iterable, Predicate)
} // TestUtils
