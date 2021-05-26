package afterClass;
/**
 * 关于面向对象
 * 
 * @author tedu
 * 对象:作为程序的基本单元;
 * 类:是构造对象的蓝图,里面包含若干的数据和操作这些数据的方法.
 * 
 * 面向对象的特性:多态,封装,继承
 * 以Candidate 和Interviewer 为例作为类
 *
 */
public class ObjectOriented {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate qiuqiu= new Candidate("球球");
		/*
		 * 可以拆成两半理解,即:
		 * 1.Candidate qiuqiu;
		 * 2.qiuqiu = new Candidate("球球");
		 *  其中	1.qiuqiu是一个对象变量,没有引用任何对象,但是不能称为null
		 *		2.qiuqiu = new Candidate("球球");
		 *		右侧表达式 new Candidate("球球")先执行,在堆上创建一个name 为球球的对象,对象类型为Candidate
		 *		        表达式 new Candidate("球球") 的值是新创建对象的引用
		 *		左侧: 将左侧表达式的引用 通过= 赋值给左侧对象变量qiuqiu,qiuqiu不再是对象变量,而是对象的引用
		 */
		
		qiuqiu.deliverResume();
		//qiuqiu是Candidate 类型的对象引用,deliverResume是Candidate类型的方法;
		//调用对象的成员方法
		Interviewer interviewer = new Interviewer(qiuqiu);
		interviewer.receviveResume();
		interviewer.notifyInterview();
		//神奇的事情
		interviewer.getCandidate().setName("小明");
		//qiuqiu跟 intervierwer.getCandidate指向同一个对象
		//改进方法:interviewer.getCandidate 应该先进行克隆
		System.out.println(qiuqiu.getName());
	}
	
}
