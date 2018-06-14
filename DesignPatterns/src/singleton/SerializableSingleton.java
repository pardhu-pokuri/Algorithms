package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	private static final long serialVersionUID = 591003291829653265L;
	
	private static class SingletonHelper{
		private static final SerializableSingleton instance = new SerializableSingleton();
	}
	
	public static SerializableSingleton getInstance(){
		return SingletonHelper.instance;
	}
	
/*	protected Object readResolve(){
		return getInstance();
	}*/
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializableSingleton instanceOne = SerializableSingleton.getInstance();
		
		File file = new File("obj.ser");
		FileOutputStream fs = new FileOutputStream(file);
		ObjectOutputStream outputStream = new ObjectOutputStream(fs);
		outputStream.writeObject(instanceOne);
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
		SerializableSingleton instanceTwo = (SerializableSingleton) inputStream.readObject();
		inputStream.close();
		
		System.out.println(instanceOne == instanceTwo);
		System.out.println(instanceOne);
		System.out.println(instanceTwo);
		
		if(file.exists()){
			file.delete();
		}
	}
}
