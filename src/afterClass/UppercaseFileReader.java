package afterClass;

import java.nio.file.Path;

public class UppercaseFileReader extends BaseFileReader{
	//���ิ��--������BaseFileReader��  ��ͨ����readFile() 
	protected UppercaseFileReader(Path filePath){
		super(filePath);
	}
	protected String mapFileLine(String line){
		return line.toUpperCase();
	}
}
