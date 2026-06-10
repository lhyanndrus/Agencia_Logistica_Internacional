package br.com.agencia.aeroportos;

public class Toquio implements  Aeroporto{

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional de Tóquio / Aeroporto de Haneda  (HND)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 150.00;
        double precoPassagemBase = 9000.00;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para LUKLA dura cerca de 25 horas e 0 minutos (1500 minutos)
        return 1300;
    }
}