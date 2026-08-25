package juego;

public class principal {

    public static void main(String[] args) {

        // -----------------------------
        // Crear jugador
        // -----------------------------

        Jugador jugador = new Jugador("Facu");


        // -----------------------------
        // Agregar recursos al inventario
        // -----------------------------

        Recursos madera = new Recursos("Madera", 5);
        Recursos piedra = new Recursos("Piedra", 3);

        jugador.inventario.agregarRecurso(madera, madera.getCantidad());
        jugador.inventario.agregarRecurso(piedra, piedra.getCantidad());


        // -----------------------------
        // Crear ingredientes
        // -----------------------------

        Ingrediente ingredienteMadera =
                new Ingrediente("Madera", 3);

        Ingrediente ingredientePiedra =
                new Ingrediente("Piedra", 2);


        // -----------------------------
        // Crear array de ingredientes
        // -----------------------------

        Ingrediente[] ingredientesHacha = {
            ingredienteMadera,
            ingredientePiedra
        };


        // -----------------------------
        // Crear receta
        // -----------------------------

        Hacha hacha = new Hacha(100, 10);

        Receta recetaHacha =
                new Receta(hacha, ingredientesHacha);


        // -----------------------------
        // Mostrar inventario
        // -----------------------------

        jugador.mostrarInventario();


        // -----------------------------
        // Comprobar si puede fabricar
        // -----------------------------

        if (recetaHacha.puedeCrear(jugador.inventario)) {

            System.out.println("Puede fabricar el hacha.");
            System.out.println("\n--- FABRICANDO ---");

            jugador.fabricar(recetaHacha);

            jugador.mostrarInventario();

        } else {

            System.out.println("No puede fabricar el hacha.");
        }
        
        
    }
}
