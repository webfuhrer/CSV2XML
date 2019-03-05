package paquetecsvxml;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		ArrayList<Contacto> lista_contactos=AccesoFichero.leerContactos();
		String xml=CreadorXML.crear(lista_contactos);
		System.out.println(xml);
	}

}
