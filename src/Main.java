import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final String name="Gabriel";
    private static final String tipo="Corrente";
    private static float saldo=100.50f;

    public static void main(String[] args) {
    showClientInfo(name,tipo,saldo);
        Scanner scanner =new Scanner(System.in);
    int operation=0;
    while (operation!=-1){
        showOptions();
        operation=scanner.nextInt();
        if(operation==1){
            System.out.println("Saldo atual: "+saldo);
        } else if (operation==2) {
            System.out.println("Informe o valor a receber: ");
            saldo+=scanner.nextDouble();
            System.out.println("Saldo atualizado: "+saldo);
        } else if (operation==3) {
            System.out.println("Informe o valor a transferir: ");
            saldo-=scanner.nextDouble();
            System.out.println("Saldo atualizado: "+saldo);
        } else if (operation==4) {
            System.out.println("Saindo!!!");
            operation=-1;
        }else {
            System.out.println("Operacao invalida!");
        }
    }
    }

    private static void showOptions() {
        System.out.println("""
                Operacoes

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                Digite a operacao a ser realizada!""");
    }
    private static void showClientInfo(String nome,String tipo, float saldo) {
        System.out.println("********************************");
        System.out.println("Dados iniciais do Cliente\n\n" +
                "Nome: "+nome+"\nTipo de conta: "+tipo+"\nSaldo Inicial: "+ saldo);
        System.out.println("********************************");
    }


}