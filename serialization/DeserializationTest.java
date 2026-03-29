import java.io.*;
import java.util.*;
class DeserializationTest{
	public static void main(String[] args)throws Exception{
		File file = new File("C:/Users/azeez/OneDrive/Desktop/Testingg/serializationTest.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try{
			while(true){
			Student s =(Student) ois.readObject();
			System.out.println(s.id+"  "+s.name);
		}
		}
		catch(Exception e){
			System.out.println("Completed...");
		}
	}
}
