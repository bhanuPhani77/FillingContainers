package com.singleton;

/*Singleton design pattern ensures that only 
 * one instance of a class is created and 
 * provides global access to that instance.
 * 
 *  the Singleton class has a private static instance variable, 
 *  which is the single instance of the class. 
 *  The constructor is private to prevent direct instantiation from other classes.*/

/*
 * getInstance() method is used to retrieve the singleton instance. 
 * It checks if the instance is null and creates a new instance if it hasn't been initialized yet. 
 * To ensure thread-safety, the method is synchronized and a double-checked
 *  locking mechanism is implemented.
 *  You can use the getInstance() method to access the singleton instance and call its methods, 
 *  such as doSomething():*/

public class Singleton {
	// Private constructor to prevent instantiation from other classes
	private Singleton() {

	}

	private static Singleton instance;

	// Public method to get the singleton instance
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	// Other methods of the Singleton class
	public void doSomething() {
		System.out.println("Singleton instance is doing something.");
	}

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		single.doSomething();
	}
}
