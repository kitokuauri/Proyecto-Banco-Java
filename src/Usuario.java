
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario extends Persona{
	
	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
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
	
	public void registro() {
		System.out.println("Nombre de Usuario:");
		String usuario = sc.next();
		
		System.out.println("Email:");
		String email= sc.next();
		
		System.out.println("Contraseña:");
		String contraseña = leerPassword("Contraseña");
		
		Usuario nuevoUsuario = new Usuario(usuario, email, contraseña);	
		
		listaUsuarios.add(nuevoUsuario);
    	System.out.println("Registro realizado con exito.");
	} 
	
	private String leerPassword(String mensaje) {
		StringBuilder contraseña = new StringBuilder();
		Console console = System.console();
		
		if(console == null) {
			contraseña.append(sc.next());
		} 
		else {
			char[] contraseñaArray = console.readPassword();
			contraseña.append(contraseñaArray);
		}
		 
		return contraseña.toString();		
	} 
	
	public void login() {
		System.out.println("Usuario:");
    	String nombre = sc.next();
    	System.out.println("Contraseña:");
    	String contraseña = sc.next();
    	
    	boolean presente = false;
    	
    	for(Usuario user : listaUsuarios) {
    		if((user.getNombre().equals(nombre)) && (user.getContraseña().equals(contraseña)) ) {
    			presente=true;
    			break;
    		}
    	}
    	if(presente) {
    		System.out.println("¡Inicio de sesión exitoso!");
    		System.out.println("Bienvenido " + nombre + ".");
    	} else {
    		System.out.println("Nombre de usuario o contraseña incorrectos.");
    	}
	}

//	GETTERS & SETTERS
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
