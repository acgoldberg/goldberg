package hand.achao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class Four {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		//Map<Integer,Integer> m = new IdentityHashMap<Integer,Integer>();
		int[] B = new int[100];
		for(int i=0;i<B.length;i++){
			B[i] = (int)(Math.random()*100);
			l.add(B[i]);
		}
		for (int i = 0; i < B.length; i++) {
			//System.out.print(" "+B[i]);
			System.out.print(" "+l.get(i)/10);
			m.put(l.get(i)/10,l.get(i));
			if(i%10==0){System.out.println();}
		}
		System.out.println();
		 for (int key : m.keySet()) {
			   System.out.println("key= "+ key + " and value= " + m.get(key));
		 }
		 /*for (int i = 0; i < B.length; i++) {
			//System.out.print(" "+B[i]);
			System.out.print(" "+l.get(i));
			if(i%10==0){System.out.println();}
		}*/
		System.out.println();
	}
}
