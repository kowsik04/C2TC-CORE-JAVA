package Datastructures;

public class Treemap {

	public static void main(String[] args) {
		Treemap<String, Integer> courses = new Treemap<String, Integer>();
		courses.put("Core Java", 25);
		courses.put("Python", 30);
		courses.put("Hibernate", 6);
		System.out.println(courses.put("C++", 15));
		courses.put("Springboot", 15);
		System.out.println(courses.put("C++", 20));
		// courses.put(null,null); //RTE
		courses.put("HTML", null);
		// courses.put(12,66); CTE
		System.out.println("Courses are : " + courses);}}