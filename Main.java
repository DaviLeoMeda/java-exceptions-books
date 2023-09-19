package org.exeptions.java.books;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static final String FILE_PATH = "/Users/admin/Desktop/Boolean Screenshots & more/books_exemp/java.out";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero dei libri interni: ");
		int numLibri = Integer.valueOf(sc.nextLine());
		
		Libro [] libri = new Libro[numLibri];
		
		for(int x=0; x<numLibri; x++) {
			
			try {
				
				System.out.print("Titolo: ");
				String titolo = sc.nextLine();
			
				System.out.println("Numero Pagine: ");
				int numPagine = Integer.valueOf(sc.nextLine());
			
				System.out.println("Autore: ");
				String autore = sc.nextLine();
			
				System.out.println("Editore: ");
				String editore = sc.nextLine();
				
				Libro book = new Libro(titolo, numPagine, autore, editore);
				libri[x] = book;
			
			
			} catch (Exception e) {
			
			System.err.println("Invalid Libro data: " + e.getMessage());
			
			
			x--;
			} 
			
		}
		
		sc.close();
		
		System.out.println("\n------------------------------\n");
		
		FileWriter myWriter = null;
		
		try {
			
			myWriter = new FileWriter( FILE_PATH, true);
			
			for (int x=0; x < numLibri ; x++) {
				myWriter.write(libri[x].fullData() + "\n");
				
				System.out.println("Libro: " + (x+1));
				System.out.println("---------------------");
				System.out.println(libri[x]);
				System.out.println("");
			}
			} catch (IOException e) {
				
				System.err.println("Error updating file: " + e.getMessage());
			} finally {
				
				try {
					myWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			File tmpFile = new File(FILE_PATH);
			Scanner reader = null;
			try {
				
				reader = new Scanner(tmpFile);
				
				while (reader.hasNextLine()) {
					
					String line = reader.nextLine();
					System.out.println(line);
					}
				} catch (IOException e) {
					
					System.out.println("Error reading file= " + e.getMessage());
				} finally {
					
					if (reader != null)
						reader.close();
				}
			
		
	}
}
