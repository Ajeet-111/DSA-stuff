1.
-> Hash Functions
- it simple takes an arbitrary size key as an input and provides fixed size value or Index as an output

-> Modular Hash Function
- it takes key and size as input and returns reminder by doing key/size
- the reminder is used as an index to store the key in an array of provided size
- index = h(key) = key % size

2.
-> Hash Table
- it is a generalized form of an array
- it stores the data in form of key-value pair
- it converts key to an index using hash function

- operations in hash table:
    - put(key, value)
    - get(key)
    - remove(key)
    - O(1) run time.

- we use hash map & hash set to store stuff.