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
		//input: 字符串
		//output: int 数组
		//将输入字符串转为数组
		input = input.trim();//trim()方法:删除头尾空白字符串.
		input = input.substring(1, input.length()-1);//字符串去[],取第二到倒数第二个字符.
		if (input.length() == 0){
			return new int[0];
		}
		String[] parts  = input.split(",");//用','剪切字符串.
		int[] output = new int[parts.length];//初始化output
		for (int index=0;index<parts.length;index++){
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
			//Integer.valueOf返回值是Integer类型.
			//Integer.parseInt返回值是int类型.
		}
		return output;
	}
	
	public static ListNode stringToListNode(String input){
		//将input转为链表结构
		ListNode dummyRoot = new ListNode(0);//链表头节点初始化
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
		//BufferedReader 类
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
