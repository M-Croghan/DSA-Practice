# DISTRIBUTION SORTING - (Bucket Sort, Radix Sort)

## Bucket Sort
Bucket sort tackles sorting by grouping elements into ***buckets***. Distribution sorting is the most viable
when you are working with values that are _dense_ enough to create ranges of values. In addition to this, a number of
buckets are required to adequately cover these ranges. A good rule of thumb is to take the square root of the number of
items you have to sort, and use this number as the required number of buckets. An example of this is as follow:  

int[] array = {1,5,2,19,20,17,11,14,9,6,3,16,12,7} - 14 items  
Sqrt(14) = 4 - (Four buckets)

Bucket 1: 0 - 5  
Bucket 2: 6 - 10  
Bucket 3: 11 - 15  
Bucket 4: 16 - 20

Bucket Sort in Action:
- Phase 1: Sort each element into buckets
- Phase 2: Sort each bucket
- Phase 3: Sequentially add each bucket back together.

Bucket sort can run into problems if the values are TOO dense (i.e.: 1,1,1,2,2,3,3).
***Complexity:***
- ***Time:*** O(n^2)
- ***Space:*** O(n)


## Radix Sort
Radix sort operates only on integers. Its approach to sorting uses the digits of the integers themselves to execute the sort.
This may occur on either the most or least significant digit of the number, sorts the elements base on that digits, and then moves
onto the next digits. If a number doesn't have a digit in the place that is being sorted on, the number 0 fills the void.

Example:

int[] = {102, 98, 435, 70} <- Begin by sorting on the least significant digit (the ones place).  

Becomes: {70, 102, 435, 98} <- Then, sort this on the tens place.  

Becomes: {102, 435, 70, 98} <- Finally, sort on the hundreds place. 

Becomes: {070, 098, 102, 435} <- Zeros have filled the empty hundreds place as visual aid, the array is now sorted!


***Complexity:***
- ***Time:*** O(nk)
- ***Space:*** O(n + k)