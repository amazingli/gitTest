package afterClass;
/**
 * ���ڷ�װ
 * @author tedu
 *
 */
public class Test4 {
/*
 * Ĭ�������ÿ��Java�඼�пյĹ��췽��,����ͨ��new �ؼ�������������췽������һ��	����
 * Ҳ������Ӵ��εĹ��췽��,�����޲ι��췽������ʧ.
 * 
 * ʹ���޲ι��촴���Ķ���(��������)Ĭ��Ϊnull,����ǻ������Ͷ�Ӧ��Ĭ��ֵ.
 * ����Ȩ�����η�:public private protect �� default ȱʡ
 * 		һ����ֻ����public ����default
 * 		public:�������Ա����а��µ�����з���
 * 		default:���Ա�ͬһ�����µ���������з���
 * 		private:����������Ĺ��췽��.�ֶκͷ���,ֻ�ܱ���ǰ�����
 * 		protected:����������Ĺ��췽��,�ֶ�,����,���Ա�ͬһ������������з���,���ߵ�ǰ�������
 */
	public static void main(String[] args) {
		Pig pig = new Pig();
		//�޲ι���
		Pig pigWhite = new Pig("White");
		Pig pigBlack = new Pig("Black");
		pig.eat();
		pigBlack.setColor("DeepBlack");
		System.out.println(pigBlack.getColor());
	}
}
