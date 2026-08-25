package juego;

public class arbol extends objetoMundo {

    private int maderaDisponible;

    public arbol(int maderaDisponible) {
        super("Arbol");
        this.maderaDisponible = maderaDisponible;
    }

    @Override
    public tipoHerramienta getHerramientaNecesaria() {
        return tipoHerramienta.HACHA;
    }

    @Override
    public Recursos recolectarRecurso() {

        if (maderaDisponible <= 0) {
            return null;
        }

        int cantidad = (int)(Math.random() * 2) + 1;

        maderaDisponible--;

        return new Recursos("Madera", cantidad);
    }

    @Override
    public int getEnergiaNecesaria() {
        return 3;
    }
}
