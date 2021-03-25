package tema1_29;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import generatorRanom.GeneratorRandom;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("thread1.txt"); 
		File file2 = new File("thread2.txt");
		File file3 = new File("thread3.txt"); 
		boolean result;
		try {
			file1.createNewFile(); 
			file2.createNewFile(); 
			file3.createNewFile(); 
		} catch (IOException e) {
			e.printStackTrace(); 
		}
		
		
		Thread newThread1 = new Thread(() -> {
			try {
				FileWriter fw1 = new FileWriter(file1);
				fw1.write("number 1: " + GeneratorRandom.generareInt(100));
				fw1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		});
		newThread1.start();
		
		Thread newThread2 = new Thread(() -> {
			try {
				FileWriter fw2 = new FileWriter(file2);
				fw2.write("number 2: " + GeneratorRandom.generareInt(100));
				fw2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		newThread2.start();
		
		Thread newThread3 = new Thread(() -> {
			try {
				FileWriter fw3 = new FileWriter(file3);
				fw3.write("number 3: " + GeneratorRandom.generareInt(100));
				fw3.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		newThread3.start();

		System.out.println("End");
	}

}
