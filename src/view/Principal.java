package view;

import java.util.Arrays;
import java.util.Scanner;

import controller.Catalogo;
import model.*;

public class Principal {
	static Cuentas base = new Cuentas();
	static Scanner leer = new Scanner(System.in);
	static Catalogo notflix = new Catalogo(20);

	public static void main(String[] args) {

		inicialización();
		inicioSesion();
		menuPrincipal();

	}

	public static void inicialización() {
		notflix.add_multimedia(new Pelicula("El gato con botas 4", "Mikael Bay", 2010, 220, "Disney", "Francia"));
		notflix.add_multimedia(new Pelicula("Matrix 3", "Steven Spellber", 1974, 300, "Bethesda", "España"));
		notflix.add_multimedia(new Pelicula("El gato con botas 3", "Mikael Bay", 2003, 180, "Disney", "Estados Unidos"));
		notflix.add_multimedia(new Pelicula("El gato con botas 2", "Mikael Bay", 2001, 150, "Disney", "Estados Unidos"));
		notflix.add_multimedia(new Serie("Yu gi ohm", "Nicola Tesla", 2023, 3, 40));
		notflix.add_multimedia(new Serie("Arcane", "Harry Potter", 2020, 1, 12));
		notflix.add_multimedia(new Serie("Pedro el Gnomo", "Harrinson 4", 2000, 8, 60));
		notflix.add_multimedia(new Serie("Pokemon: New Horizons", "Pedro Picapiedra", 2020, 1, 22));
		notflix.add_multimedia(new Libro("Teo juega al LoL", "Cris Evans", 2013, "La piedra", "235534", 200));
		notflix.add_multimedia(new Libro("Como salir de la adicción", "Cris Evans", 2020, "Square Enix", "236783", 50));
		notflix.add_multimedia(new Libro("Teo va a la escuela", "Cris Evans", 2010, "La piedra", "236783", 50));
		notflix.add_multimedia(new Libro("Teo va al parque", "Cris Evans", 2011, "La piedra", "236787", 100));
		base.addCuenta(new Usuario("pepe", "1234"));
		base.addCuenta(new Usuario("Juan", "1234"));
		base.addCuenta(new Usuario("ricardo", "1234"));
		base.addCuenta(new Usuario("Lucas", "1234"));
		base.addCuenta(new Usuario("daw1", "1234"));
	}

	public static void logo() {
		System.out.println("*************************");
		System.out.println("* 	NOTFLIX 	*");
		System.out.println("*************************");
	}

	public static void inicioSesion() {
		Usuario prueba = new Usuario();
		logo();
		System.out.println("\nBienvenido a al Servicio Multimedia de Notflix" + "\n\nInicie sesion para continuar");

		System.out.print("\nNombre de usuario: ");
		prueba.setNombreUsuario(leer.nextLine());

		System.out.print("Contraseña: ");
		prueba.setContraseña(leer.nextLine());

		if (base.inicioSesion(prueba)) {
			menuPrincipal();
		} else {
			System.err.println("Nombre o contraseña no validos");
			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			inicioSesion();
		}

	}

