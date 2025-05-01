package demos;

import java.lang.reflect.Constructor;

public class CreatingInstanceDynamically {
	public static void main(String[] args) throws Exception {
		//decided at runtime
		//web server - name of servlet class - received request url
		String clname = "java.lang.String";
		Class cls = Class.forName(clname);
		Constructor con = cls.getConstructor(char[].class,int.class,int.class);
		Object obj = con.newInstance(new char[] {'w','e','l','c','o','m','e'}, 3, 4);
		String str = (String)obj;
		System.out.println(str);
	}
}
