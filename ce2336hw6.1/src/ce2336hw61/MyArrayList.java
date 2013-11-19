package ce2336hw61;

/*
 *
 * Add the following methods to the MyArrayList code this is found
 * in the slides/textbook and also is an attachment in this
 * assignment.
 *
 * 12 points
 * a) boolean addAll(int index, Collection<? extends E> c)
 *
 *     Inserts all of the elements in the specified collection into
 *     this list, starting at the specified position.  Returns true
 *     if the method succeeds, or false if there was a problem such
 *     as an invalid index.
 *
 * 13 points
 * b) boolean removeAll(Collection<?> c)
 *
 *     Removes from this list all of its elements that are contained
 *     in the specified collection.  Returns true if any items are
 *     removed, or false otherwise.
 */

//Author: Daniel Heironimus

public class MyArrayList<E> extends MyAbstractList<E> {
  public static final int INITIAL_CAPACITY = 16;
  private E[] data = (E[])new Object[INITIAL_CAPACITY];

  /** Create a default list */
  public MyArrayList() {
  }

  /** Create a list from an array of objects */
  public MyArrayList(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]); // Warning: don�t use super(objects)! 
  }

  @Override /** Add a new element at the specified index */
  public void add(int index, E e) {   
    ensureCapacity();

    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];

    // Insert new element to data[index]
    data[index] = e;

    // Increase size by 1
    size++;
  }

  /** Create a new larger array, double the current size + 1 */
  private void ensureCapacity() {
    if (size >= data.length) {
      E[] newData = (E[])(new Object[size * 2 + 1]);
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    }
  }

  @Override /** Clear the list */
  public void clear() {
    data = (E[])new Object[INITIAL_CAPACITY];
    size = 0;
  }

  @Override /** Return true if this list contains the element */
  public boolean contains(E e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;

    return false;
  }

  @Override /** Return the element at the specified index */
  public E get(int index) {
    checkIndex(index);
    return data[index];
  }

  private void checkIndex(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
  }
  
  @Override /** Return the index of the first matching element 
   *  in this list. Return -1 if no match. */
  public int indexOf(E e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return i;

    return -1;
  }

  @Override /** Return the index of the last matching element 
   *  in this list. Return -1 if no match. */
  public int lastIndexOf(E e) {
    for (int i = size - 1; i >= 0; i--)
      if (e.equals(data[i])) return i;

    return -1;
  }

  @Override /** Remove the element at the specified position 
   *  in this list. Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index) {
    checkIndex(index);
    
    E e = data[index];

    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];

    data[size - 1] = null; // This element is now null

    // Decrement size
    size--;

    return e;
  }

  @Override /** Replace the element at the specified position 
   *  in this list with the specified element. */
  public E set(int index, E e) {
    checkIndex(index);
    E old = data[index];
    data[index] = e;
    return old;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("[");

    for (int i = 0; i < size; i++) {
      result.append(data[i]);
      if (i < size - 1) result.append(", ");
    }

    return result.toString() + "]";
  }

  /** Trims the capacity to current size */
  public void trimToSize() {
    if (size != data.length) { 
      E[] newData = (E[])(new Object[size]);
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    } // If size == capacity, no need to trim
  }

  @Override /** Override iterator() defined in Iterable */
  public java.util.Iterator<E> iterator() {
    return new ArrayListIterator();
  }
 
  private class ArrayListIterator 
      implements java.util.Iterator<E> {
    private int current = 0; // Current index 

    @Override
    public boolean hasNext() {
      return (current < size);
    }

    @Override
    public E next() {
      return data[current++];
    }

    @Override
    public void remove() {
      MyArrayList.this.remove(current);
    }
  }

  //add all; checks if index location exists, then does a try()
  //runs checkIndex(index), or some other exception is thrown, return false
  //otherwise, implements add method
  public boolean addAll(int index, java.util.Collection<? extends E> c){
      for (E o : c){
          try{
              this.checkIndex(index-1);
              add(index, o);
           }catch(Exception e){
              return false;
           }
          index++;
      }
      return true;
  }

  //remove all; checks if object values are equal to elements in the list;
  //if so, uses the remove(int index) method to remove.
  public boolean removeAll(java.util.Collection<?> c){
      boolean status = false;
      for(Object o:c){
        for(int i=0;i<size;i++){
            if(data[i]==o){
                this.remove(i);
                i--;
                status=true;
            }
        }
      }
      return status;
  }

}

