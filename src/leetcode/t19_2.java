package leetcode;
/*
 * 题目:删除倒数第n个结点;
 * 思路:	1.设置两个指针,第一个指针先遍历n次;
 * 		2.两个指针同时遍历;
 * 		3.当第一个指针刚好遍历到头,第二个指针刚好是倒数第n个结点
 * 时间复杂度:O(2n)
 */
import afterClass.ListNode;
public class t19_2 {
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;
		for (int i = 0; i <= n; i++){
			first = first.next;
		}//从dummy 头结点 开始遍历1次到链表第一个,再遍历n次到第n个结点.
		while(first != null){
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}
}
