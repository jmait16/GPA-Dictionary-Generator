package gpa_dictionary_generator;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map GPAs = new HashMap();
		
		String Name;
		Double GPA;
		
		System.out.print("How many people/GPAs would you like to enter? ");
		Integer i = Integer.parseInt(sc.nextLine());
		int count = 0;
		
		while (i<=0) {
			System.out.println("Goodbye");
			while (true) {}
		}
		
		while (count < i) {
			System.out.print("Enter Name: ");
			Name = sc.nextLine();
			
			System.out.print("Enter Associated GPA: ");
			GPA = Double.parseDouble(sc.nextLine());
			
			while (GPA < 0 || GPA > 4) {
				System.out.print("Please enter a valid GPA: ");
				GPA = Double.parseDouble(sc.nextLine());
			}
			
			GPAs.put(Name, GPA);
			count++;
		}
		
		System.out.println("Your GPA dictionary has been generated.");
		
		while (true) {
			System.out.println("Whose GPA would you like to view? ");
			String viewGPA = sc.nextLine();
			
			boolean validName = GPAs.containsKey(viewGPA);
			while (!validName) {
				System.out.println("Please enter a valid name: ");
				viewGPA = sc.nextLine();
				validName = GPAs.containsKey(viewGPA);
			} 
			
			System.out.println(GPAs.get(viewGPA));
		}
		
	}
}
