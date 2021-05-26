package leetcode;
/*
 * 题目:删除倒数第n个结点;
 * 思路:	1.遍历一次得到长度;
 * 		2.长度减n就是要删除的位置;
 * 		3.遍历到结点前一个位置.
 * 时间复杂度:O(2n)
 */
class ListNode {
	int val;
	ListNode next;
	ListNode()	{}
	ListNode(int val) { this.val = val;}
	ListNode(int val, ListNode next){ this.val=val; this.next=next;}
}
public class t19_1 {
	public ListNode removeNthFromEnd(ListNode head, int n){
		int len = 0;
		ListNode h = head;
		while(h != null){
			h = h.next;
			len ++;
		}
		//得到链表长度len;
		if (len == 1 ){
			//只有一个结点,再删除一个结点就为null了;
			return null;
		}
		int rm_node_index = len - n;
		//如果删除的是头节点
		if (rm_node_index ==0){
			return head.next;
		}
		//找到被删除节点的前一个结点
		h = head;
		for (int i=0; i<rm_node_index-1;i++){
			h=h.next;
		}
		h.next=h.next.next;
		return head;
	}
}
