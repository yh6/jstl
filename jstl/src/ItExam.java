import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ItExam {
	
	public static void main(String[] agrs) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"123");
		map.put(2,"456");
		map.put(3,"789");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i + ":" + map.get(i)); //map.get(i)는 밸류값을 갖고옴
			
		}
		}
		
	}

