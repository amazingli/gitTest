package afterClass;
/**
 * �����������
 * 
 * @author tedu
 * ����:��Ϊ����Ļ�����Ԫ;
 * ��:�ǹ���������ͼ,����������ɵ����ݺͲ�����Щ���ݵķ���.
 * 
 * ������������:��̬,��װ,�̳�
 * ��Candidate ��Interviewer Ϊ����Ϊ��
 *
 */
public class ObjectOriented {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate qiuqiu= new Candidate("����");
		/*
		 * ���Բ���������,��:
		 * 1.Candidate qiuqiu;
		 * 2.qiuqiu = new Candidate("����");
		 *  ����	1.qiuqiu��һ���������,û�������κζ���,���ǲ��ܳ�Ϊnull
		 *		2.qiuqiu = new Candidate("����");
		 *		�Ҳ���ʽ new Candidate("����")��ִ��,�ڶ��ϴ���һ��name Ϊ����Ķ���,��������ΪCandidate
		 *		        ���ʽ new Candidate("����") ��ֵ���´������������
		 *		���: �������ʽ������ ͨ��= ��ֵ�����������qiuqiu,qiuqiu�����Ƕ������,���Ƕ��������
		 */
		
		qiuqiu.deliverResume();
		//qiuqiu��Candidate ���͵Ķ�������,deliverResume��Candidate���͵ķ���;
		//���ö���ĳ�Ա����
		Interviewer interviewer = new Interviewer(qiuqiu);
		interviewer.receviveResume();
		interviewer.notifyInterview();
		//���������
		interviewer.getCandidate().setName("С��");
		//qiuqiu�� intervierwer.getCandidateָ��ͬһ������
		//�Ľ�����:interviewer.getCandidate Ӧ���Ƚ��п�¡
		System.out.println(qiuqiu.getName());
	}
	
}
