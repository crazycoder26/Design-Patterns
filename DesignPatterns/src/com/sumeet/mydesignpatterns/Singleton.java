package com.sumeet.mydesignpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
	private static Singleton soleInstance  = new Singleton(); // creating a sole instance of the class.
	
/*making the constructor private to avoid 
 *creating a new instance of the class 
 *using the new keyword
 */	
	private Singleton(){
		System.out.println("creating..");
	}

// Global access point for the sole instance.
	public static Singleton getIsnstance(){
		return soleInstance;
	}
	
}

class TestClass{
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Singleton s1 = Singleton.getIsnstance();
		Singleton s2 = Singleton.getIsnstance();
		print("s1", s1);
		print("s2", s2);
		
		// Reflection
		Class clazz = Class.forName("sumeet.Mydesign.Singleton");
		Constructor<Singleton> constr = clazz.getDeclaredConstructor();
		constr.setAccessible(true);
		Singleton s3 = constr.newInstance();
		
		print("s3", s3);
	}
	
	static void print(String name, Singleton object){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, object.hashCode()));
	}
}