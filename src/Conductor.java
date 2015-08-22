
public class Conductor {

	private String nombre;
	
	private Vehiculo vehiculoConducido;
	
	public Conductor(String nombre) {
		
		this.nombre = nombre;
		this.vehiculoConducido = null;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void conducir(Vehiculo unVehiculo) {
		
		// Si yo tenía un Vehículo...
		if (this.vehiculoConducido != null) {
			
			this.vehiculoConducido.setConductor(null);
		}
		
		this.vehiculoConducido = unVehiculo;
		
		if (this.vehiculoConducido != null) {
			
			this.vehiculoConducido.setConductor(this);
		}
	}
	
	public Vehiculo getVehiculo() {
		
		return this.vehiculoConducido;
	}
}











