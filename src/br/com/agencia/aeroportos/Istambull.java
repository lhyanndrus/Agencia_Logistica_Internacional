import br.com.agencia.aeroportos.Aeroporto;
public class Istambull implements Aeroporto{
    
    public String obterNomeAeroporto(){
        return "Istanbul Airport";
    }
    
    public double calcularPrecoVoo(int quantidadePassageiros){
        return 6.020;
    }
    
    public int obterTempoVooMinutos(){
        return 360;
    }
}
