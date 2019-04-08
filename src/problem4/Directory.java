package problem4;

import java.util.Iterator;

/**
 * A simple directory of usernames and real names.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class Directory {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The entries in our directory.
   */
  Entry[] entries;

  /**
   * The number of entries in the directory.
   */
  int size;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new directory.
   */
  public Directory() {
    this.entries = new Entry[16];
    this.size = 0;
  } // Directory()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Set the real name associated with a screen name.
   */
  public void set(String screen, String real) {
  } // set(String, String)

  /**
   * Get the real name associated with a screen name.
   *
   * @exception Exception if there is no entry associated with
   *   the screen name.
   */
  public String get(String screen) throws Exception {
    return null;
  } // get(String)

  /**
   * Get an iterator for all of the screen names (in alphabetical
   * order).
   */
  public Iterator<String> screenNames() {
    return new Iterator<String>() {
      public boolean hasNext() {
        return false;
      } // hasNext()

      public String next() {
        return "next";
      } // next()

      public void remove() {
        throw new IllegalStateException("Iowa");
      } // remove()
    }; // new Iterator<String>
  } // screenNames()

  /**
   * Get an iterator for all of the real names (in some order).
   */
  public Iterator<String> realNames() {
    return new Iterator<String>() {
      public boolean hasNext() {
        return false;
      } // hasNext()

      public String next() {
        return "next";
      } // next()

      public void remove() {
        throw new IllegalStateException("Colorado");
      } // remove()
    }; // new Iterator<String>
  } // realNames()

  // +---------+-----------------------------------------------------
  // | Helpers |
  // +---------+

  /**
   * Expand the directory to make room for more entries.
   */
  public void expand() {
  } // expand()

  /**
   * Find the index of screen in the directory.  If screen is not
   * in the directory, return the index of the first value larger
   * than screen.  If there are no values larger than screen,
   * return this.size.
   */
  public int find(String screen) {
    return this.size;
  } // find(String)

} // Directory
