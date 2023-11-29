//SuperClass
public class Envio {
	
//	SuperConstructor
	public Envio(int id, String remitente, String destinatario, int fecha) {
		this.id=id;
		this.remitente=remitente;
		this.destinatario=destinatario;
		this.fecha=fecha;
	}
	
	public Envio() {};
	
//	atributos
	protected int id;
	protected String remitente;
	protected String destinatario;
	protected int fecha;
	
//	métodos
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha  %d.", this.id, this.remitente, this.destinatario, this.fecha);
	}
	
}
