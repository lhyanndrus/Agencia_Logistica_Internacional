package br.com.agencia.aeroportos;

public class Lukla implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Tenzing-Hillary (LUA)";
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
        // Um voo de SP para LUKLA dura cerca de 25 horas e 0 minutos (1500 minutos)
        return 1500;
    }
}
