package br.com.agencia.aeroportos;

public interface Aeroporto {
    String obterNomeAeroporto();
    double calcularPrecoVoo(int quantidadePassageiros); // Cada país tem sua taxa de embarque e custo por km
    int obterTempoVooMinutos(); // Tempo estimado de voo saindo de São Paulo (GRU)
}
