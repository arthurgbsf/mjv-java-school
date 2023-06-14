import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    
    Cliente cliente;
    Double saldo = 0.0;
    Integer numeroConta;
    Integer numeroAgencia;
    boolean ativa=true;
    List<Transacao> transacoes = new ArrayList<>();
    
    private void incluirTransacao(Double valor, String tipo, String descricao){
        Transacao t = new Transacao();
        t.data = LocalDate.now();
        t.tipo= tipo;
        t.descricao = descricao;
        t.valor = valor;
        transacoes.add(t);
    }
   
    boolean sacar(double valor){

        if(saldo < valor){
        return false;  
        } 
        saldo -= valor;
        incluirTransacao(saldo, "Saque", "Saque em conta corrente");
        return true;

    }

    Double consultarSaldo(){
        return saldo;
    }

    List<Transacao> consultarExtrato(LocalDate di, LocalDate df){
 
    }

}
