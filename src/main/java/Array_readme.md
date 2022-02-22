When to Use In-Place Array Operations
It's important to know when to use in-place Array operations—they might not always be the way to go.

For example, if we'll need the original array values again later, then we shouldn't be overwriting them. In these cases, it's best to create a copy to work with, or to simply not use in-place techniques. It's important to be very careful when working with existing code that somebody else has written. If other code is depending on the original Array to work, then you might completely break the program if you modify that Array!

In-place operations are valuable when appropriate because they reduce the space complexity of an algorithm. Instead of requiring O(N)O(N) space, we can reduce it down to O(1)O(1).

