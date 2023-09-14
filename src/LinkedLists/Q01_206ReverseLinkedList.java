package LinkedLists;

import java.util.*;

public class Q01_206ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        return solve(head,prev);
    }

    public ListNode solve(ListNode head, ListNode prev){
        if(head == null){
            return prev;
        }
        ListNode next = head.next;
        head.next = prev;
        return solve(next,head);
    }	
}
