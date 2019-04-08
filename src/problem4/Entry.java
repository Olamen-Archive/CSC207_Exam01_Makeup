package problem4;

/**
 * An entry in our directory.
 * 
 * @author Samuel A. Rebelsky
 */
class Entry {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The screen name
   */
  String screen;
  
  /**
   * The real name
   */
  String real;

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  public Entry(String screen, String real) {
    this.screen = screen;
    this.real = real;
  } // Entry(String, String)
} // Entry
