package LL;

import java.util.Stack;

 class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalinLL {
    public static boolean isPalindrome(ListNode1 head) {
        Stack<Integer> stack = new Stack<>();
        ListNode1 curr = head;

        // Push all node values onto the stack
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        // Reset curr to head and compare with stack values
        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) {
                return false;
            }
            curr = curr.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 2 -> 1
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode1(2);
        head.next.next = new ListNode1(2);
        head.next.next.next = new ListNode1(1);

        // Create an instance of the Solution class
        PalinLL solution = new PalinLL();

        // Test the isPalindrome method
        boolean result =PalinLL.isPalindrome(head);

        // Print the result
        if (result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
