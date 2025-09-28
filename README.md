Divide-and-Conquer Algorithms Report
 Architecture
Metrics Tracking: Counts comparisons and recursion depth

Recursion Control: Depth-limited with safe patterns

Memory: Optimized with in-place operations where possible

 Recurrence Analysis
MergeSort
T(n) = 2T(n/2) + O(n)
Master Theorem Case 2 → Θ(n log n)
Balanced division with linear merge work

QuickSort
T(n) = T(k) + T(n-k-1) + O(n)
Akra-Bazzi intuition → Θ(n log n) average
Randomized pivot ensures balanced splits

QuickSelect
T(n) ≤ T(n/5) + T(7n/10) + O(n)
Median-of-medians → Θ(n)
Groups of 5 guarantee good pivot selection

Closest Pair
T(n) = 2T(n/2) + O(n)
Master Theorem Case 2 → Θ(n log n)
Strip checking with 7 neighbors is linear


 Key Findings
Theory vs Practice Alignment
 Time complexity matches theoretical predictions

 Recursion depth grows as O(log n)

 Comparison counts align with expectations

Constant Factors
Cache: QuickSort benefits from in-place operations

GC: MergeSort affected by temporary arrays

Memory: QuickSelect most efficient (O(1) extra space)

 Conclusion
All algorithms implemented correctly with proper divide-and-conquer patterns. Performance measurements validate theoretical analysis. Constant factors show practical trade-offs between memory and speed.
