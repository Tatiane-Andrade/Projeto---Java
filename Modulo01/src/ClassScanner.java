
        import java.util.Scanner;
    public class ClassScanner {

        public static void main(String[] args) {
            Scanner texto = new Scanner(System.in);
            String str;
            System.out.println("Entre com seu nome:");
            str = texto.nextLine();
            System.out.println("Bem-vindo " + str);

            System.out.println("Digite um número.");
            int numero = texto.nextInt();
            System.out.println(" O número digitado foi: " + numero);

            texto.close();
        }
}
