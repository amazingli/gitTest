package afterClass;

public class Candidate {
		/*
		 * ����ĸ���Ҫ����:
		 * 1.��Ա����(��,�ֶ�,����) name;
		 * 2.��Ա����������(getter/setter) getName /setName;
		 * 3.���췽��(������) Candidate;
		 * 4.��ͨ����
		 * 
		 * ��ķ�������˳��:���췽��>
		 * 				����public/����protect����>
		 * 				˽��private����>
		 * 				getter/setter����
		 */
		private String name;
		//private int age;
		/* ��Ա����,��������public����,��private����.
		 * �����Ҫ������̳�,����protected����.
		 * Ϊʲô����public?
		 * 	1.���ַ�װ˼��,����������Ϊ����
		 * 	2.��װ�ô�
		 * 		1)�������ʵ��ϸ��
		 * 		2)ʹ������ͨ�������ƶ��ķ���(getter/setter)����������
		 * 		���������Ʒ���,���ƶԳ�Ա�����Ĳ��������.
		 * 		3)�����޸�,��ǿ�����ά���Ժͽ�׳��.
		 * 		4)��ߴ��밲ȫ�Ժ͹淶��.
		 * 		5)ʹ������Ӿ߱��ȶ��ԺͿ���չ��.
		*/
		public Candidate(String name){
			this.name=name;
		}
		//���췽��,��������ıؾ�֮·,ÿ���඼������һ�����췽��
		public void deliverResume(){
			System.out.println("������");
		}
		//���з���,���ú�ά��������ĵķ���
		//��������,ģ�����ģʽ�µĺ��ķ���
		//˽�з���,ֻ�Ա���ɼ�,һ�㲻��Ҫ�ر����
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name=name;
		}
//		public void setAge(int age){
//			if (age>=0){
//				this.age=age;
//			}
//			//Ϊ�˷�ֹ��������Ϊ���Ĵ��󣬿��Զ������з�װ��Ҳ����˽�л���
//			//�� setter �����ж���������ж�
//		}
		//getter/setter����
		//setter �����������Ա�������Ʊ���һ��,����this.��Ա��=������.
}
