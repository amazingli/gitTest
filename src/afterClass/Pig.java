package afterClass;

public class Pig {
	private String color;
	
	public Pig(){
		
	}//无参构造
	public Pig(String color){
		this.color = color;
	}//带参color构造
	public void eat(){
		System.out.println("吃");
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	//通过getColor() 来获取状态,setColor() 来修改状态
}
