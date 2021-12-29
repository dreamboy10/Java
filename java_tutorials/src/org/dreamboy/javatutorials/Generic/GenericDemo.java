package org.dreamboy.javatutorials.Generic;

interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
    public T info;
    Person(T info){ 
    	this.info = info;
    	info.getLevel();
    }
}

public class GenericDemo {

	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = 
		new Person(new EmployeeInfo(1));
		System.out.println(p1);
    }

}
