import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam {
	
	public static void eq(String s1, String s2) {
		System.out.println(s1==s2);
	}
	public static void main(String[] args) {
		String a = "1";
		Map<String, String> map = new HashMap<String, String>();
		map.put("s","1");
		
		
		String b = "s";
		eq(a,map.get(b));
		
		Iterator<String> it = map.keySet().iterator();
		String key = it.next();
		eq(key,b);
		
		String[] arr = {"1","s"};
		eq(arr[1],key);
		eq(arr[0],a);
	}
}


