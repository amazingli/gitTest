package afterClass;
/**
 * 
 * 	@author tedu
 *	������
 *	1.5���ؼ���
 *		1)���������Ҫ�õ��ؼ���abstract,���ڹؼ���classǰ,����������Ҫʹ�� Abstract ���� Base��ͷ
 *			public abstract class AbstractPlayer{}
 *		2)�����಻�ܱ�ʵ����,���ǿ���������
 *			new AbstractPlayer();//�����
 *		ͨ���ؼ��� extends ���̳г�����,�̳к�
 *			public class BasketBallPlayer extends AbstractPlayer{}
 *		3)���һ���ඨ����һ�����߶�����󷽷�,��ô���������ǳ�����
 *		�����ͨ���ж����˳�����: 
 *			���༶��������Ҫʹ�ùؼ���abstract; 
 *			�ڳ��󷽷�������,��ʾ���󷽷������಻�ǳ�����
 *		4)���������ͬʱ�������󷽷��;��巽��,Ҳ����ʲô������û��(���ǲ�����)
 *		5)���󷽷����������� ���� ʵ�ָ����ж���ĳ��󷽷�,����������� ���󷽷� abstract void play(){}
 *		����:
 *			void play(){
 *			...
 *			}
 *		���û��ʵ��,������������ �������ʵ�ֳ�������
 *	2.ʲôʱ��ʹ�ó�����
 *		�ؼ�����:�ӿ��Ƕ���Ϊ�ĳ���;	�������Ƕ�������(��Ա�ͷ���)���г���;		������:��ͨ��abstract���ε���ͨ��
 *		1)ϣ��һЩͨ�ù����ܱ�������ิ��,�������е���ͨ����,�������ֱ��ʹ��
 *		2)�ڳ������ж����API,������ĳ��󷽷���play(),��Ҫ��Ӧ����ȥʵ����չ
 *			public abstract class AbstractPlayer{
 *				abstract void play(){}//������ĳ��󷽷�
 *			}
 *			public class BasketBallPlayer extends AbstractPlayer{
 *				void play(){
 *				...��չʵ��BasketBallPlayer��ר���ķ���
 *				}
 *			} 
 *			public class FoottBallPlayer extends AbstractPlayer{
 *				void play(){
 *				...��չʵ��FootBallPlayer��ר���ķ���
 *				}
 *			} 
 *		3)����������������is-a �Ϳ����ó����� ,�������˶�Ա���˶�Ա
 *	3.����ʵ��
 *		һ���ļ�,��һ����ȡ�������ݶ�����,���մ�д�ķ�ʽ����Сд�ķ�ʽ
 */
public class Test5 {

}
