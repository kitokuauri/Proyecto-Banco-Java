import java.io.Console;
import java.util.Scanner;

public class Usuario extends Persona{
	
//	constructor
	public Usuario(String nombre, String email, String contraseña) {
		super(idU++, nombre, email);
		this.contraseña = contraseña;
	}
	
	public Usuario() {};	
//	atributos
	private String contraseña;
	private static int idU = 0;
	
//	métodos
	Scanner sc = new Scanner(System.in);
	
	public Usuario registro() {
		System.out.println("Nombre de Usuario:");
		String usuario = sc.next();
		
		System.out.println("Email:");
		String email= sc.next();
		
		System.out.println("Contraseña:");
//		String contraseña= sc.next();
		
		String contaseña = leerPassword("Contraseña");
		
		return new Usuario(usuario, email, contraseña);	
	}
	
	private static String leerPassword(String mensaje) {
		StringBuilder contraseña = new StringBuilder();
		Console console = System.console();
		
		if(console == null) {
			Scanner sc = new Scanner(System.in);
			contraseña.append(sc.next());
		}
		else {
			char[] contraseñaArray = console.readPassword();
			contraseña.append(contraseñaArray);
		}
		return contraseña.toString();		
	}

}
