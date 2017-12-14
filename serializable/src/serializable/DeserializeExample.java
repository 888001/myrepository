package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {

	public static void main(String[] args) throws Exception, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SerializaExample.out_file));
		String title = (String) ois.readObject();
		System.out.println(title);
		People people = (People) ois.readObject();
		System.out.println(people);
		
	}

}
