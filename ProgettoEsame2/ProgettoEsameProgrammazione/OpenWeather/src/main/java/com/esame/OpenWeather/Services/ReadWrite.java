package com.esame.OpenWeather.Services;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ReadWrite implements Serializable{
	
	public static void writeFile(Map results) {
			try {
				ObjectOutputStream file_out =new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("dati.dat"))); 
				file_out.writeObject(results);
				file_out.flush();
				file_out.close();
				System.out.println("File salvato!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	public void caricaFile(Map results) {
		try {
			ObjectInputStream file_input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("dati.dat")));
			PrintWriter ftestoOut = new PrintWriter(new FileWriter("ActualWeather.txt"));
			results=(Map) file_input.readObject();
			ftestoOut.println(results);
			ftestoOut.close();
			file_input.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

