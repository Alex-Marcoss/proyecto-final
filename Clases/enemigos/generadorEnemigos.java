package Juego;

public class GeneradorEnemigos {

    public Enemigo generar(CicloDia ciclo) {

        if (!ciclo.esNoche()) {
            System.out.println("Es de día. No aparecen enemigos.");
            return null;
        }

        int numero = (int)(Math.random() * 2);

        if (numero == 0) {
            return new Lobo();
        } 
        else {
            return new Araña();
        }
    }
}