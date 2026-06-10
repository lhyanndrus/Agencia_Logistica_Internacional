package br.com.agencia.aeroportos;

public class Singapura implements Aeroporto{
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto de Changi (SIN)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueSingapura = 285.00;
        double precoPassagemBase = 6800.00;

        return (precoPassagemBase + taxaEmbarqueSingapura) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 1200;
    }
}
