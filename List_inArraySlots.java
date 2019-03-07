/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int[] intArray; // potentially change name later
    private int filledElements;
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intArray = new int[10];
        filledElements = 0;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return intArray.length;
    }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
        String ints = "";
        for (int element : intArray) {
            ints += element + ",";
        }
        return ints;
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         intArray[filledElements] = value;
         filledElements++;
		 if (filledElements == intArray.length - 1)
				expand();
         return true;
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     private void expand() {
		 intArray = new int[this.intArray.length * 2];
         System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     }
}
