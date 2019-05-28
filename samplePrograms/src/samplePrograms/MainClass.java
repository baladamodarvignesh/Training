/**
 * 
 */
package samplePrograms;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
		
		 fileApp();

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
