package busca;

import grafoCidades.Adjacente;
import grafoCidades.Cidade;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class AEstrela {
    private TreeSet<Adjacente> fronteira;
    private Cidade objetivo;
    private boolean achou;
    private Queue<Cidade> caminho;

    public AEstrela(Cidade objetivo) {
        this.objetivo = objetivo;
        this.caminho = new LinkedList<>();
        this.achou = false;
    }

    public Queue<Cidade> getCaminho() {
        return caminho;
    }

    public void buscar(Cidade atual) {
        atual.setVisitado(true);
        this.caminho.add(atual);
        if (atual == this.objetivo) {
            this.achou = true;
        } else {
            fronteira = new TreeSet<>(Comparator.comparing(Adjacente::getDistanciaAEstrela));
            for (Adjacente a: atual.getAdjacentes()) {
                if (!a.getCidade().isVisitado()) {
                    a.getCidade().setVisitado(true);
                    fronteira.add(a);
                }
            }
            buscar(fronteira.first().getCidade());
        }
    }
}
