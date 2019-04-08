package problem1;

import java.util.Iterator;
import java.util.function.Predicate;

/**
 * Iterators that filter elements that meet a predicate.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class FilteredIterator<T> implements Iterator<T> {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The underlying iterator.
   */
  Iterator<T> iterator;

  /**
   * The predicate used to filter the iterator.
   */
  Predicate<T> pred;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create an iterator that filters the elements of iter using
   * pred.
   */
  public FilteredIterator(Iterator<T> iter, Predicate<T> pred) {
    this.iterator = iter;
    this.pred = pred;
  } // FilteredIterator(Iterator<T>, Predicate<T>)

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get the next value for which the predicate holds.
   *
   * @pre this.hasNext()
   * @post pred.test(result) hold
   */
  public T next() {
    return this.iterator.next();
  } // next()

  /**
   * Determine if there are any more values for which the predicate
   * holds.
   */
  public boolean hasNext() {
    return this.iterator.hasNext();
  } // hasNext()

  /**
   * Remove the most recent value returned by next.  If the preconditions
   * are not met, throws an `IllegalStateException`.
   *
   * @pre There has been at least one call to this.next()
   * @pre There have been no calls to this.remove() or this.hasNext()
   *      since the last call to this.next()
   */
  public void remove() {
    throw new IllegalStateException("Not yet implemented.");
  } // remove()
} // FilteredIterator
