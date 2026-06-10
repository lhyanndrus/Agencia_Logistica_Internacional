package br.com.agencia.aeroportos;

public class Seul implements Aeroporto{
    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Internacional de Incheon";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        return 7.767 * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        return 1742;
    }
}
