import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);        

        Restaurante prato = new Restaurante();
        Mesa mesa = new Mesa();
        Conta conta = new Conta();

        prato.addPrato("Macarronada", 12);
        prato.addPrato("Feijoada", 10);
        prato.addPrato("Churrasco", 20);
        
        mesa.setConta(conta);
        mesa.setAberta(true);

        prato.adicionarMesa(mesa);

        conta.adicionarPedido("Macarronada", 12,2);
        conta.adicionarPedido("Feijoada", 10, 1);
        conta.adicionarPedido("Churrasco", 20, 1);

        int opcao;


        do {

            System.out.println("\nOpções: \n> Pratos (1) \n> Verificar disponibilidade de mesa (2) \n> Solicitar conta(3) \n> Finalizar(4)");
            opcao = leitor.nextInt();

            switch (opcao) {

                case 1:

                prato.procurarPrato("Macarronada");
                prato.procurarPrato("Feijoada");
                prato.procurarPrato("Churrasco");

                    break;

                case 2:

                prato.mesaIsDisponivel(mesa);
                    
                    break;

                case 3:

                prato.solicitarConta(mesa);

                    break;
            }
            
        } while (opcao!= 4);

        if(opcao ==4){
            System.out.println("\n Finalizado...");
        }

        leitor.close();
    }
}