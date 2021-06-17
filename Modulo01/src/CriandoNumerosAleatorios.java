import java.util.Random;

public class CriandoNumerosAleatorios {

    public static void main(String[] args) {
    Random aleatorio = new Random();
    int valor = aleatorio.nextInt();
    System.out.println("Número gerado: "+ valor);
    }

}
