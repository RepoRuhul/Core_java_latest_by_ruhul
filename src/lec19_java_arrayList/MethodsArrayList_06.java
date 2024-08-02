package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// not important, Use of Random class
public class MethodsArrayList_06 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		int limit = 5;
		for (int i = 0; i < limit; i++) {
			list.add(random.nextInt(1000));
			System.out.println(list.get(i));
		}

	}

}
