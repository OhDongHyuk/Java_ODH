package day23.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OutPutStreamEx1 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output1.txt")) {
			for(int i = 1; i <= 10; i++) {
				fos.write(i);
			}
			System.out.println("File writer success!!");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("output1.txt")) {
			int data;
			while((data = fis.read()) != -1) {
				System.out.println((int)data);
			}
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
