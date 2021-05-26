package leetcode;
/*
 * ��Ŀ:ɾ��������n�����;
 * ˼·:	1.��������ָ��,��һ��ָ���ȱ���n��;
 * 		2.����ָ��ͬʱ����;
 * 		3.����һ��ָ��պñ�����ͷ,�ڶ���ָ��պ��ǵ�����n�����
 * ʱ�临�Ӷ�:O(2n)
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
		}//��dummy ͷ��� ��ʼ����1�ε������һ��,�ٱ���n�ε���n�����.
		while(first != null){
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		return dummy.next;
	}
}
