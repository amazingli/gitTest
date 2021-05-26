package afterClass;

import java.util.Arrays;

class Arraylist<E>{
	//Arraylist����������ͱ�����E.
	private Object[] elementData;
	private int size = 0;
	/*
	 * һ���������Ǿ���һ���������ͱ�������.
	 */
	public <T> T[] toArray(T[] a){
		//<T>:��ʾ���Ǹ����ͷ���.
		//��һ��T[]:������������.
		//�ڶ���T[]:������������
		//��һ���Ƿ��͵����ж��巺�ͷ���
		return (T[]) Arrays.copyOf(elementData, size, a.getClass());
	}
	public Arraylist(int initialCapacity){
		this.elementData = new Object[initialCapacity];
	}
	public boolean add(E e){
		elementData[size++] = e;
		return true;
	}
	E get(int index){
		return (E) elementData[index];
	}
	E elmentData(int index){
		return (E) elementData[index];
	}
}

public class May_25 {
//���շ��ͱ�׼���Arraylist
	public static void main(String[] args) {
		Arraylist<String> list = new Arraylist<String>(4);
		//�þ��������(String)�滻 ���ͱ���E ��ʵ����������;
		
		//���÷��ͷ���
		list.add("lzh");
		list.add("lzh");
		list.add("lzh");
		list.add("lzh");
		String [] strs = new String[4];
		strs = list.toArray(strs);
		//���÷��ͷ���
		for(String str: strs){
			System.out.println(str);
		}
		//list.add(new Date());
		//String str = list.get(0);
		
	}

}
