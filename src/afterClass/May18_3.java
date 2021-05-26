package afterClass;

import java.util.ArrayList;

/**
 * ArrayList源码赏析
 * @author tedu
 *
 */
public class May18_3 {
	public static void main(String[] args) {
		//创建ArrayList
		ArrayList<String> alist =new ArrayList<>();
		//更简单写法:
		//List<String> alist = new ArrayList<>();
		//ArrayList 实现了List的接口,所以alist的变量类型可以是List类型.
		//new 关键字声明后的尖括号可以不指定元素类型,编译器会根据前面的元素类型推断
		//添加元素add()
		alist.add("yi");
		//源码关键:空间不够若添加元素时会调用grow()方法来扩容
		alist.add(0, "er");
		//添加元素到特定位置
		//源码关键:调用system.arraycopy将数组往后复制一格
		//更新元素set()
		
	}
}
