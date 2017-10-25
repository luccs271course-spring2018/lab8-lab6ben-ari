# Answers

### 1. Why does FixedArrayQueue require an explicit constructor?

FixedArrayQueue requires an explicit constructor because the fixed capacity of the queue needs to be initialized.

### 2. What happens when you offer an item to a full FixedArrayQueue?

When you offer an item to a full FixedArrayQueue the method will return a boolean "false" and no item will be added to the queue.

### 3. What happens when you poll an empty FixedArrayQueue?

When you poll() an empty FixedArrayQueue it returns a null value because of the fact that there is no value to "pull" from the queue

### 4. What is the time and (extra) space complexity of each of the FixedArrayQueue methods?

offer() is O(1)

peek() is O(1)

poll() is O(1)

size() is O(1)

isEmpty() is O(1)

asLis() is O(n)
