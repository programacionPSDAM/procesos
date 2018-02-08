package com.iesvirgendelcarmen.process;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Procesos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
	//	System.out.println("Nº procesadores del equipo: "
	//			+ runtime.availableProcessors());
		String[] command = {"ping", "www.gogle.es", "-c2"};
		BufferedInputStream inBuffer = null;
		try {
			Process process = runtime.exec(command);
			System.out.println("Exito: " + process.waitFor());
			 inBuffer = new BufferedInputStream(
					process.getInputStream());
			int c;
			while ((c = inBuffer.read()) != -1){
				System.out.print((char) c);
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inBuffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	

}
