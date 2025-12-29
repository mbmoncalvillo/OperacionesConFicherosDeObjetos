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

public class SobreescribirFichero {

	public static void main(String[] args) {
		// Crea una referencia al fichero con el nombre indicado
		File refFichero=new File("personas.dat");
		
		/********************
		 * FileOutputStream fileOStream=new FileOutputStream(refFichero) 
		 
		Abre un fichero en modo escritura (en realidad el stream del fichero)
		Si el fichero existe borra su contenido
		* ObjectOutputStream personaOStream=new ObjectOutputStream(fileOStream);
		
		Crea un stream para escribir objetos serializados sobre el FileOutputStream
		Escribe automáticamente la cabecera del stream
		*/
		try (ObjectOutputStream personaOStream =
		         new ObjectOutputStream(new FileOutputStream(refFichero))) {

			personaOStream.writeObject(new Persona("Pepe", "Botella", 100));
			personaOStream.writeObject(new Persona("Pepe2", "Botell2", 1002));

		} catch (IOException e) {
		    System.out.println("Error de escritura: " + e.getMessage());
		}
		
		
		
	}
}
