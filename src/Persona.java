
import java.util.Random;

//SuperClass
public class Persona {
//	SuperConstructor
	public Persona(int id, String nombre, String apellido, int edad, String email) {
		this.id = id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.email=email;
	}
	
//	SuperConstructor Aleatorio
	public Persona(int id) {
		this.id=id;
		this.nombre=stringAleatorio01;
		this.apellido=stringAleatorio02;
		this.edad=intAleatorio01;
		this.email=stringAleatorio03;
	};	
	
	public Persona() {};	
	
//	SuperConstructorUsuario
	public Persona(int id, String nombre, String email) {
		this.id = id;
		this.nombre=nombre;
		this.email=email;
	}
	
	//	atributos
	Random aleatorio = new Random(); 
	
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String email;
	int intAleatorio01 = aleatorio.nextInt(100);
	
	String stringAleatorio01 = stringAleatorio();
	String stringAleatorio02 = stringAleatorio();
	String stringAleatorio03 = stringAleatorio();
	
//	metodos
	public static String stringAleatorio() {
		 
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	    return generatedString;
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - %s %s, %d años, correo: %s.", this.id, this.nombre, this.apellido, this.edad, this.email);
	}
	
//	GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


	
	

}
