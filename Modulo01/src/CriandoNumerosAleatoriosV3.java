import java.util.Random;

public class CriandoNumerosAleatoriosV3 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(30) + 1;
        System.out.println("Número gerado: "+ valor);
    }

}

