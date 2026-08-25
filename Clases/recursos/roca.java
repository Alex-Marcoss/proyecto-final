package juego;

public class roca extends objetoMundo {

    private int piedraDisponible;

    public roca(int piedraDisponible) {
        super("Roca");
        this.piedraDisponible = piedraDisponible;
    }

    @Override
    public tipoHerramienta getHerramientaNecesaria() {
        return tipoHerramienta.PICO;
    }

    @Override
    public Recursos recolectarRecurso() {

        if (piedraDisponible <= 0) {
            return null;
        }

        int cantidad = (int)(Math.random() * 2) + 1;

        piedraDisponible--;

        return new Recursos("Piedra", cantidad);
    }

    @Override
    public int getEnergiaNecesaria() {
        return 3;
    }
}
