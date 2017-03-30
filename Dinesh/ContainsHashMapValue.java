package com.Assignment8.Dinesh;

import java.util.HashMap;

public class ContainsHashMapValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<Integer, Comparable> H = new HashMap<Integer, Comparable>();
 H.put(1, "Dinesh");
 H.put(9, "kasula");
 H.put(20, "How are you");
 H.put(15, "This is Dinesh");
 System.out.println("Key 15 exists:" + H.containsKey(15));
 System.out.println("value Dinesh kasula exists:" +H.containsValue("Dinesh"));
	}

}
