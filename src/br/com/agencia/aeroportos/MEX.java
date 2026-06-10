package br.com.agencia.aeroportos;

public class MEX implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional da Cidade do México";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueMEX = 330;
        double precoPassagemBase = 1.900;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueMEX) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 550;
    }
}
