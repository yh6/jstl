import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExam {
	
	public static void main(String[] agrs) {
		Set<Integer> s = new HashSet<Integer>(); //중북허용불가(밸류)
		s.add(1);
		s.add(1);
		s.add(1); //밸류값이 덮어쓰여짐
		System.out.println(s);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println(list);
		
		Set<String> sSet = new HashSet<String>();
		sSet.add("1");
		sSet.add("2");
		sSet.add("3");
	//	for(String str:sSet) {
	//		System.out.println(str);
		Iterator<String> it = sSet.iterator();  //키값을 잘 모를때(받아온값) 갖고와야할때 사용 set-iterator 갖고잇음
		while(it.hasNext()) {
			String str = it.next();
			System.out.println("it변수 값:" + str);
		}
		String s1 = it.next();
		System.out.println(s1);
		s1 = it.next();
		System.out.println(s1);
		s1 = it.next();
		System.out.println(s1);
		s1 = it.next();    //담은값이 없으면 오류 그래서 hasNaxt(다음값이있옹?잇으면 true/없으면 false)
		System.out.println(s1);   
		}
	}
//}
