package org.dreamboy.javatutorials.Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		Collection<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
         
        //A.addAll(B);
        //A.retainAll(B);
        //A.removeAll(B);
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
	}

}
