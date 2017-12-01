package charset;

import java.io.UnsupportedEncodingException;

public class Test {
	public static String getCode(String content, String format)
			throws UnsupportedEncodingException {
		byte[] bytes = content.getBytes(format);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			sb.append(Integer.toHexString(bytes[i] & 0xff).toUpperCase() + " ");
		}

		return sb.toString();
	}

	public static void main(String[] args) throws Exception  {
		System.out.println("gbk : " + getCode("张", "gbk"));
        System.out.println("gb2312 : " + getCode("张", "gb2312"));
        System.out.println("iso-8859-1 : " + getCode("张", "iso-8859-1"));
        System.out.println("unicode : " + getCode("张", "unicode"));
        System.out.println("utf-16 : " + getCode("张", "utf-16"));
        System.out.println("utf-8 : " + getCode("张", "utf-8"));
	}
}
