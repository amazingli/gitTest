package afterClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFileReader {
	/*
	 * filePath:�ļ�·��,ʹ��protected �����ó�Ա������������Ҫ��ʱ������̳�
	 */
	protected Path filePath;
	protected BaseFileReader(Path filePath){
		this.filePath=filePath;
	}
	public List<String> readFile() throws IOException{
		//readFile()����:������ȡ�ļ�,�������ڵ��ó��󷽷�mapFileLine()--��Ҫ������չʵ�ִ�Сд
		//
		return Files.lines(filePath)
				.map(this::mapFileLine).collect(Collectors.toList());
	}
	protected abstract String mapFileLine(String Line);
}
