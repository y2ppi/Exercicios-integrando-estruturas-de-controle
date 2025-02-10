import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcoes;
        float n1, n2, n3, p1, p2, p3;
        
        System.out.println("\n===MENU DE OPCOES===\n");
        System.out.println("\n== Digite o número da opção ==\n");
        System.out.println("1.Média Aritmética\n");
        System.out.println("2.Média Ponderada\n");
        System.out.println("3.Sair\n");
        opcoes = sc.nextInt();

        switch (opcoes) {
            case 1:
            System.out.println("Insira a primeira nota: \n");
            n1 = sc.nextFloat();
            System.out.println("Insira a segunda nota: \n");
            n2 = sc.nextFloat();
                if(n1 < 0 && n1 > 10 || n2 < 0 && n2 > 10){
                    System.out.println("Nota inválida. Tente novamente.");
                    break;
                }
            float mediaAritmetica = ((n1+n2)/2);
            System.out.printf("Média Aritmética: %.1f\n", mediaAritmetica);

            break;

            case 2:
            System.out.println("Insira a primeira nota: \n");
            n1 = sc.nextFloat();
            System.out.println("Insira o peso dessa avaliação: \n");
            p1 = sc.nextFloat();
            System.out.println("Insira a segunda nota: \n");
            n2 = sc.nextFloat();
            System.out.println("Insira o peso dessa avaliação: \n");
            p2 = sc.nextFloat();
            System.out.println("Insira a terceira nota: \n");
            n3 = sc.nextFloat();
            System.out.println("Insira o peso dessa avaliação: \n");
            p3 = sc.nextFloat();

            float mediaPonderada = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);

            System.out.printf("Média Ponderada: %.2f\n", mediaPonderada);

            break;

            case 3:
            System.out.println("Programa encerrado!");
            break;
        }

        sc.close();
    }
}