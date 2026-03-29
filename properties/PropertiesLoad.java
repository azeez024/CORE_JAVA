import java.util.*;
import java.io.*;
class PropertiesLoad{
	public static void main(String[] args)throws Exception{
		File file = new File("C:/Users/azeez/OneDrive/Desktop/Testingg/propCheck.txt");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		for(Map.Entry<Object,Object> entry : prop.entrySet()){
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}
}
