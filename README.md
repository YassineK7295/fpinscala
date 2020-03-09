# Exercises From "Functional Programming in Scala"

* Exercise 2.1: Fibonacci sequence using recursion
* Exercise 2.2: Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function
* Exercise 2.3: Curry HOF
* Exercise 2.4: Uncurry HOF (INCOMPLETE)
* Exercise 2.5: Composition of a function

* Exercise 3.1: What will be the result of the following match expression?
* Exercise 3.2: Implement the function tail for removing the first element of a List.
* Exercise 3.3: Implement the function setHead for
                replacing the first element of a List with a different value.
* Exercise 3.4: Generalize tail to the function drop, which removes the first n elements from a list.
* Exercise 3.5: Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
* Exercise 3.6: Implement a function, init, that returns a List consisting of all but the last element of a List.
* Exercise 3.8: What happens when you execute foldRight(List(1, 2, 3), Nil:List[Int])(Cons(_, _))
* Exercise 3.9: Compute the length of a list using foldRight
* Exercise 3.10: Implement tail recursive foldLeft.
* Exercise 3.11: Implement sum, product, and length using foldLeft.
* Exercise 3.12: Implement reverse of list using fold.
* Exercise 3.13: Implement foldRight using foldLeft, in order for it to be tail recursive.
* Exercise 3.14: Implement append in terms of either foldLeft or foldRight.
* Exercise 3.15: Write a function that concatenates a list of lists into a single list.
* Exercise 3.16: Write a pure function that transforms a list of integers by adding 1 to each element.
* Exercise 3.17: Write a function that turns each value in a List[Double] to a String using d.toString.
* Exercise 3.18: Write a function map that generalizes modifying each element in a list while maintaining the structure of the list.
* Exercise 3.19: Write a function filter that removes elements from a list unless they satisfy a given predicate. Use it to remove odd numbers from an List[Int].
* Exercise 3.20: Write a function flatMap that works like a map except that the function given will return a list instead of a single result, and the list should be inserted into the final resulting list.
* Exercise 3.21: Use flatMap to implement filter.
* Exercise 3.22: Write a function that accepts two lists and constructs a new list by adding corresponding elements. For example, List(1,2,3) and List(4,5,6) become List(5,7,9).
* Exercise 3.23: Generalize the function you just wrote so that it’s not specific to integers or addition. Name your generalized function zipWith.
* Exercise 3.24: Hard: As an example, implement hasSubsequence for checking whether a List contains another List as a subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as subsequences, among others. You may have some difficulty finding a concise purely functional implementation that is also efficient. That’s okay. Implement the function however comes most naturally. We’ll return to this implementation in chapter 5 and hopefully improve on it. Note: Any two values x and y can be compared for equality in Scala using the expression x == y.
* Exercise 3.25: Write a function size that counts the number of nodes (leaves and branches) in a tree.
* Exercise 3.26: Write a function maximum that returns the maximum element in a Tree[Int]. (Note: In Scala, you can use x.max(y) or x max y to compute the maximum of two integers x and y.)
* Exercise 3.27: Write a function depth that returns the maximum path length from the root of a tree to any leaf.
* Exercise 3.28: Write a function map, analogous to the method of the same name on List, that modifies each element in a tree with a given function.
* Exercise 3.29: Generalize size, maximum, depth, and map, writing a new function fold that abstracts over their similarities. Reimplement them in terms of this more general function. Can you draw an analogy between this fold function and the left and right folds for List?
* Exercise 4.1: Implement Option/Some/None and the analogous list functions.
* Exercise 4.2: Use flatMap to implement the variance function.
* Exercise 4.3: Write a generic function map2 that combines two Option values using a binary function. If either Option value is None, then the return value is too.