
public class Vehiculo {

	private String patente;

	private Conductor conductor;
	
	public Vehiculo(String patente) {
		
		this.patente = patente;
		this.conductor = null;
	}
	
	public String getPatente() {
		
		return this.patente;
	}
	
	public void setConductor(Conductor conductor) {
		
		// Si me estaba conduciendo alguien, Y no es el mismo que me conducía...
		if (this.conductor != null && this.conductor != conductor) {
			
			this.conductor.conducir(null);
		}
		
		this.conductor = conductor;
	}
	
	public Conductor getConductor() {
		
		return this.conductor;
	}
	
}









