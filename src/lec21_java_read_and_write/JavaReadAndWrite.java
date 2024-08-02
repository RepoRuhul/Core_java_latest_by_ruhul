package lec21_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadAndWrite {

	public static void main(String[] args) {
		// Creating a Folder (or file explorer)
		// for Mac user --> go to the properties of the folder --> if the folder name is below
		// Feb2024QA --> /Users/YourName/Desktop/Feb2024QA
		
		String fileExplorerPath = "C:\\Users\\Tofael\\Desktop\\Feb2024QA";
		File fileExplorer = new File(fileExplorerPath);
		fileExplorer.mkdir(); // this method will create directory or folder -- interview question
		
		if(fileExplorer.exists()) {
			System.out.println(fileExplorer.getName() + " File Explorer or Folder is created");
			
			// creating a file now
			String filePath = "C:\\Users\\Tofael\\Desktop\\Feb2024QA\\Feb.txt";
			File file = new File(filePath);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// printStackTrace() is a method which represent what exception pccurs in details
				// e.printStackTrace();
				System.out.println("The exception occured is >>>>> " + e);
			}
			
			if(file.exists()) {
				System.out.println(file.getName() + " file is created inside the File Explorer " + fileExplorer.getName());
			
				System.out.println("<-- Please write in the file about the students of Feb 2024 QA Batch -->");
				Scanner scanner = new Scanner(System.in);
				String userInput = scanner.nextLine();
				
				// how to write inside the file 41 - 49
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
					fw.write(userInput); // write () from FileWriter class-- > help to write in the file
					fw.close();					
				} catch (IOException f) {
					System.out.println("Filewriter failed to write in our file because " + f);
				}
				System.out.println("Now go to the Desktop, open the folder, then the file and see what is written in the file");
						
				// File reader from 55 - 62
				FileReader fr = null; // this is necessary for BufferedReader, bufferedReader need to know the location of file by FileReader
							
				try {
					fr = new FileReader(filePath); // FileReader read the location of the file path
					System.out.println("FileReader find the location of the path as: " + filePath);
				} catch (FileNotFoundException g) {
					g.printStackTrace();
				}
						
				BufferedReader br = null;
				String data = "";
				br = new BufferedReader(fr);
				// BufferedReader buffer the content /data of the file
				try {
					while((data=br.readLine())!=null) {
						System.out.println("The BufferedReader read the file and got:  " + data);	
					}
				} catch (IOException h) {
					h.printStackTrace();
				} finally {
					if(fr!=null) {
						fr=null; // If fr is not null, make it null, mean close the resource.
					}
					if(br!=null) {
						br=null; // If br is not null, make it null, mean close the resource.
					}
				}
			} else {
				System.out.println("Exception occured, file is not created");
			}			
		} else {
			System.out.println("File Explorer or Folder is not created");
		}

	}

}
