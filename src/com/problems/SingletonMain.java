package com.problems;

class Singleton {
	
	private static Singleton singleton_instance = null;	
	
	public String s;
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	private Singleton() {
	}	
	public static Singleton getInstance() {		
		if(singleton_instance == null) {
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
}

public class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.setS("Hello x s");
		
		System.out.println("String from x is " + x.getS());
        System.out.println("String from y is " + y.getS());
        System.out.println("String from z is " + z.getS());
        System.out.println("\n");
        
        z.s = (z.s).toUpperCase();
        
        System.out.println("String from x is " + x.getS());
        System.out.println("String from y is " + y.getS());
        System.out.println("String from z is " + z.getS());		
	}
}
