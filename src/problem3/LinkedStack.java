package problem3;

import java.util.Iterator;

/**
 * A simple implementation of stacks using linked nodes.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class LinkedStack<T> implements Iterable<T> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The top of the stack
   */
  Node<T> top;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  // +---------------+-----------------------------------------------
  // | Stack methods |
  // +---------------+

  /**
   * Add an element to the stack.
   *
   * @param val the value to add.
   * @pre !this.isFull()
   * @post The stack now contains an additional element of val.
   * @exception IllegalStateException if the structure is full.
   */
  public void push(T val) {
    if (isFull()) {
      throw new IllegalStateException("Stack is full");
    } // if (isFull())
    this.top = new Node<T>(val, this.top);
  } // push(T)

  /**
   * Remove the most recently added element that is still in the stack.
   *
   * @return val, a value.
   * @pre !this.isEmpty()
   * @post The structure contains one fewer copy of val.
   * @post Every element that remains in the stack was added less recently than val.
   * @exception IllegalStateException If the structure is empty.
   */
  public T pop() {
    T val = this.top.value;
    this.top = this.top.next;
    return val;
  } // pop()

  /**
   * Determine what is on top of the stack.
   *
   * @return val, a value.
   * @pre !this.isEmpty()
   * @post Every other value in the stack was added less recently than val.
   * @exception Exception If the structure is empty.
   */
  public T top() throws Exception {
    return this.top.value;
  } // top()

  /**
   * Determine if the structure is empty.
   */
  public boolean isEmpty() {
    return this.top != null;
  } // isEmpty()

  /**
   * Determine if the structure is full.
   */
  public boolean isFull() {
    return false;
  } // isFull()

  // +----------+----------------------------------------------------
  // | Iterator |
  // +----------+

  /**
   * Get an iterator that returns all of the elements in some order.
   */
  public Iterator<T> iterator() {
    return null;
  } // iterator()
} // LinkedStack
