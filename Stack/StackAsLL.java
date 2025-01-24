package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Stack {
    Node top;  // The top of the stack

    // Constructor to initialize an empty stack
    Stack() {
        this.top = null;
    }

    // Push method to add an element to the stack
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;  // Link the new node to the current top
        top = newNode;  // Update the top to the new node
        System.out.println(data + " pushed to stack");
    }

    // Pop method to remove and return the top element of the stack
    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;  // Return a sentinel value for empty stack
        }
        int poppedData = top.data;  // Get the top element
        top = top.next;  // Update the top to the next node
        return poppedData;
    }

    // Peek method to view the top element without removing it
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;  // Return a sentinel value for empty stack
        }
        return top.data;  // Return the top element
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Print the stack elements (for debugging purposes)
    void printStack() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackAsLL {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);  // Pushing elements
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek());  // Peek at top element

        stack.printStack();  // Print stack elements

        System.out.println(stack.pop() + " popped from stack");  // Pop element
        stack.printStack();  // Print stack elements after pop

        System.out.println("Top element is " + stack.peek());  // Peek at top element after pop
    }
}

