package afterClass;
/**
 * 
 * 	@author tedu
 *	抽象类
 *	1.5个关键点
 *		1)定义抽象类要用到关键字abstract,放在关键字class前,抽象类名字要使用 Abstract 或者 Base开头
 *			public abstract class AbstractPlayer{}
 *		2)抽象类不能被实例化,但是可以有子类
 *			new AbstractPlayer();//会出错
 *		通过关键字 extends 来继承抽象类,继承后
 *			public class BasketBallPlayer extends AbstractPlayer{}
 *		3)如果一个类定义了一个或者多个抽象方法,那么这个类必须是抽象类
 *		如果普通类中定义了抽象类: 
 *			在类级别上提醒要使用关键字abstract; 
 *			在抽象方法级别上,提示抽象方法所在类不是抽象类
 *		4)抽象类可以同时声明抽象方法和具体方法,也可以什么方法都没有(但是不建议)
 *		5)抽象方法派生的子类 必须 实现父类中定义的抽象方法,如抽象类中有 抽象方法 abstract void play(){}
 *		子类:
 *			void play(){
 *			...
 *			}
 *		如果没有实现,编译器会提醒 子类必须实现抽象类型
 *	2.什么时候使用抽象类
 *		关键概念:接口是对行为的抽象;	抽象类是对整个类(成员和方法)进行抽象;		具体类:不通过abstract修饰的普通类
 *		1)希望一些通用功能能被多个子类复用,抽象类中的普通方法,子类可以直接使用
 *		2)在抽象类中定义好API,抽象类的抽象方法如play(),需要对应子类去实现扩展
 *			public abstract class AbstractPlayer{
 *				abstract void play(){}//抽象类的抽象方法
 *			}
 *			public class BasketBallPlayer extends AbstractPlayer{
 *				void play(){
 *				...扩展实现BasketBallPlayer类专属的方法
 *				}
 *			} 
 *			public class FoottBallPlayer extends AbstractPlayer{
 *				void play(){
 *				...扩展实现FootBallPlayer类专属的方法
 *				}
 *			} 
 *		3)如果父类与子类符合is-a 就可以用抽象类 ,如篮球运动员是运动员
 *	3.具体实例
 *		一个文件,有一个读取器将内容读出来,按照大写的方式或者小写的方式
 */
public class Test5 {

}
