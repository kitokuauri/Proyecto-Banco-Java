
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gestores extends Persona implements Interfaz{
	
	List<Gestores> listaGestores = new ArrayList<Gestores>();
	
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
	


	public void insertar() {
		System.out.println("Nombre:");
		nombre = sc.next();
		
		System.out.println("Apellido:");
		apellido= sc.next();
		
		System.out.println("Edad:");
		edad= sc.nextInt();
		
		System.out.println("Email:");
		email= sc.next();
		
		Gestores gestor = new Gestores(nombre, apellido, edad, email, 1200.0);	
		
		listaGestores.add(gestor);
		System.out.println("Gestor añadido correctamente");
	}
	
	public Gestores insertarGestorAleatorio() {
		return new Gestores();
	}
	
	public void insertarVariosAl() {
		for(int i=0;i<4;i++) {
            listaGestores.add(insertarGestorAleatorio());
        	}
    	System.out.println("Gestores aleatorios añadidos correctamente");
	}
	
	public void obtener() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
    		Gestores gestorEscogido = listaGestores.get(idBuscado);
    		System.out.println(gestorEscogido.mostrarInfo());
    	}
    	else {
    		System.out.println("El gestor escogido no existe.");
    	}
	}
	
	public void obtenerTodos() {
		if(listaGestores.isEmpty()) {
    		System.out.println("No existe ningún gestor.");
    	} else {
    		for(Gestores todosGestores:listaGestores) {
            	System.out.println(todosGestores.mostrarInfo());
            }
    	}
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - %s %s, %d años, correo: %s, salario: %.2f €.", this.id, this.nombre, this.apellido, this.edad, this.email, this.salario);
	}
	
	public void actualizar() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
    		Gestores gestorEscogido = listaGestores.get(idBuscado);
    		
    		System.out.println("Nombre:");
    		nombre = sc.next();
    		gestorEscogido.setNombre(nombre);
    		
    		System.out.println("Apellido:");
    		apellido= sc.next();
    		gestorEscogido.setApellido(apellido);
    		
    		System.out.println("Edad:");
    		edad= sc.nextInt();
    		gestorEscogido.setEdad(edad);
    		
    		System.out.println("Email:");
    		email= sc.next();
    		gestorEscogido.setEmail(email);
    		
    		System.out.println("Gestor actualizado correctamente.");
    		
    	}
    	else {
    		System.out.println("El gestor escogido no existe.");
    	}
	}
	
	public void eliminar() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
    		Gestores gestorEscogido03 = listaGestores.get(idBuscado);
    		listaGestores.remove(gestorEscogido03);
            System.out.println("Gestor eliminado correctamente.");
    	}
    	else {
    		System.out.println("El gestor escogido no existe.");
    	}
	}
	
	


	
}
