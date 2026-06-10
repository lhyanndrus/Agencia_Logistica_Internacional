package br.com.agencia.aeroportos;

public class BuenosAires implements Aeroporto{
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional Ministro Pistarini (EZE)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueARG = 400.00;
        double precoPassagemBase = 1264.14;

        return (precoPassagemBase + taxaEmbarqueARG) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 180;
    }
}
