import busca.AEstrela;
import busca.Gulosa;
import grafoCidades.Cidade;
import grafoCidades.Mapa;

public class Main {
    public static void main(String[] args) {
        Mapa m = new Mapa();
        AEstrela ae = new AEstrela(m.getCuritiba());
        ae.buscar(m.getPortoUniao());

        for (Cidade c:ae.getCaminho()) {
            System.out.println(c.getNome());
        }
    }
}
