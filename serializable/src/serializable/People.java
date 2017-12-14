package serializable;

import java.io.Serializable;

public class People implements Serializable {

	/** 
	*/
	private static final long serialVersionUID = 7374506274977682687L;
	public People(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
