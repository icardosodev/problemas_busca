package busca;

import grafoCidades.Adjacente;
import grafoCidades.Cidade;

import java.util.Stack;

public class Profundidade {
    private Stack<Cidade> fronteira;
    private Cidade inicio;
    private Cidade objetivo;
    private boolean achou;

    public Profundidade(Cidade inicio, Cidade objetivo) {
        this.inicio = inicio;
        this.inicio.setVisitado(true);
        this.objetivo = objetivo;
        fronteira = new Stack<>();
        fronteira.push(inicio);
        this.achou = false;
    }

    public void buscar() {
        Cidade topo = fronteira.peek();

        if(this.achou) {
            return;
        }
        if (topo == objetivo) {
            this.achou = true;
        }
        for (Adjacente a: topo.getAdjacentes()) {
            if (!a.getCidade().isVisitado()) {
                a.getCidade().setVisitado(true);
                fronteira.push(a.getCidade());
                buscar();
            }
        }
    }
}
