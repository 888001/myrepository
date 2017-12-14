package serializable;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaExample {
	public static final String out_file = "f:/out_file";
	public static void main(String[] args) throws Exception, IOException {
		People people = new People("zhangsan", "18");
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(out_file))));
		oos.writeObject("用户信息");
		oos.writeObject(people);
		oos.close();
	}
}
