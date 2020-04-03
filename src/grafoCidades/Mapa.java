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
        this.portoUniao = new Cidade("Porto União", 203);
        this.pauloFrontin = new Cidade("Paulo Frontin", 172);
        this.canoinhas = new Cidade("Canoinhas", 141);
        this.irati = new Cidade("Irati", 139);
        this.palmeira = new Cidade("Palmeira", 59);
        this.campoLargo = new Cidade("Campo Largo", 27);
        this.curitiba = new Cidade("Curitiba", 0);
        this.balsaNova = new Cidade("Balsa Nova", 41);
        this.araucaria = new Cidade("Araucária", 23);
        this.saoJose = new Cidade("São José dos Pinhais", 13);
        this.contenda = new Cidade("Contenda", 39);
        this.mafra = new Cidade("Mafra", 94);
        this.tijucas = new Cidade("Tijucas do Sul", 56);
        this.lapa = new Cidade("Lapa", 74);
        this.saoMateus = new Cidade("São Mateus do Sul", 123);
        this.tresBarras = new Cidade("Três Barras", 131);

        this.portoUniao.setAdjacentes(List.of(new Adjacente(pauloFrontin, 46), new Adjacente(canoinhas, 78), new Adjacente(saoMateus, 87)));
        this.pauloFrontin.setAdjacentes(List.of(new Adjacente(portoUniao, 46), new Adjacente(irati, 75)));
        this.canoinhas.setAdjacentes(List.of(new Adjacente(pauloFrontin, 78), new Adjacente(tresBarras, 12), new Adjacente(mafra, 66)));
        this.irati.setAdjacentes(List.of(new Adjacente(pauloFrontin, 75), new Adjacente(palmeira, 75), new Adjacente(saoMateus, 57)));
        this.palmeira.setAdjacentes(List.of(new Adjacente(irati, 75), new Adjacente(saoMateus, 77), new Adjacente(campoLargo, 55)));
        this.campoLargo.setAdjacentes(List.of(new Adjacente(palmeira, 55), new Adjacente(balsaNova, 22), new Adjacente(curitiba, 29)));
        this.curitiba.setAdjacentes(List.of(new Adjacente(campoLargo, 29), new Adjacente(balsaNova, 51), new Adjacente(araucaria, 37), new Adjacente(saoJose, 15)));
        this.balsaNova.setAdjacentes(List.of(new Adjacente(curitiba, 51), new Adjacente(campoLargo, 22), new Adjacente(contenda, 19)));
        this.araucaria.setAdjacentes(List.of(new Adjacente(contenda, 18), new Adjacente(curitiba, 37)));
        this.saoJose.setAdjacentes(List.of(new Adjacente(curitiba, 15), new Adjacente(tijucas, 49)));
        this.contenda.setAdjacentes(List.of(new Adjacente(balsaNova, 19), new Adjacente(araucaria, 18), new Adjacente(lapa, 26)));
        this.mafra.setAdjacentes(List.of(new Adjacente(tijucas, 99), new Adjacente(lapa, 57), new Adjacente(canoinhas, 66)));
        this.tijucas.setAdjacentes(List.of(new Adjacente(mafra, 99), new Adjacente(saoJose, 49)));
        this.lapa.setAdjacentes(List.of(new Adjacente(saoMateus, 60), new Adjacente(contenda, 26), new Adjacente(mafra, 57)));
        this.saoMateus.setAdjacentes(List.of(new Adjacente(lapa, 60), new Adjacente(tresBarras, 43), new Adjacente(irati, 57), new Adjacente(palmeira, 77)));
        this.tresBarras.setAdjacentes(List.of(new Adjacente(saoMateus, 43), new Adjacente(canoinhas, 12)));
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
