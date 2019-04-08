package problem3;

/**
 * Simple nodes for linked structures.  Nodes are not encapsulated;
 * we assume that the client classes (in the same package) will
 * use the fields as appropriate.
 */
class Node<T> {
  // +--------+----------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The value stored in the node.
   */
  T value;

  /**
   * The next node.
   */
  Node<T> next;

  // +--------------+----------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new node that contains val and that links to next.
   */
  public Node(T value, Node<T> next) {
    this.value = value;
    this.next = next;
  } // Node(T, Node<T>)
  
  /**
   * Create a node with a value and no next node.
   */
  public Node(T value) {
    this(value, null);
  } // Node(T)
} // class Node<T>
