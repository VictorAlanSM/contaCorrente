import java.util.Scanner;

public class ContaCorrente {
    public static void extrato(String nome, String tipoConta, double saldo) {
        System.out.println("**********************************");
        System.out.println("Dados do cliente: \n");
        System.out.println("Nome        : " + nome);
        System.out.println("Tipo conta  : " + tipoConta);
        System.out.println("saldo conta : " + saldo);
        System.out.println("**********************************");
    }
    public static void main(String[] args) {

        /*
        1 - ver saldo
        2 - depositar ou receber transferencia
        3 - sacar
        4 - sair
         */
        Scanner leitor = new Scanner(System.in);
        String nome = "Alan";
        String tipoConta = "Corrente";
        String enun = """
                1 - ver saldo
                2 - depositar ou receber transferencia
                3 - sacar
                4 - sair
                """;
        double saldo = 2000;
        boolean condicao = true;
        int caso = 0;


        System.out.println("**********************************");
        System.out.println("Dados do cliente: \n");
        System.out.println("Nome        : " + nome);
        System.out.println("Tipo conta  : " + tipoConta);
        System.out.println("saldo conta : " + saldo);
        System.out.println("********************************** \n");

        while (condicao){
            System.out.println("Qual operação deseja realizar?");
            System.out.println(enun);
            caso = leitor.nextInt();
            while (caso != 1 && caso != 2 && caso != 3 && caso != 4){
                System.out.println("Operação inválida!");
                System.out.println("Digite novamente.");
                System.out.println(enun);
                caso = leitor.nextInt();
            }
            switch (caso){
                case 1:
                    extrato(nome, tipoConta, saldo);
                    break;
                case 2:
                    System.out.println("Você escolheu 'Depositar'.");
                    System.out.println("Digite o valor que deseja depositar: ");
                    saldo += leitor.nextDouble();
                    extrato(nome, tipoConta, saldo);
                    break;
                case 3:
                    System.out.println("Você escolheu 'Sacar'.");
                    System.out.println("Digite o valor que deseja sacar: ");
                    saldo -= leitor.nextDouble();
                    extrato(nome, tipoConta, saldo);
                    break;
                case 4:
                    System.out.println("Obrigado por usar confiar em nós. Até logo!");
                    condicao = false;
                default:
            }
        }
    }


}


