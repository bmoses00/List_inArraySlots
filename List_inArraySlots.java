/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] intArray; // potentially change name later
    private int filledElements;

    private static final int INITIAL_CAPACITY = 10;
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intArray = new int[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String ints = "[";
        for (int element : intArray) {
            ints += element + ",";
        }
        return ints + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
		 if (filledElements == intArray.length - 1)
				expand();
         intArray[filledElements] = value;
         filledElements++;
         return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     private void expand() {
         int[] expandedArray = new int[intArray.length * 2];
         for (int index = 0; index < intArray.length; index++) {
             expandedArray[index] = intArray[index];
             //System.out.println(intArray[index]);
         }
         intArray = expandedArray;
     }
}
