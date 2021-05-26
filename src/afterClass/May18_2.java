package afterClass;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList:
 * 	1.可以动态修改,没有固定大小限制,可以增加或者删除元素.
 * 	2.ArrayList 继承自AbstractList 并实现了List接口.
 * @author tedu
 *
 */
public class May18_2 {
	public static void main(String[] args) {
		//初始化
		ArrayList<String> sites = new ArrayList<String>();
		//ArrayList <E> objectName = new ArrayList<>();
		//E:泛型数据类型,设置objectName的数据类型,只能为引用数据类型
		//objectName:对象名
		//增删改查
		//1.增加
		sites.add("baidu");
		sites.add("alibaba");
		sites.add("netease");
		System.out.println(sites);
		//2.访问
		System.out.println(sites.get(2));//访问第三个元素
		//3.修改
		sites.set(2, "bytedance");
		System.out.println(sites.get(2));
		//4.排序
		Collections.sort(sites);
		for(String i:sites){
			System.out.println(i);
		}
	}
}
