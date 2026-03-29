import java.io.*;
import java.util.*;
class PropertiesStore{
	public static void main(String[] args)throws Exception{
		File file = new File("C:/Users/azeez/OneDrive/Desktop/Testingg/propCheck.txt");
		if(!file.exists())
			file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		Properties prop = new Properties();
		prop.setProperty("Name","Aziz");
		prop.setProperty("RollNo","21");
		prop.store(fos,"dataAdded");
		
		System.out.println("Data Added...");
		
	}
}
