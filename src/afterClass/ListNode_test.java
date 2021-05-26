package afterClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ListNode{
	int val;
	ListNode next;
	ListNode()	{}
	ListNode(int val) { this.val = val;}
	ListNode(int val, ListNode next){ this.val=val; this.next=next;}
}
public class ListNode_test {
	public static int[] stringToIntegerArray(String input){
		//input: �ַ���
		//output: int ����
		//�������ַ���תΪ����
		input = input.trim();//trim()����:ɾ��ͷβ�հ��ַ���.
		input = input.substring(1, input.length()-1);//�ַ���ȥ[],ȡ�ڶ��������ڶ����ַ�.
		if (input.length() == 0){
			return new int[0];
		}
		String[] parts  = input.split(",");//��','�����ַ���.
		int[] output = new int[parts.length];//��ʼ��output
		for (int index=0;index<parts.length;index++){
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
			//Integer.valueOf����ֵ��Integer����.
			//Integer.parseInt����ֵ��int����.
		}
		return output;
	}
	
	public static ListNode stringToListNode(String input){
		//��inputתΪ����ṹ
		ListNode dummyRoot = new ListNode(0);//����ͷ�ڵ��ʼ��
		ListNode ptr = dummyRoot.next;
		int[] nodeValues = stringToIntegerArray(input);
		for (int item : nodeValues){
			ptr.next = new ListNode(item);
			ptr = ptr.next;
		}
		return dummyRoot.next;
	}
	
	public static String listNodeToString(ListNode node){
		if (node == null){
			return "[]";
		}
		String res = "";
		while (node!=null){
			res += Integer.toString(node.val) +',';
			node = node.next;
		}
		return "["+res.substring(0, res.length()-2)+"]";
	}
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("welcome.");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader ��
		System.out.println(in.readLine());
		String line;
		while ((line = 	in.readLine()) != null){
			System.out.println(line);
			ListNode l1 = stringToListNode (line);
			String str = listNodeToString(l1);
			System.out.println(str);
			
			line = in.readLine();
			ListNode l2 = stringToListNode (line);
			str = listNodeToString(l2);
			System.out.println(str);
		}
	}

}
