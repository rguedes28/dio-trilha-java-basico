import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da agência:");
        String agencia = scan.next();

        System.out.println("Digite o número da conta:");
        int numero = scan.nextInt();
                       
       System.out.println("Digite seu nome:");
       scan.nextLine(); 
       String nomeCliente = scan.nextLine();

        System.out.println("Digite seu saldo:");
        double saldo = scan.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, a sua agencia é " 
                           + agencia + ", conta " + numero + ". Seu saldo " 
                           + saldo + " já está disponível para saque.");

        scan.close();
    }
}
