package br.com.agencia.aeroportos;

public class Sydney implements Aeroporto{

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Kingsford-Smith (SYD)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 435.00;
        double precoPassagemBase = 13000.00;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para SYDNEY dura cerca de 26 horas e 0 minutos (1560 minutos)
        return 1560;
    }
}
