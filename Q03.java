import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeFuncionarios = 0;
        double salarioBruto, salarioTotal, impostoRenda = 0.0, inss = 0.0, planoSaude;

        do {
            System.out.println("Insira o salário bruto aqui: ");
            salarioBruto = sc.nextDouble();

            // Desconto fixo plano de saúde
            planoSaude = (salarioBruto * 4.5) / 100;

            // IMPOSTO DE RENDA
            if (salarioBruto <= 1903.98) {
                impostoRenda = 0.0;
                System.out.println("Desconto do imposto de renda para esse funcionário: --\n");
            } else if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
                impostoRenda = (salarioBruto * 7.5) / 100;
            } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
                impostoRenda = (salarioBruto * 15) / 100;
            } else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
                impostoRenda = (salarioBruto * 22.5) / 100;
            } else if (salarioBruto > 4664.68) {
                impostoRenda = (salarioBruto * 27.5) / 100;
            }

            // DESCONTO INSS
            if (salarioBruto <= 1693.72) {
                inss = (salarioBruto * 8) / 100;
            } else if (salarioBruto >= 1693.73 && salarioBruto <= 2822.90) {
                inss = (salarioBruto * 9) / 100;
            } else if (salarioBruto > 2822.90) {
                inss = (salarioBruto * 11) / 100;
            }

            // Folha de pagamento
            System.out.println("\n===FOLHA DE PAGAMENTO===\n");

            salarioTotal = (salarioBruto - planoSaude - impostoRenda - inss);

            System.out.printf("[Salário total com os descontos: %.2f]\n", salarioTotal);
            System.out.printf("[IMPOSTO DE RENDA: %.2f]\n", impostoRenda);
            System.out.printf("[INSS: %.2f]\n", inss);
            System.out.printf("[PLANO DE SAUDE: %.2f]\n", planoSaude);

            quantidadeFuncionarios++;
        } while (quantidadeFuncionarios < 58);

        sc.close();
    }
}