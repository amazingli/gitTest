package afterClass;

import java.util.Scanner;

/**
 * 造轮子 list
 * 顺序表
 * @author tedu
 *
 */
public class Test_ArrayList2 {
	public static void main(String[] args) {
		InitList aList = new InitList(5);
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=5;i++){
			int j = input.nextInt();
			System.out.println(i);
			aList.listInsert(i, j);
		}
		String s = aList.traverseList();
		System.out.println(s);
	}
}

class InitList{
	private int length=0;
	
	private int [] list;
	//构造函数
	public InitList(int max){
		this.list = new int[max];
		this.length = 0;
	}


	//清空
	public void clearList(){
		this.length = 0;
	}
	//返回顺序表中指定位置元素的值
	public int getElem(int site){
		int ret=0;//新建用于存储
		ret = this.list[site-1];
		return ret;
	}
	//插入元素
	public int listInsert(int site,int value){
		//从顺序表的最后一个开始,逐个向后移一位,直到要插入元素的位置,为插入元素腾出空间
		if (site==5){
			//5是最后  一个,数组最大长度.
			this.list[site-1]=value;
			this.length++;
			return 1;
		}
		for (int i = this.length;i>=site-1;i--){
			this.list[i+1] = this.list[i];
		}
		this.list[site-1] = value;
		this.length++;
		return 1;
	}
	//遍历顺序表
	public String traverseList(){
		String s="";
		for (int i = 0;i<=this.length-1;i++){
			s = s+this.list[i]+".";
		}
		return s;
	}
}


