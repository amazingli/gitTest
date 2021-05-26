package afterClass;
import java.util.*;
/**
 * ����ArrayList
 * ����Map
 * @author tedu
 *
 */

public class May18 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World.");
		list.add("hhhhhh");
		//��һ��,ʹ��for-each����
		for(String str:list){
		//for(int i=0;i<list.size();i++)
			System.out.println(str);
		}
		//�ڶ���,�����Ϊ���������ݽ��б���
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		//������,ʹ�õ�����
		Iterator<String> ite = list.listIterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		//----------------------����Map-------------------------------
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		//��һ��,�ձ�ʹ��,����ȡֵ
		System.out.println("ͨ��Map.keySet������Map��key��value ");
		for(String key:map.keySet()){
			System.out.println("key="+key+",value="+map.get(key));
		}
		//�ڶ���
		System.out.println("ͨ��Map.entrySetʹ��interator����key��value");
		Iterator<Map.Entry<String, String>> it= map.entrySet().iterator();
		//���Interator �½������� it
		//�ұ�entrySet()����:����ӳ���а�����ӳ���Set��ͼ
		//Set��ͼ:Map�����м�ֵ�Զ�������һ��set����
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			//Map.Entry��map��һ���ӿ�,���ڱ�ʾһ����ֵӳ����,Set<key, value>��ʾһ��ӳ���Set
			//Map��û�м̳�Iterable�ӿ�,������map.iterator������
			System.out.println("key=" + entry.getKey()+",value="+entry.getValue());
		}
		//������ ��������ʱ���Ƽ�
		System.out.println("ͨ��Map.entrySet������key��value");
		for(Map.Entry<String, String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		//������ 
		System.out.println("ͨ��Map.values()�������е�value,���ǲ�����key");
		for (String str:map.values()){
			System.out.println("value="+str);
		}
	}
}
