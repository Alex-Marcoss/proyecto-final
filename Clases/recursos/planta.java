package juego;

public class planta extends objetoMundo {

    private int fibraDisponible;

    public planta(int fibraDisponible) {
        super("Planta");
        this.fibraDisponible = fibraDisponible;
    }

    @Override
    public tipoHerramienta getHerramientaNecesaria() {
        return null;
    }

    @Override
    public Recursos recolectarRecurso() {

        if (fibraDisponible <= 0) {
            return null;
        }

        fibraDisponible--;

        return new Recursos("Fibra", 1);
    }

    @Override
    public int getEnergiaNecesaria() {
        return 1;
    }
}