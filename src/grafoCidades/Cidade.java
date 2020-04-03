package grafoCidades;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private final String nome;
    private final int distanciaObjetivo;
    private boolean visitado;
    private List<Adjacente> adjacentes;

    public Cidade(String nome, int distanciaObjetivo) {
        this.nome = nome;
        this.distanciaObjetivo = distanciaObjetivo;
        this.visitado = false;
        this.adjacentes = new ArrayList<>();
    }

    public void addCidadeAdjacente(Adjacente cidade) {
        this.adjacentes.add(cidade);
    }

    public String getNome() {
        return nome;
    }

    public int getDistanciaObjetivo() {
        return distanciaObjetivo;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Adjacente> getAdjacentes() {
        return adjacentes;
    }

    public void setAdjacentes(List<Adjacente> adjacentes) {
        this.adjacentes = adjacentes;
    }
}
