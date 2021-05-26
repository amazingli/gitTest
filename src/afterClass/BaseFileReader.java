package afterClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFileReader {
	/*
	 * filePath:文件路径,使用protected 表明该成员变量可以在需要的时候被子类继承
	 */
	protected Path filePath;
	protected BaseFileReader(Path filePath){
		this.filePath=filePath;
	}
	public List<String> readFile() throws IOException{
		//readFile()方法:用来读取文件,方法体内调用抽象方法mapFileLine()--需要子类扩展实现大小写
		//
		return Files.lines(filePath)
				.map(this::mapFileLine).collect(Collectors.toList());
	}
	protected abstract String mapFileLine(String Line);
}
