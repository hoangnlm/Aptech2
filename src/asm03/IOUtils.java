/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm03;

/**
 *
 * @author Hoang
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
//	 ghi du lieu Student duoi dang data stream
	public static void writeStudentByDataStream(String path, List<Student> countries) throws IOException {
		// Buoc 1: mo stream
		DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));

		// Buoc 2: ghi file
		for (Student country : countries) {
//			dataOutputStream.writeUTF(country.getName());
//			dataOutputStream.writeLong(country.getPopulation());
//			dataOutputStream.writeDouble(country.getArea());
		}

		// Buoc 3: dong stream
		dataOutputStream.close();

	}

	// Doc file tu DataStream
	public static List<Student> readStudentByDataStream(String path) throws IOException {
		// List<HocVien> countries = null; //Phai check if !=null khi dung
		List<Student> countries = new ArrayList<>(); // Cach nay khong kiem tra
														// !=null

		// Buoc 1: mo stream
		DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));

		// Buoc 2: doc file
		try {
			while (true) {
				String name = dataInputStream.readUTF();
				long pop = dataInputStream.readLong();
				double area = dataInputStream.readDouble();
				countries.add(new Student());
			}
		} catch (Exception e) { // Khi da doc het file se quang roi
									// EOFException
			System.out.println("het file");
		}

		// Buoc 3: dong stream
		dataInputStream.close();

		return countries;
	}

	// Viet du lieu tu ObjectStream
	public static void writeStudentByObjectStream(String path, List<Student> countries) throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(path)));
		for (Student country : countries) {
			objectOutputStream.writeObject(country);
		}
		objectOutputStream.close();
	}

	// Doc du lieu tu ObjectStream
	public static List<Student> readStudentByObjectStream(String path) throws IOException, ClassNotFoundException {
		List<Student> countries = new ArrayList<>();
		ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));

		try {
			while (true) {
				countries.add((Student) objectInputStream.readObject());
			}
		} catch (EOFException e) {
			System.out.println("het file");
		}

		objectInputStream.close();

		return countries;
	}
	
}

class HocVien{
	
}
