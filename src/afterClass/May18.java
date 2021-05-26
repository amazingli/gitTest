package afterClass;
import java.util.*;
/**
 * 遍历ArrayList
 * 遍历Map
 * @author tedu
 *
 */

public class May18 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World.");
		list.add("hhhhhh");
		//第一种,使用for-each遍历
		for(String str:list){
		//for(int i=0;i<list.size();i++)
			System.out.println(str);
		}
		//第二种,链表变为数组后对内容进行遍历
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		//第三种,使用迭代器
		Iterator<String> ite = list.listIterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		//----------------------遍历Map-------------------------------
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		//第一种,普遍使用,二次取值
		System.out.println("通过Map.keySet来遍历Map的key跟value ");
		for(String key:map.keySet()){
			System.out.println("key="+key+",value="+map.get(key));
		}
		//第二种
		System.out.println("通过Map.entrySet使用interator遍历key跟value");
		Iterator<Map.Entry<String, String>> it= map.entrySet().iterator();
		//左边Interator 新建迭代器 it
		//右边entrySet()方法:返回映射中包含的映射的Set视图
		//Set视图:Map中所有键值对都被看做一个set集合
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			//Map.Entry是map的一个接口,用于表示一个键值映射项,Set<key, value>表示一个映射的Set
			//Map类没有继承Iterable接口,不能用map.iterator来遍历
			System.out.println("key=" + entry.getKey()+",value="+entry.getValue());
		}
		//第三种 大容量的时候推荐
		System.out.println("通过Map.entrySet来遍历key跟value");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		//第四种 
		System.out.println("通过Map.values()遍历所有的value,但是不遍历key");
		for (String str:map.values()){
			System.out.println("value="+str);
		}
	}
}
