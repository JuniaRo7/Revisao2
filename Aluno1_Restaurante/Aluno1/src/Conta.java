import java.util.ArrayList;
import java.util.Iterator;

public class Conta {
    private ArrayList<String> pedidos;
    private double valor;

    public Conta() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String prato, double valor, int quantidade){
        pedidos.add(prato);
        atualizaValor(valor*quantidade);
    }

    private void atualizaValor(double valorA){
        this.valor += valorA;
    }

    public void mostrarPratos(){
        Iterator<String> it = pedidos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public double getValor() {
        return valor;
    }
    
}