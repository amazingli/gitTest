package afterClass;

import java.util.UUID;

/**
 * 关于UUID
 * 使用场景:随机生成的文件名；
 * Java Web 应用程序的 sessionID；
 * 数据库表的主键；
 * 事务 ID（UUID 生成算法非常高效，每台计算机每秒高达 1000 万次）。
 * 
 * @author tedu
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//最方便生成UUID的方式
		UUID uuid4 = UUID.randomUUID();
		int version4 = uuid4.version();
		System.out.println("UUID:"+uuid4+"  版本:"+version4);
	}
}
