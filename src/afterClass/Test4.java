package afterClass;
/**
 * 关于封装
 * @author tedu
 *
 */
public class Test4 {
/*
 * 默认情况下每个Java类都有空的构造方法,可以通过new 关键字利用这个构造方法创建一个	对象
 * 也可以添加带参的构造方法,但是无参构造方法会消失.
 * 
 * 使用无参构造创建的对象(引用类型)默认为null,如果是基本类型对应其默认值.
 * 访问权限修饰符:public private protect 及 default 缺省
 * 		一个类只能用public 或者default
 * 		public:这个类可以被所有包下的类进行访问
 * 		default:可以被同一个包下的其他类进行访问
 * 		private:可以修饰类的构造方法.字段和方法,只能被当前类访问
 * 		protected:可以修饰类的构造方法,字段,方法,可以被同一包下其他类进行访问,或者当前类的子类
 */
	public static void main(String[] args) {
		Pig pig = new Pig();
		//无参构造
		Pig pigWhite = new Pig("White");
		Pig pigBlack = new Pig("Black");
		pig.eat();
		pigBlack.setColor("DeepBlack");
		System.out.println(pigBlack.getColor());
	}
}
