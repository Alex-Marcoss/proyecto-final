package Juego;

public class Enemigo {

	    private String nombre;
	    private int vida;
	    private int daño;

	    public Enemigo(String nombre, int vida, int daño) {
	        this.nombre = nombre;
	        this.vida = vida;
	        this.daño = daño;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getVida() {
	        return vida;
	    }

	    public int getDaño() {
	        return daño;
	    }

	    public void recibirDaño(int cantidad) {

	        vida -= cantidad;

	        if (vida < 0) {
	            vida = 0;
	        }
	    }

	    public boolean estaVivo() {
	        if (vida > 0) {
	        	return true;
	        }
	    	return false;
	    }

	    public void mostrarEstado() {

	        System.out.println("Enemigo: " + nombre);
	        System.out.println("Vida: " + vida);
	        System.out.println("Daño: " + daño);
	    }
}
	
	

