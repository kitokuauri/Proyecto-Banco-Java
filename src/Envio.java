//SuperClass


public class Envio {
	
//	SuperConstructor
	public Envio(int id, String remitente, String destinatario, String fecha) {
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
	protected String fecha;
	protected int idBuscado;
	
//	métodos
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha  %s.", this.id, this.remitente, this.destinatario, this.fecha);
	}
	
}
