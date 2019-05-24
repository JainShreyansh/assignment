package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1.	Add a method to search in sorted number array.
2.    Find whether string is palindrome or not e.g. abcba
3.    Find circular path in a link list e.g. In a-b-c-d-e-c , the circular path is c-d-e-c.
4.    Print all leaves of binary tree. You can use a Node class as mentioned below
              class Node {
               int value;
               Node left;
               Node right;
              }
              
              For e.g. Input to tree 6, 4, 8, 3, 5, 7, 9, 1.

5.  Types of Employees

Problem Statement : 
Create a class Employee to represent employees in general, 
which will have workingHours, baseSalary , vacationDays with some 
base values for e.g. 40 hours/week, 50,000.00 Rs salary, 10 days’ vacation.

Create other new classes as given below :

I.	Developer work 50% more hours per week as other employees, 
they make 10,000 more than general employees, they as much vacation as other employees.

II.	SeniorDeveloper are like normal Developer, 
but work 20% less hours per week as normal Developer and they 
make 20% more money than a normal Developer, 
they get 3 days more vacation than a normal Developer,

III.Architect work as many hours per week as other employees, 
they make 3 times more than general employees, they 
get twice as much vacation as other employees

Make sure to interact with the other classes as appropriate.
              
6 . Inventory Manager.
Problem Statement:  We have a file that contains list of items which can be repetitive
ItemName, Price, Qty
e.g. 
Banana, 25, 10
Banana, 30, 15
Mango, 100, 99
Mango, 200, 20
Banana, 25, 20
Mango, 100, 10
                             
Write following API                              
a)	add(name, price, qty) : Add item to iventory.
b)	remove (name) : Remove all items based on name
c)	remove (name, price) : Remove all item based on name, price
d)	get (name) : Get qty of all items based on name
e)	get (name, price) : : Get qty of all items based on name, price




package com.mkyong;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;

	Person() {
	};

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
}



package com.mkyong;

package com.mkyong;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterReader {

	public static void main(String[] args) {

		Person p1 = new Person("John", 30, "Male");
		Person p2 = new Person("Rachel", 25, "Female");

		try {
			FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(p1);
			o.writeObject(p2);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();

			System.out.println(pr1.toString());
			System.out.println(pr2.toString());

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


		 */
	}

}
