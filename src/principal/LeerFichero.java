package principal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerFichero {

	public static void main(String[] args) {
		// Crea una referencia al fichero con el nombre indicado
		File refFichero=new File("personas.dat");
		
		// Lee el fichero
		if (!refFichero.exists())
		{
			System.out.println("Fichero no existente");
		}
		else
		{
			try (FileInputStream fileIStream = new FileInputStream(refFichero);
		             ObjectInputStream personaIStream = new ObjectInputStream(fileIStream)) 
			{
				try 
				{
					while (true)
					{
						Persona aux = (Persona) personaIStream.readObject();
						System.out.println(aux);
					}
				
				} catch (EOFException eof) 
				{			 
				}

			} catch (Exception e) 
			{
				System.out.println("Error de lectura: "+e.getMessage());
			}
				
			
		}	
	}
}
