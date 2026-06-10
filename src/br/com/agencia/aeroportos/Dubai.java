package br.com.agencia.aeroportos;

public class Dubai implements Aeroporto {
    @Override
    public String obterNomeAeroporto() {
        return "Dubai International Airport (DXB)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueDubai = 350.00;
        double precoPassagemBase = 6500.00;

        // Custo total baseado nos passageiros;
        return (precoPassagemBase + taxaEmbarqueDubai) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para Dubai dura cerca de 14 horas e 30 minutos (870 minutos);
        return 870;
    }
}
