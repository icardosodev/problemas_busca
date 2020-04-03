import busca.Gulosa;
import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa m = new Mapa();
        Gulosa g = new Gulosa(m.getCuritiba());
        g.buscar(m.getPortoUniao());

        for (Cidade c:g.getCaminho()) {
            System.out.println(c.getNome());
        }
    }
}
