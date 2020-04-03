package busca;

import grafoCidades.Adjacente;
import grafoCidades.Cidade;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Gulosa {
    private TreeSet<Cidade> fronteira;
    private Queue<Cidade> caminho;
    private Cidade objetivo;
    private boolean achou;

    public Gulosa(Cidade objetivo) {
        this.objetivo = objetivo;
        this.caminho = new LinkedList<>();
    }

    public Queue<Cidade> getCaminho() {
        return caminho;
    }

    public void buscar(Cidade atual) {
        atual.setVisitado(true);
        this.caminho.add(atual);

        if (atual == objetivo) {
            this.achou = true;
        } else {
            fronteira = new TreeSet<>(Comparator.comparing(Cidade::getDistanciaObjetivo));
            for (Adjacente a: atual.getAdjacentes()) {
                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.add(a.getCidade());
                }
            }
            buscar(fronteira.first());
        }
    }
}
