package br.com.agencia.aeroportos;

public class Roma implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional de Roma-Fiumicino Leonardo da Vinci (FCO)";
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

        return 1500;
    }
}