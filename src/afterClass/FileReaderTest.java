package afterClass;

import java.nio.file.Path;
import java.net.URI;
import java.net.URL;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL location = FileReaderTest.class.getClassLoader().getResource("hello.txt");
		//ClassLoader.getResource() 的方式获取到该文件的 URI 路径
		//类名.class :
		//Path path=Path.get(location.toURI());
//		BaseFileReader lowercaseFileReader = new LowercaseFileReader(path);
//		BaseFileReader uppercaseFileReader = new UppercaseFileReader(path);
//		System.out.println(lowercaseFileReader.readFile());
//		System.out.println(uppercaseFileReader.readFile());

	}

}
