import busca.Profundidade;
import grafoCidades.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa m = new Mapa();
        Profundidade p = new Profundidade(m.getPortoUniao(), m.getCuritiba());
        p.buscar();
    }
}
