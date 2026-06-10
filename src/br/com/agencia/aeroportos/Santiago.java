package br.com.agencia.aeroportos;

public class Santiago implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional Arturo Merino Benítez (SCL)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 192;
        double precoPassagemBase = 1200;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para SANTIAGO dura cerca de 4 horas e 20 minutos (260 minutos)
        return 260;
    }
}
