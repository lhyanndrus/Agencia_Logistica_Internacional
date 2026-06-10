package br.com.agencia.aeroportos;

public class Cairo implements Aeroporto {
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional do Cairo (CAI)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueCAI = 135.00;
        double precoPassagemBase = 2391.00;

        return (precoPassagemBase + taxaEmbarqueCAI) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 960;
    }
}
