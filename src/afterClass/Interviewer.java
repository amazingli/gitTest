package afterClass;

public class Interviewer {
	
	private Candidate candidate;
	//成员变量
	public Interviewer(Candidate candidate){
		this.candidate = candidate;
	}
	//构造函数
	public void receviveResume(){
		System.out.println("收到,"+getCandidate().getName()+"简历");
	}
	public void notifyInterview(){
		System.out.println("通知,"+getCandidate().getName()+"面试");
	}
	//两个公有方法
	public Candidate getCandidate(){
		//return candidate;
		Candidate candidate = new Candidate(this.candidate.getName());
		return candidate;
		//this :区别成员变量和局部变量;
		//this.方法名称:访问本类成员方法
		//this():访问本类构造方法,()中可以有参数,如果有参数就是有参构造
	}
	public void setCandidate(Candidate candidate){
		this.candidate=candidate;
	}
	//settter和getter;
}
