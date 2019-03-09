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
		 if (filledElements == intArray.length)
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
     // ---------- END OF CODE THAT WORKED IN v0 --------- //

     /**
       accessor
       @return element @index from this list
       @precondition: @index is within the bounds of the array.
           (Having warned the user about this precondition,
            you should NOT complicate your code to check
            whether user violated the condition.)
      */
     public int get( int index ) {
         return intArray[index];
     }

     /**
       Set value at @index to @newValue

       @return old value at @index
       @precondition: @index is within the bounds of this list.
      */
     public int set( int index, int newValue ) {
         int oldValue = intArray[index];
         intArray[index] = newValue;
         return oldValue;
     }

     /**
       Insert @value at position @index in this list.

       Shift the element currently at that position (if any)
       and any subsequent elements to the right
       (that is, increase the index associated with each).
      */
      public void add( int index, int value) {
          add(intArray[filledElements - 1]); // slides element at end over by 1
          for (int currentIndex = filledElements - 2; currentIndex > index - 1; currentIndex--) {
              intArray[currentIndex + 1] = intArray[currentIndex];
          }
          intArray[index] = value;
          System.out.println(intArray.length);
      }


     /**
       Remove the element at position @index in this list.

       Shift any subsequent elements to the left (that is,
       decrease the index associated with each).

       @return the value that was removed from the list
      */
      public int remove( int index) {
          for (int currentIndex = index; currentIndex < filledElements; currentIndex++) {
              intArray[currentIndex] = intArray[currentIndex + 1];
          }
          filledElements--;
          return 0;
      }
}
