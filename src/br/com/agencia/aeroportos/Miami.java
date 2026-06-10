package br.com.agencia.aeroportos;

public class Miami implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional de Miami (MIA)";
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
        // Um voo de SP para MIAMI dura cerca de 8 horas e 20 minutos (500 minutos)
        return 500;
    }
}

