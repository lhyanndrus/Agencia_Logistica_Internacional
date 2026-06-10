package br.com.agencia.aeroportos;

public class Barcelona implements Aeroporto{
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Barcelona (BAR)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueBAR = 220.00;
        double precoPassagemBase = 6000.00;

        return (precoPassagemBase + taxaEmbarqueBAR) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 0;
    }
}
