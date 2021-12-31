# OVERVIEW: SORTING
## INTRODUCTION
It is important to remember that ***no perfect sorting algorithm exists*** and that choosing the optimal one comes down 
to the situation. It may never be necessary to implement a sorting algorithm on your own as there are numerous frameworks
and libraries available to offer a variety of options. However, it is important to know and understand how a particular 
language or library implements a sort method as they all are not the same. Reading the documentation is key when using a
built-in sort method.

## ASPECTS OF SORTING
**Types of Sorting**
- Comparison - The sorting of an element / item / data compared to another. (ex. Comparing two numbers to find the largest).
- Distribution - The sorting of an element / item / data based on an attribute. (ex. Comparing objects based on color).
- Non-Comparison - Radix & Counting Sort

**Stability**  
When sorting data with two individual factors, stability refers to the algorithms' ability to preserve the order of the first sort, after the 
second sort is completed. As an example, if one were to be sorting a deck of cards numerically and then by suit, the result of the end of sorting
should be cards that are organized by suit (spades, hearts, diamonds, clubs) and within each group still maintain their numerical order (Ace, 2, 3, 4... etc.).

**Space Complexity**  
Sometimes sorting may involve the creation of additional data structures and this require more memory. Sorting can be:
- **In-Place**: The space the algorithm takes is predictable and not dependent on an input.
  - O(1) | O(log n)
- **Out-of-Place**: The algorithm uses an extra array or move to sort the values.
  - O(n) | O(n^2)

**Choosing the Best Sort**  
Determining the best sort to use can be tricky. It's important to consider:
* Time & Space Complexity (Best, Average, Worst Cases)
* Stability
* Size & Structure of the Data

### HOW WOULD YOU SORT...
1 - Sort 10 schools around your house by distance: insertion

2 - eBay sorts listings by the current Bid amount: radix / counting

3 - Sport scores on ESPN: quick

4 - Massive database (can't fit all into memory) needs to sort through past year's user data: merge

5 - Almost sorted Udemy review data needs to update and add 2 new reviews: insertion

6 - Temperature Records for the past 50 years in Canada: radix (if no decimals) quick sort

7 - Large username database needs to be sorted. Data is very random. merge if enough memory

8 - You want to teach sorting for the first time: bubble / selection sort

### RESOURCES
[Subjective Interview Questions on Bubble Sort Set 1](https://hoven-in.appspot.com/Home/Data-Structures/Data-Structure-Interview-Questions/interview-questions-on-bubble-sort-01.html)  
[Programming with JS: Insertion Sort](https://hackernoon.com/programming-with-js-insertion-sort-1316df8354f5)  
[Comparison Sorting Algorithms](https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html)
[Merge Sort Algorithm Lecture](https://www.youtube.com/watch?v=TzeBrDU-JaY)  
[Quicksort Algorithm Lecture](https://www.youtube.com/watch?v=COk73cpQbFQ&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U&index=9)  
[Radix Sort Implementation](https://github.com/trekhleb/javascript-algorithms/tree/master/src/algorithms/sorting/radix-sort)  
[]()  
[]()  