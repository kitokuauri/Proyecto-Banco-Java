import java.util.Random;
import java.util.Scanner;

public class Gestores extends Persona{
	
//	constructor
	public Gestores(String nombre, String apellido, int edad, String email, double salario) {
		super(idG++, nombre, apellido, edad, email);
		this.salario=salario;
	}
	
//	Gestores aleatorios
	public Gestores() {
		super(idG++);
		this.salario=intAleatorio02;
	};

//	atributos
	Random aleatorio = new Random(); 
	
	private double salario;
	private static int idG = 0;
	private double intAleatorio02 = aleatorio.nextDouble(2000.0);
	
	
	
//	métodos
	Scanner sc = new Scanner(System.in);


	public Gestores insertarGestor() {
		System.out.println("Nombre:");
		String nombre = sc.next();
		
		System.out.println("Apellido:");
		String apellido= sc.next();
		
		System.out.println("Edad:");
		int edad= sc.nextInt();
		
		System.out.println("Email:");
		String email= sc.next();
		
		return new Gestores(nombre, apellido, edad, email, 1200.0);	
	}
	
	public Gestores insertarGestorAleatorio() {
		return new Gestores();
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - %s %s, %d años, correo: %s, salario: %.2f €.", this.id, this.nombre, this.apellido, this.edad, this.email, this.salario);
	}
	
	


	
}
