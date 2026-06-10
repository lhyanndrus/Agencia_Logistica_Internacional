package br.com.agencia.aeroportos;

public class Londres implements Aeroporto {

    @Override
    public String obterNomeAeroporto() {
        return "Aeroporto Tenzing-Hillary (LUA)";
    }

    @Override
    public double calcularPrecoVoo(int quantidadePassageiros) {
        double taxaEmbarqueEUA = 250.00;
        double precoPassagemBase = 5500.00;

        // Custo total baseado nos passageiros
        return (precoPassagemBase + taxaEmbarqueEUA) * quantidadePassageiros;
    }

    @Override
    public int obterTempoVooMinutos() {
        // Um voo de SP para LONDRES dura cerca de 11 horas e 15 minutos (675 minutos)
        return 1500;
        /*
        * 11 * 60 = 660 + 15 = 675
        * */
    }
}
