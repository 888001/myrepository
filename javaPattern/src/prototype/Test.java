package prototype;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("6", "6");
		map.put("6", null);
		map.put(null, null);
		System.out.println(map);
	}

}
