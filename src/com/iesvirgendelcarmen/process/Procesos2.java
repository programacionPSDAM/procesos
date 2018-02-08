package com.iesvirgendelcarmen.process;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Procesos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> commands = new ArrayList<>();
		commands.add("ls");
		commands.add("-lF");
		ProcessBuilder pBuilder = new ProcessBuilder(commands);
		pBuilder.directory(new File("/home/psp/"));
		try {
			Process process = pBuilder.start();
			//System.out.println("Exito: " + process.exitValue());
			BufferedReader bReader = new BufferedReader(
					new InputStreamReader(process.getInputStream()));
			String linea;
			while ((linea = bReader.readLine()) != null){
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
