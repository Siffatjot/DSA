//https://leetcode.com/problems/copy-list-with-random-pointer/description/
package QuestionOfTheDay;
import java.util.*;
public class Q02_138CopyListwithRandomPointer {
	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	HashMap<Node, Node> hm = new HashMap<>();

	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}

		return solve(head);
	}

	public Node solve(Node head) {
		if (head == null) {
			return null;
		}

		Node temp = new Node(head.val);
		hm.put(head, temp);
		temp.next = solve(head.next);

		if (head.random != null) {
			temp.random = hm.get(head.random);
		}

		return temp;
	}
}
