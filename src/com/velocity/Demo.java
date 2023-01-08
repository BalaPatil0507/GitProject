package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<String> li=new ArrayList<String>();
		li.add("Balaji");
		li.add("Patil");
		li.add("121");
		
		System.out.println("Below is list");
		for(String a:li)
			System.out.println(a);
	}

}
