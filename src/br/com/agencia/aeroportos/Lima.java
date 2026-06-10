package br.com.agencia.aeroportos;

public class Lima implements Aeroporto{
    @Override
    public String obterNomeAeroporto(){ return "Aeroporto Internacional Jorge Chávez (LIM)"; }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 155.00;
        double precoPassagemBase = 1600.00;
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para LIMA dura cerca de 5 horas e 15 minutos (315 minutos)
        return 315;
    }
}
