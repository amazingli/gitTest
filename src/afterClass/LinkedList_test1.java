package afterClass;
import java.util.LinkedList;;

public class LinkedList_test1 {
	public static void main(String[] args) {
		//1.����LinkedList
		LinkedList<String> sites = new LinkedList<>();
		//2.���Ԫ��
		sites.add("alibaba");
		sites.add("xiaomi");
		sites.add("tencent");
		sites.add("huawei");
		sites.add("baidu");
		//
		/* �������Ԫ��,add�����linkLast()����.
		void linkLast(E e) {
		    final LinkedList.Node<E> l = last;//������β
		    final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
		    //�½��ڵ�node,l:�����������β,e:����Ԫ��,null:�½ڵ��ֵΪ��.
		    last = newNode;//��βָ���½ڵ�(�½ڵ㸳ֵ��last).
		    if (l == null)//��β��,������Ϊ��,�򴴽��µ�����,������ͷָ���һ���²����Ԫ��.
		        first = newNode;
		    else//��β����,������Ϊ��,���½ڵ����ӵ���β��.
		        l.next = newNode;
		    size++;
		    modCount++;//modcount:�����޸Ĵ���
		}
		 * 
		 */
		//3.����Ԫ��set()
		sites.set(0, "blibaba");
		//set()Դ��;
		/*
		 * public E set(int index,E element){
		 *  	checkElementIndex(index);//����±��Ƿ�Խ��.
		 *  	LinkedList.Node<E> x = node(index);//�����±�
		 *  	E oldVal = x.item;
		 *  	x.item = element;
		 *  	return oldVal;//�滻,�����ɵ�ֵ����.
		 * }
		 * LinkedList.Node<E> node(int index){
		 * ...
		 * 	����±���г����ж�,�������ĩ��,�������ʼ����
		 * }
		 */
		//4.ɾ��Ԫ��remove();
		//5.�������indexOf();
	}
}