	public static void menuPrincipal() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		logo();
		System.out.println("\n1.-Ver catalogo completo");
		System.out.println("2.-Buscador");
		System.out.println("3.-Añadir al catalogo");
		System.out.print("\n[0-Para salir] : ");
		opcMenuPrincipal();

	}

	public static void opcMenuPrincipal() {
		String opc;
		opc = leer.nextLine();
		switch (opc) {
		case "1" -> { fullList(); break;}
		case "2" -> { search(); break;}
		case "3" -> { add(); break; }
		default -> {
			System.err.println("No es una opción valida");
			menuPrincipal();
		}
		}
	}

	private static void add() {
		System.out.println("\n¿Que quieres añadir?\n1.-Libro \n2.-Película \n3.-Serie ");
		opcadd();
	}

	private static void opcadd() {
		String opc;
		opc = leer.nextLine();
		switch (opc) {
		case "1" -> {
			addLibro();
			break;
		}
		case "2" -> {
			addPelicula();
			break;
		}
		case "3" -> {
			addSerie();
			break;
		}
		default -> {
			System.err.println("No es una opción valida");
			add();
		}
		}
	}

	private static void addLibro() {
		Libro l = new Libro();
		System.out.print("Título: ");
		l.setTitulo(leer.nextLine());
		System.out.print("Autor: ");
		l.setCreador(leer.nextLine());
		System.out.print("Año estreno: ");
		l.setAnoE(Integer.parseInt(leer.nextLine()));
		System.out.print("Editorial: ");
		l.setEditorial(leer.nextLine());
		System.out.print("ISBN: ");
		l.setISBN(leer.nextLine());
		System.out.print("Número de paginas: ");
		l.setNumPag(Integer.parseInt(leer.nextLine()));
		notflix.add_multimedia(l);
		System.out.print("\n\nSe ha agregado con exito\nPulse Enter para volver");
		leer.nextLine();
		
	}

	private static void addPelicula() {
		Pelicula p = new Pelicula();
		System.out.print("Título: ");
		p.setTitulo(leer.nextLine());
		System.out.print("Autor: ");
		p.setCreador(leer.nextLine());
		System.out.print("Año estreno: ");
		p.setAnoE(Integer.parseInt(leer.nextLine()));
		System.out.print("Duracion(en minutos): ");
		p.setDuracion(Integer.parseInt(leer.nextLine()));
		System.out.print("Productora: ");
		p.setProductora(leer.nextLine());
		System.out.print("País: ");
		p.setPais(leer.nextLine());
		notflix.add_multimedia(p);
		System.out.print("\n\nSe ha agregado con exito\nPulse Enter para volver");
		leer.nextLine();
		
	}

	private static void addSerie() {
		Serie s = new Serie();
		System.out.print("Título: ");
		s.setTitulo(leer.nextLine());
		System.out.print("Autor: ");
		s.setCreador(leer.nextLine());
		System.out.print("Año estreno: ");
		s.setAnoE(Integer.parseInt(leer.nextLine()));
		System.out.print("Número de temporadas: ");
		s.setTemporadas(Integer.parseInt(leer.nextLine()));
		System.out.print("Número de capitulos: ");
		s.setNumCap(Integer.parseInt(leer.nextLine()));
		notflix.add_multimedia(s);
		System.out.print("\n\nSe ha agregado con exito\nPulse Enter para volver");
		leer.nextLine();
		
	}

	private static void search() {
		String busqueda;
		System.out.print("Buscar: ");
		busqueda = leer.nextLine();
		searcher(busqueda);

	}

	private static void searcher(String busqueda) {
		for(int i=0; i<notflix.getCatalogo().length; i++) {
			if(notflix.getCatalogo(i)!= null){
				if(notflix.getCatalogo(i).getTitulo().contains(busqueda)) {
				System.out.println(notflix.getCatalogo(i));
				}
			}
		}
		System.out.print("\n\nPulse Enter para volver");
		leer.nextLine();
		menuPrincipal();
	}

	private static void fullList() {
		System.out.println(notflix);
		System.out.print(
				"\n Ordenar por:" + "\n1.-ID " + "\n2.-Título" + "\n3.-Año de estreno " + "\n [0.-Para volver] : ");
		opcfullList();
	}

	private static void opcfullList() {
		String opc;
		opc = leer.nextLine();
		switch (opc) {
		case "1" -> {
			ordenarID();
			break;
		}
		case "2" -> {
			ordenarTitulo();
			break;
		}
		case "3" -> {
			ordenarEstreno();
			break;
		}
		case "0" -> menuPrincipal();
		default -> {
			System.err.println("No es una opción valida");
			opcfullList();
		}
		}
	}

	private static void ordenarEstreno() {
		notflix.ordenar_por_anyo();
		fullList();
	}

	private static void ordenarTitulo() {
		notflix.ordenar_por_titulo();
		fullList();
	}

	private static void ordenarID() {
		notflix.ordenar_por_id();
		fullList();
	}

}
