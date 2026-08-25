package juego;

public class Item{
	
	String nombre;
	
	public Item(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void mostrarInfo() {
	        System.out.println(nombre);
	    }

	public void agregarCantidad(int cantidad) {
        // Por defecto no hace nada, creada para que se pueda utilizar agregar cantidad en inventario
	}


	
}
