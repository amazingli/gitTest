package afterClass;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Test_ArrayList {
	public static void main(String[] args) {
		/*	线性表	集合方面最常用的类
		 * 	
		 */
		ArrayList<String> alist = new ArrayList<String>();
		//创建一个 ArratList 尖括号限定ArrayList中元素的数据类型
		//或者使用
		//List<String> alist = new ArrayList<String>();
		//由于 ArrayList 实现了 List 接口，所以 alist 变量的类型可以是 List 类型；
		//new 关键字声明后的尖括号中可以不再指定元素的类型，因为编译器可以通过前面尖括号中的类型进行智能推断。
		
		//1.向ArrayList添加一个元素
		alist.add("小玩意儿");
		//2.添加到指定位置
		alist.add(1,"大玩意儿");
		//3.更新ArrayList中元素
		alist.set(1,"小玩意儿");
		//4.删除ArrayList中元素
		//remove(int index) 方法用于删除指定下标位置上的元素，
		//remove(Object o) 方法用于删除指定值的元素。
		alist.remove(1);
		alist.remove("小玩意儿");
		//final 关键字 不被继承 不可改变
		//5.查找ArrayList中
		//如果要正序查找一个元素，可以使用 indexOf() 方法；
		//如果要倒序查找一个元素，可以使用 lastIndexOf() 方法。
		alist.indexOf("小玩意儿");
	}
}
