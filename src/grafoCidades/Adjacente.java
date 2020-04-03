package grafoCidades;

public class Adjacente {
    private final Cidade cidade;
    private final int distancia;
    private final int distanciaAEstrela;

    public Adjacente(Cidade cidade, int distancia) {
        this.cidade = cidade;
        this.distancia = distancia;
        this.distanciaAEstrela = this.cidade.getDistanciaObjetivo() + this.distancia;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getDistanciaAEstrela() {
        return distanciaAEstrela;
    }
}
