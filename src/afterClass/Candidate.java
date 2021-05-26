package afterClass;

public class Candidate {
		/*
		 * 类的四个重要概念:
		 * 1.成员变量(域,字段,属性) name;
		 * 2.成员变量访问器(getter/setter) getName /setName;
		 * 3.构造方法(构造器) Candidate;
		 * 4.普通方法
		 * 
		 * 类的方法定义顺序:构造方法>
		 * 				公有public/保护protect方法>
		 * 				私有private方法>
		 * 				getter/setter方法
		 */
		private String name;
		//private int age;
		/* 成员变量,尽量不用public修饰,用private修饰.
		 * 如果需要被子类继承,可用protected修饰.
		 * 为什么不用public?
		 * 	1.体现封装思想,将数据与行为分离
		 * 	2.封装好处
		 * 		1)隐藏类的实现细节
		 * 		2)使用者能通过事先制定的方法(getter/setter)来访问数据
		 * 		方便加入控制方法,限制对成员变量的不合理操作.
		 * 		3)便于修改,增强代码的维护性和健壮性.
		 * 		4)提高代码安全性和规范性.
		 * 		5)使程序更加具备稳定性和可拓展性.
		*/
		public Candidate(String name){
			this.name=name;
		}
		//构造方法,创建对象的必经之路,每个类都必须有一个构造方法
		public void deliverResume(){
			System.out.println("发简历");
		}
		//公有方法,调用和维护者最关心的方法
		//保护方法,模块设计模式下的核心方法
		//私有方法,只对本类可见,一般不需要特别关心
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name=name;
		}
//		public void setAge(int age){
//			if (age>=0){
//				this.age=age;
//			}
//			//为了防止出现年龄为负的错误，可以对它进行封装，也就是私有化，
//			//在 setter 方法中对年龄进行判断
//		}
		//getter/setter方法
		//setter 参数名称与成员变量名称保持一致,采用this.成员名=参数名.
}
