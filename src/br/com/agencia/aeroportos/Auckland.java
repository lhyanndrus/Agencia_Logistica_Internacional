package br.com.agencia.aeroportos;

public class Auckland implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Auckland Airport (AKL)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 250.00;
        double precoPassagemBase = 10500.00;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para Auckland dura cerca de 20 horas e 0 minutos (1500 minutos)
        return 1200;
    }
}