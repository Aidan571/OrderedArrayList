# OrderedArrayList
For NoNullArrayList, check if what you're adding is a null value,
if it is, throw the IllegalArgumentException. If what you're adding
is not a null value, the NoNullArrayList should act as ArrayList normally does.
A misconception that we had was wether or not we were checking what is being
added or what is in the ArrayList when it is initialized. We did not have any
alternate methods once we established what we were supposed to be doing.

For OrderedArrayList, using a for loop and compareTo, check to see what index
the object you are adding fits in and then use the super add method, the
one with the index, to put the object in the correct location. A misconception
we had was wether or not we were ordering existing arrays or only creating new
OrderedArrayLists. An alternate method we thought of would be to use greater
than or less than to compare the objects instead of compareTo.
