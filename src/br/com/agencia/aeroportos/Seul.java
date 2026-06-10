package br.com.agencia.aeroportos;

public class Seul implements Aeroporto{
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional de Incheon";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueS = 65;
        double precoPassagemBase = 7676.67;
        return (precoPassagemBase + taxaEmbarqueS) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 1742;
    }
}
