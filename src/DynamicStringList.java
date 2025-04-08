public class DynamicStringList implements StringList
{

  private int size;
  private String[] data;


  // constructor
  public DynamicStringList()
  {
      this.size = 0;
      this.data = new String [10];
  }

  // helper method to resize the array if needed
  private void resizeIfNeeded()
  {
    if(size == data.length)
    {
      String[] newArray = new String[size*2];
      for(int i = 0; i <size; i++)
      {
        newArray[i] = data[i];
      }
    data = newArray;
    }
  }

  // helper method to check if the index is in bounds
  private void checkInBounds(int index)
  {
    if(index >= size || index < 0)
    {
      throw new IndexOutOfBoundsException(index);
    }
  }
    
  /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String get(int index)
  {
    checkInBounds(index);
    return data[index];
  }

  /**
   * Replaces the string at the specified index with the given value.
   *
   * @param index the index of the string to replace.
   * @param value the new value to set at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public void set(int index, String value)
  {

  }

  /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
  public void add(String value)
  {
    resizeIfNeeded();
    data[size] = value;
    size++;
  }

  /**
   * Removes the string at the specified index from the list.
   *
   * @param index the index of the string to remove.
   * @return the string that was removed.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
   */
  public String remove(int index)
  {

  }

  /**
   * Returns the number of strings currently in the list.
   *
   * @return the size of the list.
   */
  public int size()
  {
    return size;
  }


  /**
   * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
   *
   * @return the capacity of the list.
   */
  public int capacity()
  {
    return data.length;
  }
}


