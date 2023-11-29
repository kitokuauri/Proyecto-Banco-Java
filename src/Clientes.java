import java.util.Scanner;

public class Clientes extends Persona {
	
//	constructor
	public Clientes(String nombre, String apellido, int edad, String email) {
		super(idC++,nombre,apellido,edad,email);
	}
	
	public Clientes() {};
	
//	atributos
	private static int idC = 0;
	
//	métodos
	Scanner sc = new Scanner(System.in);

	public Clientes insertarCliente() {
		System.out.println("Nombre:");
		String nombre = sc.next();
		
		System.out.println("Apellido:");
		String apellido= sc.next();
		
		System.out.println("Edad:");
		int edad= sc.nextInt();
		
		System.out.println("Email:");
		String email= sc.next();
		
		return new Clientes(nombre, apellido, edad, email);	
	}
	
	public String mostratInfo() {
		return String.format("Id: %d - %s %s, %d años, correo: %s.", this.id, this.nombre, this.apellido, this.edad, this.email);
	}

}
