import java.util.*;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Insira um número para verificar se é primo ou não: \n");
            numero = sc.nextInt();

            if (numero <= 1) {
                System.out.println("O número inserido não é primo. \n");
                continue;
            }

            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O número inserido é primo!\n");
            } else {
                System.out.println("O número inserido não é primo. \n");
            }

            break;
        }

        sc.close();
    }
}
