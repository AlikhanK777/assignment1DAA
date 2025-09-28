Architecture and Implementation
Metrics System
Tracks comparisons and recursion depth
Monitors algorithm performance characteristics
Ensures safe recursion patterns

Algorithm Implementations

MergeSort
Linear merge with temporary arrays
Recursive depth tracking
Standard divide-and-conquer approach

QuickSort
Partition-based sorting
Recursive implementation
In-place operations

QuickSelect
Median-of-medians pivot selection
Groups of 5 elements
Recursive selection

Closest Pair
Divide-and-conquer with strip checking
7-neighbor scan in sorted strip
Coordinate-based partitioning

Recurrence Analysis
MergeSort
Recurrence: T(n) = 2T(n/2) + O(n)
Method: Master Theorem Case 2
Result: Θ(n log n)
Analysis: Balanced division with linear merge work at each level

QuickSort
Recurrence: T(n) = T(k) + T(n-k-1) + O(n)
Method: Akra-Bazzi intuition
Result: Θ(n log n) average case
Analysis: Randomized pivot provides balanced partitions in expectation

QuickSelect
Recurrence: T(n) ≤ T(n/5) + T(7n/10) + O(n)
Method: Median-of-medians
Result: Θ(n)
Analysis: Grouping by 5 guarantees good pivot selection

Closest Pair
Recurrence: T(n) = 2T(n/2) + O(n)
Method: Master Theorem Case 2
Result: Θ(n log n)
Analysis: Linear strip checking with geometric properties


Cache Performance
QuickSort benefits from in-place operations
MergeSort has moderate cache performance due to merging
QuickSelect has excellent cache locality
Closest Pair has poor cache performance from coordinate processing

Memory Allocation
MergeSort creates temporary arrays for merging
QuickSort uses minimal extra memory
QuickSelect operates in-place
Closest Pair allocates temporary arrays for strips

Garbage Collection Impact
MergeSort has high GC impact from array allocations
QuickSort has low GC impact
QuickSelect has negligible GC impact
Closest Pair has moderate GC impact



Conclusion
The implementations successfully demonstrate classic divide-and-conquer algorithms with proper recursion control and performance characteristics. Theoretical analysis aligns closely with practical measurements, confirming the expected time and space complexities. Constant factors from memory hierarchy and allocation patterns have measurable impacts on real-world performance.
Randomized pivots would improve QuickSort worst-case behavior
