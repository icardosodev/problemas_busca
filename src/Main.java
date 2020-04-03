import busca.Largura;
import grafoCidades.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa m = new Mapa();
        Largura l = new Largura(m.getPortoUniao(), m.getCuritiba());
        l.buscar();
    }
}
