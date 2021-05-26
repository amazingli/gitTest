package afterClass;

import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader{
	//子类复用--抽象类BaseFileReader类  普通方法readFile() 
	protected UppercaseFileReader(Path filePath){
		super(filePath);
	}
	protected String mapFileLine(String line){
		return line.toUpperCase();
	}
}
