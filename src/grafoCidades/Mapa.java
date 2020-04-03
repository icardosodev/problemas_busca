package grafoCidades;

import java.util.List;

public class Mapa {
    private Cidade portoUniao;
    private Cidade pauloFrontin;
    private Cidade canoinhas;
    private Cidade irati;
    private Cidade palmeira;
    private Cidade campoLargo;
    private Cidade curitiba;
    private Cidade balsaNova;
    private Cidade araucaria;
    private Cidade saoJose;
    private Cidade contenda;
    private Cidade mafra;
    private Cidade tijucas;
    private Cidade lapa;
    private Cidade saoMateus;
    private Cidade tresBarras;

    public Mapa() {
        this.portoUniao = new Cidade("Porto União");
        this.pauloFrontin = new Cidade("Paulo Frontin");
        this.canoinhas = new Cidade("Canoinhas");
        this.irati = new Cidade("Irati");
        this.palmeira = new Cidade("Palmeira");
        this.campoLargo = new Cidade("Campo Largo");
        this.curitiba = new Cidade("Curitiba");
        this.balsaNova = new Cidade("Balsa Nova");
        this.araucaria = new Cidade("Araucária");
        this.saoJose = new Cidade("São José dos Pinhais");
        this.contenda = new Cidade("Contenda");
        this.mafra = new Cidade("Mafra");
        this.tijucas = new Cidade("Tijucas do Sul");
        this.lapa = new Cidade("Lapa");
        this.saoMateus = new Cidade("São Mateus do Sul");
        this.tresBarras = new Cidade("Três Barras");

        this.portoUniao.setAdjacentes(List.of(new Adjacente(pauloFrontin), new Adjacente(canoinhas), new Adjacente(saoMateus)));
        this.pauloFrontin.setAdjacentes(List.of(new Adjacente(portoUniao), new Adjacente(irati)));
        this.canoinhas.setAdjacentes(List.of(new Adjacente(pauloFrontin), new Adjacente(tresBarras), new Adjacente(mafra)));
        this.irati.setAdjacentes(List.of(new Adjacente(pauloFrontin), new Adjacente(palmeira), new Adjacente(saoMateus)));
        this.palmeira.setAdjacentes(List.of(new Adjacente(irati), new Adjacente(saoMateus), new Adjacente(campoLargo)));
        this.campoLargo.setAdjacentes(List.of(new Adjacente(palmeira), new Adjacente(balsaNova), new Adjacente(curitiba)));
        this.curitiba.setAdjacentes(List.of(new Adjacente(campoLargo), new Adjacente(balsaNova), new Adjacente(araucaria), new Adjacente(saoJose)));
        this.balsaNova.setAdjacentes(List.of(new Adjacente(curitiba), new Adjacente(campoLargo), new Adjacente(contenda)));
        this.araucaria.setAdjacentes(List.of(new Adjacente(contenda), new Adjacente(curitiba)));
        this.saoJose.setAdjacentes(List.of(new Adjacente(curitiba), new Adjacente(tijucas)));
        this.contenda.setAdjacentes(List.of(new Adjacente(balsaNova), new Adjacente(araucaria), new Adjacente(lapa)));
        this.mafra.setAdjacentes(List.of(new Adjacente(tijucas), new Adjacente(lapa), new Adjacente(canoinhas)));
        this.tijucas.setAdjacentes(List.of(new Adjacente(mafra), new Adjacente(saoJose)));
        this.lapa.setAdjacentes(List.of(new Adjacente(saoMateus), new Adjacente(contenda), new Adjacente(mafra)));
        this.saoMateus.setAdjacentes(List.of(new Adjacente(lapa), new Adjacente(tresBarras), new Adjacente(irati), new Adjacente(palmeira)));
        this.tresBarras.setAdjacentes(List.of(new Adjacente(saoMateus), new Adjacente(canoinhas)));
    }


    public Cidade getPortoUniao() {
        return portoUniao;
    }

    public void setPortoUniao(Cidade portoUniao) {
        this.portoUniao = portoUniao;
    }

    public Cidade getPauloFrontin() {
        return pauloFrontin;
    }

    public void setPauloFrontin(Cidade pauloFrontin) {
        this.pauloFrontin = pauloFrontin;
    }

    public Cidade getCanoinhas() {
        return canoinhas;
    }

    public void setCanoinhas(Cidade canoinhas) {
        this.canoinhas = canoinhas;
    }

    public Cidade getIrati() {
        return irati;
    }

    public void setIrati(Cidade irati) {
        this.irati = irati;
    }

    public Cidade getPalmeira() {
        return palmeira;
    }

    public void setPalmeira(Cidade palmeira) {
        this.palmeira = palmeira;
    }

    public Cidade getCampoLargo() {
        return campoLargo;
    }

    public void setCampoLargo(Cidade campoLargo) {
        this.campoLargo = campoLargo;
    }

    public Cidade getCuritiba() {
        return curitiba;
    }

    public void setCuritiba(Cidade curitiba) {
        this.curitiba = curitiba;
    }

    public Cidade getBalsaNova() {
        return balsaNova;
    }

    public void setBalsaNova(Cidade balsaNova) {
        this.balsaNova = balsaNova;
    }

    public Cidade getAraucaria() {
        return araucaria;
    }

    public void setAraucaria(Cidade araucaria) {
        this.araucaria = araucaria;
    }

    public Cidade getSaoJose() {
        return saoJose;
    }

    public void setSaoJose(Cidade saoJose) {
        this.saoJose = saoJose;
    }

    public Cidade getContenda() {
        return contenda;
    }

    public void setContenda(Cidade contenda) {
        this.contenda = contenda;
    }

    public Cidade getMafra() {
        return mafra;
    }

    public void setMafra(Cidade mafra) {
        this.mafra = mafra;
    }

    public Cidade getTijucas() {
        return tijucas;
    }

    public void setTijucas(Cidade tijucas) {
        this.tijucas = tijucas;
    }

    public Cidade getLapa() {
        return lapa;
    }

    public void setLapa(Cidade lapa) {
        this.lapa = lapa;
    }

    public Cidade getSaoMateus() {
        return saoMateus;
    }

    public void setSaoMateus(Cidade saoMateus) {
        this.saoMateus = saoMateus;
    }

    public Cidade getTresBarras() {
        return tresBarras;
    }

    public void setTresBarras(Cidade tresBarras) {
        this.tresBarras = tresBarras;
    }
}
