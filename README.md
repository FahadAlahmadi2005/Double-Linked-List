# Doubly Linked List Implementation in Java

A robust and efficient implementation of a **Doubly Linked List** (DLL). Unlike a singly linked list, this structure allows for bidirectional traversal (forward and backward) by maintaining references to both the next and previous nodes.

---

## 🚀 Standardized Features

This implementation follows our series' **Standardized Terminology** for consistent software design:

* **`isEmpty()`**: Checks if the list is empty (Standardized from `empty`).
* **`display()`**: Prints all elements in the list (Standardized from `displayList`).
* **Insertion Logic**:
    * `insertFirst(E data)`: Efficiently adds a node at the head.
    * `insertLast(E data)`: Appends a node at the tail using a dedicated `tail` reference.
    * `insertInBetween(E data, E node1, E node2)`: Precise insertion between two specific values.
* **Deletion Logic**:
    * `deleteFirst()` & `deleteLast()`: Managed removal from both ends.
    * `deleteNode(E data)`: Removes a specific element while maintaining pointer integrity.

---

## 🧠 Advanced Recursive Operations

This version includes powerful recursive methods for data analysis, demonstrating advanced algorithmic thinking:
* **`sumRecursion()`**: Calculates the total sum of elements (for Integer lists).
* **`maxRecursion()`**: Finds the maximum value within the list recursively.
* **`searchRecursion(int data)`**: A recursive search algorithm to verify the existence of a value.

---

## 📊 Complexity Analysis

| Operation | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| **Insert (Head/Tail)** | $O(1)$ | $O(1)$ |
| **Delete (Head/Tail)** | $O(1)$ | $O(1)$ |
| **Traversal (Forward/Backward)** | $O(n)$ | $O(1)$ |
| **Recursive Sum/Max** | $O(n)$ | $O(n)$ (Due to call stack) |

## 📄 License
This project is open-source and available under the [MIT License](LICENSE).
