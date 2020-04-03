package busca;

import grafoCidades.Adjacente;
import grafoCidades.Cidade;

import java.util.LinkedList;
import java.util.Queue;

public class Largura {
    private Queue<Cidade> fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Largura(Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;
        this.achou = false;

        this.fronteira = new LinkedList<>();
        this.fronteira.add(inicio);
    }

    public void buscar() {
        Cidade primeiro = fronteira.remove();
        if (primeiro == objetivo) {
            this.achou = true;
        }
        if (achou) {
            return;
        }
        for (Adjacente a: primeiro.getAdjacentes()) {
            if (!a.getCidade().isVisitado()) {
                a.getCidade().setVisitado(true);
                fronteira.add(a.getCidade());
            }
        }
        if (!fronteira.isEmpty()) buscar();
    }
}
