import java.util.*;
import java.io.*;
class Student implements Serializable{
	int id;
	String name;
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
}

class SerializationTest{
	public static void main(String[] args)throws Exception{
		Student s1 = new Student(1,"azeez");
		Student s2 = new Student(2,"bob");
		Student s3 = new Student(3,"carry");
		
		File file = new File("C:/Users/azeez/OneDrive/Desktop/Testingg/serializationTest.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
	}
}
