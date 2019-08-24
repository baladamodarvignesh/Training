/**
 * 
 */
package samplePrograms;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author balavign
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("hello world");
		
//		 fileApp();
		sort();

	}
	
	public static void sort()
	{
		List<Person> values= new ArrayList<Person>();
		values.add(new Person("bala",1.0));
		values.add(new Person("malar",1.2));
		values.add(new Person("roja",2.0));
		values.add(new Person("king",2.5));
		values.add(new Person("rog",1.0));
		
		Comparator<Person> compare= (p1,p2) -> {
			if(p1.getProductRank()!=p2.getProductRank())
			{
				return Double.compare(p1.getProductRank(), p2.getProductRank());
			}
			else
			{
				return p1.getName().compareTo(p2.getName());
			}
		} ;
		
		values.forEach(person -> {System.out.println("Person: "+person.getName()+" "+person.getProductRank());});
		
		Sorting.sortingDESC(values, compare);
		
		System.out.println("\n");
		
		values.forEach(person -> {System.out.println("Person: "+person.getName()+" "+person.getProductRank());});
		
	}

	public static void fileApp() {
		System.out.println("Student Data Management");
		int inputdata;
		do {
			System.out.println("Select the below option to proceed");
			System.out.println("1. Display the data");
			System.out.println("2. Save the Data");
			System.out.println("Any other key to exit...");
			Scanner sc = new Scanner(System.in);
			inputdata = sc.nextInt();
			switch (inputdata) {
			case 1:
				try {
					List<Student> data = FileSample.readDataFromFileExample();
					if (data != null)
						for (Student stud : data) {
							System.out.println(stud.toString());
						}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the data in this format 'id;name'");
				String studdata = sc.next();
				String[] arr = studdata.split(";");
				Student student = Student.Builder.init().setId(Integer.parseInt(arr[0])).setName(arr[1]).build();
//				List<Student> studlist = new ArrayList<Student>();
//				studlist.add(student);
				try {
					FileSample.saveDataToFileExample(student);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				return;
			}
		} while (inputdata < 3 && inputdata > 0);
		System.out.println("Thanks for using the application ");
	}

}
