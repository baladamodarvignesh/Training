/**
 * 
 */
package samplePrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

/**
 * @author balavign
 *
 */
public class FileSample {

	private static Scanner sc;

	public static List<Student> readDataFromFileExample() throws IOException, ClassNotFoundException {
		List<Student> students = null;
		File fileObj = new File("C://files//Student1.txt");

		if (!fileObj.exists()) {
			System.out.println("File Doesnot exist. Please create one.");
		} else {
			FileInputStream fin = new FileInputStream(fileObj);
			sc = new Scanner(fin);
			while (sc.hasNextLine()) {
				String fileString = sc.nextLine();
				format(fileString);
			}

		}
		sc.close();
		return students;
	}

	private static void format(String fileString) {
		String[] student = fileString.split(",");
		for (String s : student) {
			String[] values = s.split(";");
			System.out.println("Id: " + values[0] + " " + "Name: " + values[1]);
		}

	}

	public static void saveDataToFileExample(Student student) throws IOException {
		File fileObj = new File("C://files//Student1.txt");
		if (fileObj.createNewFile()) {
			System.out.println("New File Created");
		} else {
			System.out.println("File already exists");
		}
		Writer fout = new FileWriter(fileObj);
		BufferedWriter bw = new BufferedWriter(fout);
		bw.append(student.toString());
		bw.close();
	}

}
