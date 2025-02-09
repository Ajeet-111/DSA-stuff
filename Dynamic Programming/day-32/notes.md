-> dynamic programming is just a fancy way to say           remembering stuff to save time later
        : Jonathan Paulson

- it is a technique in which a complex problem is solved by 
1. Breaking it into smaller sub-problems
2. Solving those sub-problems and simply storing their results
3. Re-use those stored results if sub-problems occurs/overlaps again.
4. finally using smaller problems build up solution

-> It is mainly an optimization over recursion.
- DP = Recursion + Memorization
- we don't solve the same thing again, we just store it and use it

-> Requirements
- optimal sub-structure
- overlapping sub-problems

-> Approaches
- bottom-up Approach : tabulation method
- top-down Approach : Memoriztaion