package afterClass;

public class Pig {
	private String color;
	
	public Pig(){
		
	}//�޲ι���
	public Pig(String color){
		this.color = color;
	}//����color����
	public void eat(){
		System.out.println("��");
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	//ͨ��getColor() ����ȡ״̬,setColor() ���޸�״̬
}
