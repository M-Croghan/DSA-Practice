# OVERVIEW: RECURSION
### INTRODUCTION
Recursion refers to when something is defined in terms of itself. Within the scope of computer science and programming
recursive functions allow us to solve problems where many similar actions are taken to get to our desired end result.
Typically, the iterative approach to problem-solving is what is first learned, where each step on the path to the 
solution is executed one after another until we finish. The truth is, any problem that can be solved iteratively can also
be solved recursively, but there exists trade-offs.

### BUILDING A RECURSIVE FUNCTION
A recursive function requires 2 main components:
* ***Base Case*** - A condition in which a return occurs and further recursion stops.
* ***Recursive Case*** - Distinguish when more work must be done and recursion is to continue.  

If a recursive function lacks a base case, there is no check on when recursion should stop. Thus, the function will
continue to call itself, stuck in an infinite loop, until memory capacity is exceeded. This is precisely what happens in
a ***stack overflow*** where the call stack is overloaded with function calls and no return is ever made.

### RECURSIVE VS. ITERATIVE
While we have two ways in which to approach solving problems that require identical tasks, choosing the right one for a 
given situation is important. Recursive algorithms that solve problems of size N typically maintain an exponential time 
complexity O(2^n). So while recursion solutions are clever, they aren't always the most optimal.  

Recursion and Iteration are opposed in their pros and cons:
- Recursion is typically cleaner and easier to read (DRY principle). Whereas iteration is typically not.
- Iteration is much more memory efficient, whereas recursion can involve a significantly large call stack.

### WHEN TO USE RECURSION
A general rule of thumb for choosing recursion is as follows:
- A problem can be divided into smaller sub-problems.
- Each instance of the sub-problem is identical.
- The solutions of each sub-problem can be combined to solve the overall problem itself.

This type of situation can be seen in:
- Divide & conquer style sorting (merge sort & quick sort)
- Tree & Graph Traversal
- When you're not sure how many iterations / cycles are needed to solve the problem.