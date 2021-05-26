package afterClass;

import java.util.Arrays;

class Arraylist<E>{
	//Arraylist类引入的类型变量是E.
	private Object[] elementData;
	private int size = 0;
	/*
	 * 一个泛型类是具有一个或多个类型变量的类.
	 */
	public <T> T[] toArray(T[] a){
		//<T>:表示这是个泛型方法.
		//第一个T[]:方法返回类型.
		//第二个T[]:方法参数类型
		//在一个非泛型的类中定义泛型方法
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
//按照泛型标准设计Arraylist
	public static void main(String[] args) {
		Arraylist<String> list = new Arraylist<String>(4);
		//用具体的类型(String)替换 类型变量E 来实例化泛型类;
		
		//调用泛型方法
		list.add("lzh");
		list.add("lzh");
		list.add("lzh");
		list.add("lzh");
		String [] strs = new String[4];
		strs = list.toArray(strs);
		//调用泛型方法
		for(String str: strs){
			System.out.println(str);
		}
		//list.add(new Date());
		//String str = list.get(0);
		
	}

}
