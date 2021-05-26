package leetcode;
/*
 * 	题目:将一个链表,每k个倒置,最后一组不足k个就不倒置.
 *	思路:1.循环,将k个结点取下来
 *		2.倒置再放回去,循环
 *		3.最后一组如果不到k个,不做处理
 *	变量:
 *
 */	
class ListNode {
	int val;
	ListNode next;
	ListNode()	{}
	ListNode(int val) { this.val = val;}
	ListNode(int val, ListNode next){ this.val=val; this.next=next;}
}

public class t25_1 {

}
