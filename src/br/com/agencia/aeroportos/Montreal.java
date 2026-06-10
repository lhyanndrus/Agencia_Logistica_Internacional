package br.com.agencia.aeroportos;

public class Montreal implements Aeroporto {
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional Pierre Elliott Trudeau (YUL)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueCANADA = 150.00;
        double precoPassagemBase = 3.800;

        // Custo total baseado nos passageiros
        return ((precoPassagemBase + taxaEmbarqueCANADA) * quantidadePassageiros);
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para MONTREAL dura cerca de 12 horas e 0 minutos (720 minutos)
        return 720;
    }
}
