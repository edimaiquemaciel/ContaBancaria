import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Edimaique Maciel";
        String tipoDeConta = "Corrente";
        double saldoInicial = 1600.00;
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        System.out.println("""
                           ********************************************************************
                           Dados inicias do Cliente:
                           
                           Nome:           %s
                           Tipo conta:     %s
                           Saldo Inicial:  R$ %g
                           
                           ********************************************************************
                           """.formatted(nomeCliente, tipoDeConta, saldoInicial));
        String menu = """
                      
                      ** Digite sua opção **
                      
                      1 - Consultar Saldo
                      2 - Transferir valor
                      3 - Receber valor
                      4 - Sair 
                      
                      
                      """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            double novoValor = 0;
            double novoValorRece = 0;


            switch (opcao) {
                case 1:
                    System.out.println("O saldo atualizado é: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Qual o valor que deseja transferir?");
                     novoValor = leitura.nextDouble();
                    if (novoValor > saldoInicial){
                        System.out.println("Não há saldo para realizar a transação");
                    }else {
                        saldoInicial -= novoValor;
                        System.out.println("Novo saldo: R$ "+ saldoInicial);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a receber");
                    novoValorRece = leitura.nextDouble();
                    saldoInicial += novoValorRece;
                    break;
                case 4:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }
}
