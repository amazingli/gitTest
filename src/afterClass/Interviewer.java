package afterClass;

public class Interviewer {
	
	private Candidate candidate;
	//��Ա����
	public Interviewer(Candidate candidate){
		this.candidate = candidate;
	}
	//���캯��
	public void receviveResume(){
		System.out.println("�յ�,"+getCandidate().getName()+"����");
	}
	public void notifyInterview(){
		System.out.println("֪ͨ,"+getCandidate().getName()+"����");
	}
	//�������з���
	public Candidate getCandidate(){
		//return candidate;
		Candidate candidate = new Candidate(this.candidate.getName());
		return candidate;
		//this :�����Ա�����;ֲ�����;
		//this.��������:���ʱ����Ա����
		//this():���ʱ��๹�췽��,()�п����в���,����в��������вι���
	}
	public void setCandidate(Candidate candidate){
		this.candidate=candidate;
	}
	//settter��getter;
}
