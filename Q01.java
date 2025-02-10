import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPessoas = 0;
        int cont = 0;
        double salario, mediaSalario = 0;
        double mulheresSalario = 0;
        int idade;
        String sexo;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        double menorSalario = Double.MAX_VALUE;

        do {
            cont++;
            System.out.printf("\n=== Bem-vindo à nossa pesquisa (%d) ===\n", cont);
            
            System.out.println("Digite seu salário: ");
            salario = sc.nextDouble();
            
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida. Tente novamente.");
                break;
            }
            
            sc.nextLine(); // Consumir o caractere de nova linha
            System.out.println("Digite seu gênero (M ou F): ");
            sexo = sc.nextLine().toLowerCase();

            numPessoas++;

            if (numPessoas != 0) {
                mediaSalario += salario;
                System.out.printf("média de salários: %.2f\n", mediaSalario / numPessoas);
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
                System.out.println("A maior idade: " + maiorIdade);
            }
            if (idade < menorIdade) {
                menorIdade = idade;
                System.out.println("A menor idade: " + menorIdade);
            }

            if (sexo.equalsIgnoreCase("f") && salario <= 1500) {
                mulheresSalario++;
                System.out.printf("Quantidade de mulheres com salário até 1500: %.0f\n", mulheresSalario);
            }

            if (salario < menorSalario && (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))) {
                menorSalario = salario;
                System.out.printf("Menor salário até agora: %.2f\n", menorSalario);
                System.out.println("Sexo da pessoa com o menor salário: " + sexo);
            }
        } while (idade >= 0);

        sc.close();
    }
}