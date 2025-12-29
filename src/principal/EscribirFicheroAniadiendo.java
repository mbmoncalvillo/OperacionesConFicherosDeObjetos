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

public class EscribirFicheroAniadiendo {

	public static void main(String[] args) {
		// Crea una referencia al fichero con el nombre indicado
		File refFichero=new File("personas.dat");
		
		/********************
		 * FileOutputStream fileOStream=new FileOutputStream(refFichero,true) 
		 
		Abre un fichero en modo añadir (en realidad el stream del fichero)
		
		* SinCabeceraObjectOutputStream personaOStream=new SinCabeceraObjectOutputStream(fileOStream);
		
		Crea un stream para escribir objetos serializados sobre el FileOutputStream
		No escribe la cabecera del stream al inicio del fichero porque YA existe
		*/
		try (SinCabeceraObjectOutputStream personaOStream =
		         new SinCabeceraObjectOutputStream(new FileOutputStream(refFichero,true))) {

			personaOStream.writeObject(new Persona("Peio", "Laza", 100));
			

		} catch (IOException e) {
		    System.out.println("Error de escritura: " + e.getMessage());
		}
		
		
		
	}
}
