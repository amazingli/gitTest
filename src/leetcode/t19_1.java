package leetcode;
/*
 * ��Ŀ:ɾ��������n�����;
 * ˼·:	1.����һ�εõ�����;
 * 		2.���ȼ�n����Ҫɾ����λ��;
 * 		3.���������ǰһ��λ��.
 * ʱ�临�Ӷ�:O(2n)
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
		//�õ�������len;
		if (len == 1 ){
			//ֻ��һ�����,��ɾ��һ������Ϊnull��;
			return null;
		}
		int rm_node_index = len - n;
		//���ɾ������ͷ�ڵ�
		if (rm_node_index ==0){
			return head.next;
		}
		//�ҵ���ɾ���ڵ��ǰһ�����
		h = head;
		for (int i=0; i<rm_node_index-1;i++){
			h=h.next;
		}
		h.next=h.next.next;
		return head;
	}
}
