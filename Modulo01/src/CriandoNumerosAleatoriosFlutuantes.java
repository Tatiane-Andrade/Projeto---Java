import java.util.Random;

public class CriandoNumerosAleatoriosFlutuantes {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        float valor = aleatorio.nextFloat() * 100;
        System.out.println("Número gerado: "+ valor);
    }

}

