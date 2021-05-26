package afterClass;
import java.util.LinkedList;;

public class LinkedList_test1 {
	public static void main(String[] args) {
		//1.创建LinkedList
		LinkedList<String> sites = new LinkedList<>();
		//2.添加元素
		sites.add("alibaba");
		sites.add("xiaomi");
		sites.add("tencent");
		sites.add("huawei");
		sites.add("baidu");
		//
		/* 添加链表元素,add会调用linkLast()方法.
		void linkLast(E e) {
		    final LinkedList.Node<E> l = last;//保存链尾
		    final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
		    //新建节点node,l:插入链表的链尾,e:插入元素,null:新节点的值为空.
		    last = newNode;//链尾指向新节点(新节点赋值给last).
		    if (l == null)//链尾空,即链表为空,则创建新的链表,并将链头指向第一个新插入的元素.
		        first = newNode;
		    else//链尾存在,即链表不为空,则将新节点连接到链尾后.
		        l.next = newNode;
		    size++;
		    modCount++;//modcount:链表修改次数
		}
		 * 
		 */
		//3.更新元素set()
		sites.set(0, "blibaba");
		//set()源码;
		/*
		 * public E set(int index,E element){
		 *  	checkElementIndex(index);//检查下标是否越界.
		 *  	LinkedList.Node<E> x = node(index);//根据下标
		 *  	E oldVal = x.item;
		 *  	x.item = element;
		 *  	return oldVal;//替换,并将旧的值返回.
		 * }
		 * LinkedList.Node<E> node(int index){
		 * ...
		 * 	会对下标进行初步判断,如果靠近末端,就重最后开始遍历
		 * }
		 */
		//4.删除元素remove();
		//5.正序查找indexOf();
	}
}
